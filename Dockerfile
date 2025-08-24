# Etapa 1: Build con Maven
FROM maven:3.9.2-eclipse-temurin-17 AS build

# Directorio de trabajo
WORKDIR /app

# Copiar pom.xml y código fuente
COPY pom.xml .
COPY src ./src

# Construir el jar
RUN mvn clean package -DskipTests

# Etapa 2: Imagen final solo con JDK
FROM eclipse-temurin:17-jdk-alpine

# Directorio de trabajo
WORKDIR /app

# Copiar jar desde la etapa build
COPY --from=build /app/target/*.jar app.jar

# Variables de entorno (se configurarán en Fly.io)
ENV PORTFOLIO_DB_URL=""
ENV PORTFOLIO_DB_USER=""
ENV PORTFOLIO_DB_PASS=""
ENV PORTFOLIO_MAIL_USER=""
ENV PORTFOLIO_MAIL_PASS=""

# Exponer el puerto
EXPOSE 8080

# Comando para arrancar la app
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
