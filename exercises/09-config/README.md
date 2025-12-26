# 09 - Configuration vs Code

Goal: Keep environment-specific values outside code.

## Run
```
javac -d out $(find exercises/09-config/src/main/java -name '*.java')
APP_NAME=Billing MAX_RETRIES=3 java -cp out practice.config.ConfigDemo
```

## Tasks
1) Add a default config file that is overridden by env vars.
2) Validate config at startup and fail fast with a clear error.
3) Add a typed config object instead of passing raw strings.
