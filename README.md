# Architecture Practice (Java)

This repo contains small, focused exercises to practice architecture principles using Java.
Each exercise is self-contained and uses only the JDK (no external libraries).

## How to run
From the repo root, compile and run an exercise like this:

```
# Example: 01-separation
javac -d out $(find exercises/01-separation/src/main/java -name '*.java')
java -cp out practice.separation.ui.TaskCli
```

You can replace the exercise path and the main class with the ones in each README.

## Exercises
- 01-separation: Separation of Concerns
- 02-composition: Single Responsibility + Composition
- 03-dependency-inversion: Dependency Inversion
- 04-boundaries: Explicit Boundaries
- 05-transactions: Consistency + Rollback
- 06-idempotency: Idempotency
- 07-circuit-breaker: Circuit Breaker
- 08-events: Event-Driven Boundaries
- 09-config: Configuration vs Code
