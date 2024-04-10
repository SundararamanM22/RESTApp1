FROM eclipse-temurin:17
COPY target/RestApp1.Jar RestApp1.Jar
CMD ["java", "-jar", "RestApp1.Jar]