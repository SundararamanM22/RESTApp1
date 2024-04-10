FROM eclipse-temurin:17
COPY target/RestApp1.jar RestApp1.jar
CMD ["java", "-jar", "RestApp1.jar]