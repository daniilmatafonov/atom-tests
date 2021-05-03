package tests;

import org.junit.jupiter.api.Test;
import pages.RootMenuPage;

import static com.codeborne.selenide.Selenide.open;

public class PressCenterMenuTest extends BaseTest {

    private RootMenuPage rootMenuPage = new RootMenuPage();
    public static final String COMPANY_NEWS = "Новости компании";

    @Test
    public void checkCompanyNewsIsAvailable() {
        open("/");
        rootMenuPage.showPressCenter();
        rootMenuPage.checkCompanyNewsIsAvailable(COMPANY_NEWS);
    }

}
