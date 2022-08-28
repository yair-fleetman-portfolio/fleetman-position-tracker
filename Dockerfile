FROM openjdk:8u131-jre

ADD target/positionreceiver-0.0.1-SNAPSHOT.jar webapp.jar

EXPOSE 8080

CMD ["java","-Xmx1024m","-jar","webapp.jar"]
