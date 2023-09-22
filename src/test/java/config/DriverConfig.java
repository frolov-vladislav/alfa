package config;

import org.aeonbits.owner.Config;

public interface DriverConfig extends Config {
    @Key("browser")
    String getBrowser();

    @Key("version")
    String getVersion();

    @Key("baseUrl")
    @DefaultValue("https://alfabank.ru")
    String getBaseUrl();

    @Key("remote")
    @DefaultValue("false")
    Boolean remote();
}
