package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:${env}.properties")
public interface IConfig extends Config {

    @Key("web.browser")
    String browser();

    @Key("web.remote.driver.url")
    String remoteUrl();

    @Key("video.storage")
    String videoStorage();

    @Key("web.browser.version")
    String browserVersion();

}
