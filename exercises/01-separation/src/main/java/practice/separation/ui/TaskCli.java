package practice.separation.ui;

import java.util.Scanner;
import practice.separation.persistence.InMemoryTaskRepository;
import practice.separation.service.TaskService;

public class TaskCli {
    public static void main(String[] args) {
        TaskService service = new TaskService(new InMemoryTaskRepository());
        Scanner scanner = new Scanner(System.in);

        System.out.println("Task Tracker (type 'add <title>', 'list', 'done <id>', 'quit')");

        while (true) {
            System.out.print("> ");
            String line = scanner.nextLine().trim();
            if (line.equals("quit")) {
                break;
            } else if (line.startsWith("add ")) {
                String title = line.substring(4);
                System.out.println("Created: " + service.createTask(title).getId());
            } else if (line.equals("list")) {
                service.list().forEach(task ->
                    System.out.println(task.getId() + " | " + task.getStatus() + " | " + task.getTitle())
                );
            } else if (line.startsWith("done ")) {
                String id = line.substring(5);
                System.out.println(service.markDone(id).isPresent() ? "Marked done" : "Not found");
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
