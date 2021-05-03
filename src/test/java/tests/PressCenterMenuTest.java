package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.RootMenuPage;
import ru.greenatom.allure.allure.JiraIssue;

import static com.codeborne.selenide.Selenide.open;

@Tag("web")
public class PressCenterMenuTest extends BaseTest {

    private RootMenuPage rootMenuPage = new RootMenuPage();
    public static final String COMPANY_NEWS = "Новости компании";

    @JiraIssue("QC3-30")
    @Test
    public void checkCompanyNewsIsAvailable() {
        open("/");
        rootMenuPage.showPressCenter();
        rootMenuPage.checkCompanyNewsIsAvailable(COMPANY_NEWS);
    }

}
