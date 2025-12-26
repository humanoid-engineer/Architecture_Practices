package practice.config;

public class ConfigDemo {
    public static void main(String[] args) {
        AppConfig config = new ConfigLoader().load();
        System.out.println("App: " + config.getAppName());
        System.out.println("Max retries: " + config.getMaxRetries());
    }
}
