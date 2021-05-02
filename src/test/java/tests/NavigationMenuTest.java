package tests;

import org.junit.jupiter.api.Test;
import pages.NavigationMenuPage;

import static com.codeborne.selenide.Selenide.open;

public class NavigationMenuTest extends BaseTest {

    private NavigationMenuPage navigationMenuPage = new NavigationMenuPage();

    @Test
    public void checkClientIntegratorIsAvailable() {
        open("/");
        navigationMenuPage.showClients();
        navigationMenuPage.checkClientIntegratorExists();
    }
}
