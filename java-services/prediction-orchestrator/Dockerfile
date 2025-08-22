#Stage 1: Buildtime
FROM maven:3.8.5-openjdk-17 AS builder
WORKDIR /app/services/prediction-orchestrator
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn clean package -DskipTests

#Stage 2: Runtime
FROM openjdk:17-slim
WORKDIR /app/services/prediction-orchestrator
ARG ARTIFACT_NAME
ENV ARTIFACT_NAME=${ARTIFACT_NAME}
COPY --from=build /app/services/${ARTIFACT_NAME}/target/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]