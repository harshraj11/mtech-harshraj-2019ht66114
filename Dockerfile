FROM bitnami/tomcat:latest
COPY demoApp.war /opt/bitnami/tomcat/webapps
RUN chmod 777 opt/bitnami/tomcat/webapps/demoApps.war
