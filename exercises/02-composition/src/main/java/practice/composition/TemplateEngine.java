package practice.composition;

public class TemplateEngine {
    public String render(String template, String name) {
        return template.replace("{{name}}", name);
    }
}
