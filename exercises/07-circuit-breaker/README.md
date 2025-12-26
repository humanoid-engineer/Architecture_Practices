# 07 - Circuit Breaker

Goal: Stop calling a failing dependency for a cooldown period.

## Run
```
javac -d out $(find exercises/07-circuit-breaker/src/main/java -name '*.java')
java -cp out practice.circuit.CircuitDemo
```

## Tasks
1) Track failure rate over a sliding window, not just consecutive failures.
2) Add a HALF_OPEN state that allows a trial call.
3) Move time to an injected `Clock` for testability.
