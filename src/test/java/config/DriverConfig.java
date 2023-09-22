package config;

import org.aeonbits.owner.Config;
@Config.Sources({"classpath:config/local.properties"})
public interface DriverConfig extends Config {

    @Key("browserName")
    String getBrowser();

    @Key("browserVersion")
    String getVersion();

    @Key("baseUrl")
    @DefaultValue("https://alfabank.ru")
    String getBaseUrl();

    @Key("remote")
    @DefaultValue("false")
    Boolean remote();

    @Key("screenSize")
    String getSize();
}