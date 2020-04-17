FROM openjdk:8-jdk-alpine

VOLUME data

RUN apk add bash && apk update

WORKDIR /usr/app/src

COPY ./target/nameandadress-0.0.1-SNAPSHOT.jar app.jar

COPY ./setup.sh setup.sh

RUN chmod 755 *.*

RUN ls -lptr

EXPOSE 8080

#CMD ["java", "-jar", "app.jar"]

ENTRYPOINT ["sh","./setup.sh"]
