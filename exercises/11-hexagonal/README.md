# 11 - Hexagonal Architecture (Ports & Adapters)

Goal: Keep the core independent of external implementations.

## Run
```
javac -d out $(find exercises/11-hexagonal/src/main/java -name '*.java')
java -cp out practice.hexagonal.app.CheckoutApp
```

## Tasks
1) Add a new adapter without changing the core.
2) Add a second port for notifications.
3) Add a test adapter that simulates failures.
