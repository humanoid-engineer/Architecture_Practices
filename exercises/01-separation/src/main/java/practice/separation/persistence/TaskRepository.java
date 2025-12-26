package practice.separation.persistence;

import java.util.List;
import java.util.Optional;
import practice.separation.domain.Task;

public interface TaskRepository {
    void save(Task task);
    Optional<Task> findById(String id);
    List<Task> findAll();
}
