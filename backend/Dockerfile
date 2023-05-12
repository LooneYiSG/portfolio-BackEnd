FROM amazoncorretto:8-alpine-jdk

WORKDIR /app

COPY backend/backend.jar ./

ENTRYPOINT ["java","-jar","/backend.jar"]