FROM bitnami/tomcat:latest
RUN MKDIR /test
RUN chmod 777 /test
COPY demoApp.war /test
RUN chmod 777 /test/demoApps.war
COPY /test/demoApps.war /opt/bitnami/tomcat/webapps
