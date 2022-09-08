FROM openjdk:11
MAINTAINER Alex Scott "alex.scott@k-int.co.uk"

EXPOSE 8080

COPY build/libs/myApp-0.1.war /myApp.war

CMD ["java", "-Dgrails.env=prod", "-jar", "/myApp.war"]