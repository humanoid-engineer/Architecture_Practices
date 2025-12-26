package practice.separation.domain;

import java.util.Objects;
import java.util.UUID;

public class Task {
    private final String id;
    private final String title;
    private TaskStatus status;

    public Task(String title) {
        this(UUID.randomUUID().toString(), title, TaskStatus.OPEN);
    }

    public Task(String id, String title, TaskStatus status) {
        this.id = Objects.requireNonNull(id, "id");
        this.title = Objects.requireNonNull(title, "title");
        this.status = Objects.requireNonNull(status, "status");
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void markDone() {
        this.status = TaskStatus.DONE;
    }
}
