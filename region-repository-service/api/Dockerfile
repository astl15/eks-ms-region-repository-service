FROM openjdk:latest
ADD target/region-repository-service-api-0.1.0-SNAPSHOT.jar region-repository-service.jar
ENTRYPOINT ["java", "-jar", "region-repository-service.jar"]
EXPOSE 8080