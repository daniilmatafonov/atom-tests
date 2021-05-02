package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class NavigationMenuPage {

    @Step("Открыть раздел клиенты")
    public void showClients() {
        $("ul.navigation-root li.navigation-list-item a[href='/clients/']").click();
    }

    @Step("Проверить доступность клиента Интегратор")
    public void checkClientIntegratorExists() {
        $("a.block-clients-list[href='/clients/integrator']").shouldHave(text("Интегратор"));
    }
}
