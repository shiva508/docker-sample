FROM maven:3.6.3-jdk-8-slim AS stage1
WORKDIR /home/app
COPY . /home/app/ 
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:8-jdk-alpine
EXPOSE 8044
COPY --from=stage1 /home/app/target/demodocker.jar demodocker.jar
ADD /target/demodocker.jar demodocker.jar 
ENTRYPOINT ["sh", "-c", "java -jar /hello-world-java.jar"]