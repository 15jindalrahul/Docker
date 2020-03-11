FROM openjdk:8-jre-alpine
COPY target/springCloud_docker1-0.0.1-SNAPSHOT.jar /usr/share
WORKDIR /usr/share
ENTRYPOINT ["java","-jar", "springCloud_docker1-0.0.1-SNAPSHOT.jar", "comm.example.demo.SpringCloudDocker1Application"]