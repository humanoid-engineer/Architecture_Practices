package practice.separation.service;

import java.util.List;
import java.util.Optional;
import practice.separation.domain.Task;
import practice.separation.persistence.TaskRepository;

public class TaskService {
    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public Task createTask(String title) {
        Task task = new Task(title);
        repository.save(task);
        return task;
    }

    public Optional<Task> markDone(String id) {
        Optional<Task> task = repository.findById(id);
        task.ifPresent(Task::markDone);
        return task;
    }

    public List<Task> list() {
        return repository.findAll();
    }
}
