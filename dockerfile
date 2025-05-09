# Stage 1: Build the Maven project
FROM maven:3.8.5-openjdk-17 AS builder

# Set working directory
WORKDIR /app

# Copy everything into the container
COPY . .

# Build the application using Maven
RUN mvn clean package

# Stage 2: Run the built JAR
FROM openjdk:17

# Set working directory
WORKDIR /app

# Copy the JAR file from the builder stage
COPY --from=builder /app/target/lab1-0.0.1-SNAPSHOT.jar app.jar

# Copy JSON file (or folder) your program needs
COPY json/ ./json/

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
