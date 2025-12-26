# 16 - API Gateway

Goal: Single entry point that aggregates multiple services.

## Run
```
javac -d out $(find exercises/16-api-gateway/src/main/java -name '*.java')
java -cp out practice.gateway.GatewayDemo
```

## Tasks
1) Add caching for a downstream call.
2) Add timeout handling for a client call.
3) Add request validation at the gateway boundary.
