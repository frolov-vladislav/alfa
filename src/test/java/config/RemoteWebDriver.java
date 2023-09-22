package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/remote.properties"})
public interface RemoteWebDriver  extends Config {
    @Key("remoteUrl")
    String getRemote();
}
