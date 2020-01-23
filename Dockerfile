
FROM java:8
EXPOSE 8044
ADD /target/demodocker.jar demodocker.jar 
ENTRYPOINT ["java", "-jar", "demodocker.jar"]