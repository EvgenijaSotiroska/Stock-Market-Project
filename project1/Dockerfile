# Use an official OpenJDK runtime as the base image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the built JAR file into the container
# Replace 'your-app.jar' with the actual name of your JAR file
COPY target/project1-0.0.1-SNAPSHOT.jar app.jar

# Expose the port  Spring Boot app runs on
EXPOSE 8080

# Set the entry point to run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
