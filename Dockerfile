FROM amazoncorretto:17
COPY build/libs/*.jar memo.jar
ENTRYPOINT ["java", "-jar", "/memo.jar"]