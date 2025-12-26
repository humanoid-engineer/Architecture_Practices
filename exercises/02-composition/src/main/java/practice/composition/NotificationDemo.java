package practice.composition;

import java.util.Arrays;

public class NotificationDemo {
    public static void main(String[] args) {
        TemplateEngine engine = new TemplateEngine();
        NotificationService service = new NotificationService(
            engine,
            Arrays.asList(new EmailSender(), new SmsSender())
        );

        service.notifyUser("ava@example.com", "Hello {{name}}, your report is ready.");
    }
}
