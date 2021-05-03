package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.RootMenuPage;
import ru.greenatom.allure.allure.JiraIssue;

import static com.codeborne.selenide.Selenide.open;

@Tag("web")
public class ServicesMenuTest extends BaseTest {

    private RootMenuPage rootMenuPage = new RootMenuPage();
    public static final String IT_SERVICE = "Информационные технологии";
    public static final String CORPORATE_IT_SYSTEMS = "Корпоративные ИТ-системы";


    @JiraIssue("QC3-30")
    @Test
    public void checkITServiceIsAvailable() {
        open("/");
        rootMenuPage.showServices();
        rootMenuPage.openService(IT_SERVICE);
        rootMenuPage.checkServiceIsAvailable(IT_SERVICE);
    }

    @JiraIssue("QC3-30")
    @Test
    public void checkCorporateITServiceIsAvailable() {
        open("/");
        rootMenuPage.showServices();
        rootMenuPage.openService(CORPORATE_IT_SYSTEMS);
        rootMenuPage.checkServiceIsAvailable(CORPORATE_IT_SYSTEMS);
    }
}
