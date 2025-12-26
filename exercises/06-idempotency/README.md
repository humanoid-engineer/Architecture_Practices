# 06 - Idempotency

Goal: Make retries safe by de-duplicating requests.

## Run
```
javac -d out $(find exercises/06-idempotency/src/main/java -name '*.java')
java -cp out practice.idempotency.TransferDemo
```

## Tasks
1) Persist the log to disk so retries survive restarts.
2) Add a max size to the log with eviction while keeping correctness.
3) Add a report of duplicate vs new requests.
