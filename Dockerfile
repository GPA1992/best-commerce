FROM openjdk:17-alpine
COPY ./target/best-commerce-0.0.1-SNAPSHOT.jar app.jar
COPY ./src/main/resources/application.properties application.properties
ENTRYPOINT ["java", "-jar","/app.jar", "--spring.config.location=file:./application.properties" ]


