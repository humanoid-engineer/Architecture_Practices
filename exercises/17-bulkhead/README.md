# 17 - Bulkhead

Goal: Isolate resources so one subsystem can't starve another.

## Run
```
javac -d out $(find exercises/17-bulkhead/src/main/java -name '*.java')
java -cp out practice.bulkhead.BulkheadDemo
```

## Tasks
1) Add a shared queue limit per pool.
2) Add metrics for queued vs running tasks.
3) Simulate a failure in one pool and show the other still runs.
