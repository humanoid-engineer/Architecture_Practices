package practice.composition;

import java.util.List;

public class NotificationService {
    private final TemplateEngine templateEngine;
    private final List<Sender> senders;

    public NotificationService(TemplateEngine templateEngine, List<Sender> senders) {
        this.templateEngine = templateEngine;
        this.senders = senders;
    }

    public void notifyUser(String user, String template) {
        String message = templateEngine.render(template, user);
        for (Sender sender : senders) {
            sender.send(user, message);
        }
    }
}
