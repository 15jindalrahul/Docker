FROM openjdk:8-jre-alpine
COPY target/docker-0.0.1-SNAPSHOT.jar /usr/share
WORKDIR /usr/share
ENTRYPOINT ["java","-cp", "docker-0.0.1-SNAPSHOT.jar", "comm.myCompany.docker.App"]