#FROM tomcat:9.0-alpine
#ADD target/*.war	 /usr/local/tomcat/webapps/postgres.war
#EXPOSE 8080
#CMD ["catalina.sh", "run"]


FROM anapsix/alpine-java
COPY target/spring-cloud-gcp-sql-postgres-0.0.1-SNAPSHOT.jar /home/spring-cloud-gcp-sql-postgres-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","/home/spring-cloud-gcp-sql-postgres-0.0.1-SNAPSHOT.jar"]
