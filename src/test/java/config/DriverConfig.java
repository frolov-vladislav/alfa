package config;

import org.aeonbits.owner.Config;

public interface DriverConfig extends Config {
    @Key("browser")
    @DefaultValue("chrome")
    String getBrowser();

    @Key("version")
    @DefaultValue("116.0")
    String getVersion();

    @Key("baseUrl")
    @DefaultValue("https://alfabank.ru")
    String getBaseUrl();

    @Key("remote")
    @DefaultValue("false")
    Boolean remote();
}
