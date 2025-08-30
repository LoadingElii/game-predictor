#Stage 1: Buildtime
FROM maven:3.8.5-openjdk-17 AS builder
WORKDIR /app/services/game-service
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn clean package -DskipTests

#Stage 2: Runtime
FROM openjdk:17-slim
WORKDIR /app/services/game-service

COPY --from=builder /app/services/game-service/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]