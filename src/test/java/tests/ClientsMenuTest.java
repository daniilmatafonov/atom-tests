package tests;

import org.junit.jupiter.api.Test;
import pages.RootMenuPage;

import static com.codeborne.selenide.Selenide.open;

public class ClientsMenuTest extends BaseTest {

    private RootMenuPage rootMenuPage = new RootMenuPage();
    private static final String INTEGRATOR_CLIENT = "Интегратор";
    private static final String NEW_BUSINESSES_CLIENT = "Новые бизнесы";

    @Test
    public void checkClientIntegratorIsAvailable() {
        open("/");
        rootMenuPage.showClients();
        rootMenuPage.checkClientIntegratorIsAvailable(INTEGRATOR_CLIENT);
    }

    @Test
    public void checkClientNewBusinessesIsAvailable() {
        open("/");
        rootMenuPage.showClients();
        rootMenuPage.checkNewBusinessesIsAvailable(NEW_BUSINESSES_CLIENT);
    }
}
