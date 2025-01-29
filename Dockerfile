FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/watchlist-*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]

ENV SPRING_DATASOURCE_URL=jdbc:postgresql://postgres-db:5432/watchlist
ENV SPRING_DATASOURCE_USERNAME=postgres
ENV SPRING_DATASOURCE_PASSWORD=admin