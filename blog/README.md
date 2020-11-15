# Build
```mvn clean package && docker build -t jpollard91/blog .```

# RUN

```docker rm -f blog || true && docker run -d -p 8080:8080 -p 4848:4848 --name blog jpollard91/blog```

# System Test

Switch to the "-st" module and perform:

```mvn compile failsafe:integration-test```