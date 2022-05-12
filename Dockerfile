FROM bitnami/tomcat:latest
COPY demoApp.war /opt/bitnami/tomcat/webapps
