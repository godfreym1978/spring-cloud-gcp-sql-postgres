FROM tomcat:9.0-alpine
ADD target/*.war	 /usr/local/tomcat/webapps/Postgres.war
EXPOSE 8080
CMD [“catalina.sh”, “run”]