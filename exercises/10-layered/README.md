# 10 - Layered Architecture

Goal: Separate UI, service, repository, and domain layers.

## Run
```
javac -d out $(find exercises/10-layered/src/main/java -name '*.java')
java -cp out practice.layered.ui.OrderApi
```

## Tasks
1) Add validation in the UI layer before calling the service.
2) Add a new repository implementation without changing the service.
3) Add a summary method in the service without leaking repository details.
