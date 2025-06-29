# Base image olarak OpenJDK 17'li slim bir image kullan
FROM openjdk:17-jdk-slim

# Yazar bilgisi
LABEL maintainer="huseyinerkek"

# Jar dosyasının adı dışarıdan ARG ile alınır
ARG JAR_FILE=target/RefactoredStudentApp-1.0-SNAPSHOT-jar-with-dependencies.jar

# Jar dosyasını image içine kopyala
COPY ${JAR_FILE} /app/app.jar

# Çalışma dizinini ayarla
WORKDIR /app

# Uygulama başlatma komutu
ENTRYPOINT ["java", "-jar", "app.jar"]
