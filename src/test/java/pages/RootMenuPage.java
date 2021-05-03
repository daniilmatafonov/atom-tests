package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static tests.ServicesMenuTest.CORPORATE_IT_SYSTEMS;
import static tests.ServicesMenuTest.IT_SERVICE;

public class RootMenuPage {

    @Step("Открыть раздел клиенты")
    public void showClients() {
        $("ul.navigation-root li.navigation-list-item a[href='/clients/']").click();
    }

    @Step("Открыть раздел услуги")
    public void showServices() {
        $("ul.navigation-root li.navigation-list-item a[href='/services/']").click();
    }

    @Step("Открыть страницу услуг: {serviceName}")
    public void openService(final String serviceName) {
        String linkSelector = "";
        if (serviceName.equals(IT_SERVICE)) {
            linkSelector = "/services/it-services/";
        } else if (serviceName.equals(CORPORATE_IT_SYSTEMS)) {
            linkSelector = "/services/corporate_it-systems/";
        }
        $("#additional-menu ul li a[href='" + linkSelector + "']").click();
    }

    @Step("Проверить доступность услуги {serviceName}")
    public void checkServiceIsAvailable(final String serviceName) {
        $(".main-title").shouldHave(text(serviceName));
    }

    @Step("Проверить доступность клиента {clientName}")
    public void checkClientIntegratorIsAvailable(final String clientName) {
        $("a.block-clients-list[href='/clients/integrator']").shouldHave(text(clientName));
    }
}
