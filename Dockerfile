FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG DEPENDENCY=target/
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","com.microservices.loja.LojaApplication"]