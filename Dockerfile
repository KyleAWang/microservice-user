FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=/target/micro-service-user-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
EXPOSE 2223
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]
