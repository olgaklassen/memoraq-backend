FROM eclipse-temurin:21
ADD build/libs/memoraq-backend.jar app.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]
