package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/remote.properties"})
public interface RemoteWebDriver  extends Config {
    @Key("browser")
    String getBrowser();

    @Key("version")
    String getVersion();

    @Key("remoteUrl")
    String getRemote();
}
