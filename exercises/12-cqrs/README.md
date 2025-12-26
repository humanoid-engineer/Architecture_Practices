# 12 - CQRS (Command Query Responsibility Segregation)

Goal: Separate write model from read model.

## Run
```
javac -d out $(find exercises/12-cqrs/src/main/java -name '*.java')
java -cp out practice.cqrs.CqrsDemo
```

## Tasks
1) Add a new read model optimized for searching by customer.
2) Add validation in the command service without touching the query side.
3) Simulate eventual consistency by delaying read model updates.
