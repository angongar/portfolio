# Imagen base con JDK 17
FROM eclipse-temurin:17-jdk-alpine

# Directorio de la app
WORKDIR /app

# Copiar el .jar generado
COPY target/portfolio-0.0.1-SNAPSHOT.jar app.jar

# Variables de entorno (se configurarán en Fly.io)
ENV PORTFOLIO_DB_URL=""
ENV PORTFOLIO_DB_USER=""
ENV PORTFOLIO_DB_PASS=""
ENV PORTFOLIO_MAIL_USER=""
ENV PORTFOLIO_MAIL_PASS=""

# Exponer el puerto 8080
EXPOSE 8080

# Comando para arrancar la aplicación
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
