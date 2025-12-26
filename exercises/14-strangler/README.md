# 14 - Strangler Fig

Goal: Incrementally replace legacy functionality.

## Run
```
javac -d out $(find exercises/14-strangler/src/main/java -name '*.java')
java -cp out practice.strangler.RouterDemo
```

## Tasks
1) Route traffic based on a percentage rollout.
2) Add monitoring to compare legacy vs new responses.
3) Move a second endpoint to the new service.
