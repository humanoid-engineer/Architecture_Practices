# 08 - Event-Driven Boundaries

Goal: Integrate modules via events instead of direct calls.

## Run
```
javac -d out $(find exercises/08-events/src/main/java -name '*.java')
java -cp out practice.events.EventDemo
```

## Tasks
1) Add a new subscriber that updates a read model.
2) Make the event bus async using a worker thread.
3) Add a retry policy for failed subscribers.
