package practice.config;

public class AppConfig {
    private final String appName;
    private final int maxRetries;

    public AppConfig(String appName, int maxRetries) {
        this.appName = appName;
        this.maxRetries = maxRetries;
    }

    public String getAppName() {
        return appName;
    }

    public int getMaxRetries() {
        return maxRetries;
    }
}
