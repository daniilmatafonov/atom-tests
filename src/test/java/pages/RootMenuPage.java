package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class RootMenuPage {

    @Step("Открыть раздел клиенты")
    public void showClients() {
        $("ul.navigation-root li.navigation-list-item a[href='/clients/']").click();
    }

    @Step("Открыть раздел услуги")
    public void showServices(){
        $("ul.navigation-root li.navigation-list-item a[href='/services/']").click();
    }

    @Step("Проверить доступность услуги Информационные технологии")
    public void checkITServiceIsAvailable() {
        $("#additional-menu ul li a[href='/services/it-services/']").shouldHave(text("Информационные технологии"));
    }

    @Step("Проверить доступность клиента Интегратор")
    public void checkClientIntegratorIsAvailable() {
        $("a.block-clients-list[href='/clients/integrator']").shouldHave(text("Интегратор"));
    }
}
