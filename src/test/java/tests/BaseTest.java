package tests;

import com.codeborne.selenide.Configuration;
import config.IConfig;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static helpers.AttachmentHelper.*;

public class BaseTest {
    public static final IConfig CONFIG = ConfigFactory.create(IConfig.class, System.getProperties());
    private static final String URL = "https://greenatom.ru";

    @BeforeAll
    public static void setUp(){
        addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        Configuration.baseUrl = URL;
        Configuration.browser = CONFIG.browser();
        Configuration.browserVersion = CONFIG.browserVersion();
        if (CONFIG.remoteUrl() != null) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities = capabilities;
            Configuration.remote = CONFIG.remoteUrl();
        }
    }

    @AfterEach
    public void tearDown(){
        attachScreenshot("Last screenshot");
        attachPageSource();
        attachAsText("Browser logs", getLogs());
        if (CONFIG.videoStorage() != null)
            attachVideo();
        closeWebDriver();
    }
}
