package tests;

import org.junit.jupiter.api.Test;
import pages.RootMenuPage;

import static com.codeborne.selenide.Selenide.open;

public class ServicesMenuTest extends BaseTest {

    private RootMenuPage rootMenuPage = new RootMenuPage();
    public static final String IT_SERVICE = "Информационные технологии";
    public static final String CORPORATE_IT_SYSTEMS = "Корпоративные ИТ-системы";


    @Test
    public void checkITServiceIsAvailable() {
        open("/");
        rootMenuPage.showServices();
        rootMenuPage.openService(IT_SERVICE);
        rootMenuPage.checkServiceIsAvailable(IT_SERVICE);
    }

    @Test
    public void checkCorporateITServiceIsAvailable() {
        open("/");
        rootMenuPage.showServices();
        rootMenuPage.openService(CORPORATE_IT_SYSTEMS);
        rootMenuPage.checkServiceIsAvailable(CORPORATE_IT_SYSTEMS);
    }
}
