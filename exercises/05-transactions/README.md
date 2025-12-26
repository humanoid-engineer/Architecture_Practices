# 05 - Consistency + Rollback

Goal: Make operations atomic and handle failures safely.

## Run
```
javac -d out $(find exercises/05-transactions/src/main/java -name '*.java')
java -cp out practice.transactions.TransferDemo
```

## Tasks
1) Add a transaction log that records each transfer attempt.
2) Simulate a failure halfway through and ensure balances remain consistent.
3) Add a retry policy that does not duplicate a transfer.
