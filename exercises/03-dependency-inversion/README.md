# 03 - Dependency Inversion

Goal: High-level policy depends on abstractions, not concretes.

## Run
```
javac -d out $(find exercises/03-dependency-inversion/src/main/java -name '*.java')
java -cp out practice.di.CheckoutDemo
```

## Tasks
1) Add a `RetryingPaymentProcessor` decorator.
2) Make `CheckoutService` log transaction outcomes without knowing the logger details.
3) Add a new payment processor and swap it in the demo without changing `CheckoutService`.
