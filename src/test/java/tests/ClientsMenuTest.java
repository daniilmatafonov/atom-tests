package tests;

import org.junit.jupiter.api.Test;
import pages.RootMenuPage;

import static com.codeborne.selenide.Selenide.open;

public class ClientsMenuTest extends BaseTest {

    private RootMenuPage rootMenuPage = new RootMenuPage();

    @Test
    public void checkClientIntegratorIsAvailable() {
        open("/");
        rootMenuPage.showClients();
        rootMenuPage.checkClientIntegratorIsAvailable();
    }
}
