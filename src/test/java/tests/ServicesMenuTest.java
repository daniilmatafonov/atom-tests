package tests;

import org.junit.jupiter.api.Test;
import pages.RootMenuPage;

import static com.codeborne.selenide.Selenide.open;

public class ServicesMenuTest extends BaseTest {

    private RootMenuPage rootMenuPage = new RootMenuPage();
    private static final String IT_SERVICE = "Информационные технологии";

    @Test
    public void checkITServiceIsAvailable() {
        open("/");
        rootMenuPage.showServices();
        rootMenuPage.openService(IT_SERVICE);
        rootMenuPage.checkITServiceIsAvailable(IT_SERVICE);
    }
}
