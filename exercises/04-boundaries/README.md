# 04 - Explicit Boundaries

Goal: Keep module internals private and expose only DTOs.

## Run
```
javac -d out $(find exercises/04-boundaries/src/main/java -name '*.java')
java -cp out practice.boundaries.api.InventoryApi
```

## Tasks
1) Add a new internal field to `ProductEntity` without changing `ProductDto`.
2) Add an API method to search by name while keeping `ProductEntity` private.
3) Add validation in the API layer, not in the entity.
