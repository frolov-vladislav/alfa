package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/remote.properties"})
public interface RemoteWebDriver  extends Config {

    @Key("browserName")
    String getBrowser();

    @Key("browserVersion")
    String getVersion();

    @Key("screenSize")
    String getSize();

    @Key("remoteUrl")
    String getRemote();
}