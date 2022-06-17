FROM openjdk:11
EXPOSE 8080
ADD target/javamongo.jar javamongo.jar
ENTRYPOINT ["java", "-jar", "/javamongo.jar"]
