FROM amazoncorretto:19

#COPY backend.jar app.jar

ENTRYPOINT ["java","-jar","/backend.jar"]