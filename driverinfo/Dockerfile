
FROM openjdk:8-jdk-alpine

VOLUME data

RUN apk add bash && apk update

WORKDIR /usr/app/src

COPY ./target/driverinfo-0.0.1-SNAPSHOT.jar producer.jar

COPY ./setup.sh setup.sh

RUN chmod 755 *.*

RUN ls -lptr

EXPOSE 8080

# we are using CMD Now
CMD ["java", "-jar", "producer.jar"]

#ENTRYPOINT ["sh","./setup.sh"]