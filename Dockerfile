FROM openjdk:17.0.1-jdk-slim

ADD target/myblogs-spring-mongo.jar myblogs-spring-mongo.jar

EXPOSE 7000

ENTRYPOINT ["java","-jar","smyblogs-spring-mongo.jar"]