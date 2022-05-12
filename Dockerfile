FROM bitnami/tomcat:latest
RUN chmod 777 /opt/bitnami/tomcat/webapps
COPY demoApps.war /opt/bitnami/tomcat/webapps
