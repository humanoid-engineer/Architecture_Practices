# 15 - Event Sourcing

Goal: Persist events and rebuild state from them.

## Run
```
javac -d out $(find exercises/15-event-sourcing/src/main/java -name '*.java')
java -cp out practice.eventsourcing.EventSourcingDemo
```

## Tasks
1) Add a new event and update the aggregate to apply it.
2) Add snapshotting to avoid replaying all events.
3) Add validation to reject invalid event sequences.
