FROM java:8-jre
ADD ./target/DockerSample-0.0.1-SNAPSHOT.jar /usr/src/DockerSample-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar","DockerSample-0.0.1-SNAPSHOT.jar"]