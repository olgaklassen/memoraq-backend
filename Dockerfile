FROM openjdk:21-jdk-slim
ADD build/libs/memoraq-backend.jar app.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]
