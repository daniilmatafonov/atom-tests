package tests;

import org.junit.jupiter.api.Test;
import pages.RootMenuPage;

import static com.codeborne.selenide.Selenide.open;

public class ServicesMenuTest extends BaseTest {

    private RootMenuPage rootMenuPage = new RootMenuPage();

    @Test
    public void checkITServiceIsAvailable() {
        open("/");
        rootMenuPage.showServices();
        rootMenuPage.checkITServiceIsAvailable();
    }
}
