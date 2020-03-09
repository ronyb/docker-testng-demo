FROM maven:3.6-jdk-11 AS build
COPY pom.xml /usr/src/app/pom.xml
RUN mvn -f /usr/src/app/pom.xml dependency:resolve dependency:resolve-plugins
COPY src /usr/src/app/src
CMD mvn -f /usr/src/app/pom.xml clean test