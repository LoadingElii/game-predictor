#Stage 1: Buildtime
FROM maven:3.8.5-openjdk-17 AS builder
WORKDIR /app/services/eureka-server
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn clean package -DskipTests

#Stage 2: Runtime
FROM openjdk:17-slim
WORKDIR /app/services/eureka-server
COPY --from=builder /app/services/eureka-server/target/*.jar app.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "app.jar"]