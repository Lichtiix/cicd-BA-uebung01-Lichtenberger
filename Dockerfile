# --- Build Stage ---
FROM maven:3.9.3-eclipse-temurin-20 AS build
WORKDIR /app

# pom zuerst kopieren → Layer-Caching
COPY pom.xml .
RUN mvn dependency:go-offline

# Quellcode kopieren
COPY src ./src

# Projekt bauen
RUN mvn clean package -DskipTests && ls -la target/

# --- Runtime Stage ---
FROM eclipse-temurin:20-jre
WORKDIR /app

# JAR aus Build-Stage kopieren
COPY --from=build /app/target/*.jar app.jar

# Container starten
ENTRYPOINT ["java", "-jar", "app.jar"]
