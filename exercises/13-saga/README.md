# 13 - Saga (Orchestration)

Goal: Use local steps with compensations instead of a single transaction.

## Run
```
javac -d out $(find exercises/13-saga/src/main/java -name '*.java')
java -cp out practice.saga.SagaDemo
```

## Tasks
1) Add a new step with a compensation.
2) Record each step in a saga log.
3) Add a retry for a step without repeating completed steps.
