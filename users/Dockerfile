FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY ./target/users-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8081
CMD ["java", "-jar", "app.jar"]