FROM openjdk:17-jdk-alpine
MAINTAINER eniscan@gmx.de
COPY target/Case-Study-0.0.1-SNAPSHOT.jar Case-Study-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Case-Study-0.0.1-SNAPSHOT.jar"]