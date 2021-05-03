package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.RootMenuPage;
import ru.greenatom.allure.allure.JiraIssue;

import static com.codeborne.selenide.Selenide.open;

@Tag("web")
public class ClientsMenuTest extends BaseTest {

    private RootMenuPage rootMenuPage = new RootMenuPage();
    private static final String INTEGRATOR_CLIENT = "Интегратор";
    private static final String NEW_BUSINESSES_CLIENT = "Новые бизнесы";

    @JiraIssue("QC3-30")
    @Test
    public void checkClientIntegratorIsAvailable() {
        open("/");
        rootMenuPage.showClients();
        rootMenuPage.checkClientIntegratorIsAvailable(INTEGRATOR_CLIENT);
    }

    @JiraIssue("QC3-30")
    @Test
    public void checkClientNewBusinessesIsAvailable() {
        open("/");
        rootMenuPage.showClients();
        rootMenuPage.checkNewBusinessesIsAvailable(NEW_BUSINESSES_CLIENT);
    }
}
