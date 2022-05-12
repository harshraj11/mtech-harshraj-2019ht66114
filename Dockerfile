FROM bitnami/tomcat:latest
COPY demoApps.war /opt/bitnami/tomcat/webapps
