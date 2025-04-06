# Use JDK 23 as base image
FROM eclipse-temurin:23-jdk

# Create directory inside the container
WORKDIR /app

# Copy the jar into the container
COPY target/CICD-Mini-Project-0.0.1-SNAPSHOT.jar app.jar

# Run the jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
