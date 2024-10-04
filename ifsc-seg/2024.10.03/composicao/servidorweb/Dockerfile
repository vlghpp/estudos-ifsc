# FROM ubuntu:latest

# RUN apt update && apt -y install git nyancat figlet


FROM eclipse-temurin:21-jdk 

COPY www /www 

WORKDIR /www

EXPOSE 8000
# docker run seg-ads

CMD ["jwebserver", "-b", "0.0.0.0"]