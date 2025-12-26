# 02 - Single Responsibility + Composition

Goal: Build behavior by composing focused classes.

## Run
```
javac -d out $(find exercises/02-composition/src/main/java -name '*.java')
java -cp out practice.composition.NotificationDemo
```

## Tasks
1) Add a `PushSender` and update `NotificationService` to use it.
2) Add a new template type without changing existing sender classes.
3) Swap the template engine implementation (hint: interface).
