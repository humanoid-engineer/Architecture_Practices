package practice.config;

public class ConfigLoader {
    public AppConfig load() {
        String appName = getenvOrDefault("APP_NAME", "Inventory");
        int maxRetries = Integer.parseInt(getenvOrDefault("MAX_RETRIES", "2"));
        return new AppConfig(appName, maxRetries);
    }

    private String getenvOrDefault(String key, String defaultValue) {
        String value = System.getenv(key);
        return value == null || value.isEmpty() ? defaultValue : value;
    }
}
