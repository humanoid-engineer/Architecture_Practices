# 01 - Separation of Concerns

Goal: Keep domain logic, persistence, and UI separate.

## Run
```
javac -d out $(find exercises/01-separation/src/main/java -name '*.java')
java -cp out practice.separation.ui.TaskCli
```

## Tasks
1) Add a file-backed repository that implements `TaskRepository`.
2) Make `TaskCli` choose the repository based on a simple flag or config.
3) Add a search method to `TaskService` without leaking persistence details.
