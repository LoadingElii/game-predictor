#Stage 1: Buildtime
FROM maven:3.8.5-openjdk-17 AS builder
WORKDIR /app/services/api-gateway
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn clean package -DskipTests

#Stage 2: Runtime
FROM openjdk:17-slim
WORKDIR /app/services/api-gateway

COPY --from=builder /app/services/api-gateway/target/*.jar app.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "app.jar"]