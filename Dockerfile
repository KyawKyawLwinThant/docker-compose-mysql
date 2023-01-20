FROM openjdk
COPY target/mysql-docker-boot-0.0.1-SNAPSHOT.jar /usr/src
WORKDIR /usr/src
expose 8080
CMD ["java","-jar","mysql-docker-boot-0.0.1-SNAPSHOT.jar"]
