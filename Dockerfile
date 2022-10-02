FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENV SPRING_PROFILE dev
EXPOSE 8080
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=${SPRING_PROFILE}","/app.jar"]