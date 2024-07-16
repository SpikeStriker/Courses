# syntax=docker/dockerfile:1
FROM docker.io/bitnami/jenkins:2
LABEL Uday Jain <uday9k@gmail.com>
WORKDIR /bitnami
# COPY requirements.txt requirements.txt
USER root
RUN apt-get update -y && apt-get install -y wget
RUN wget https://dlcdn.apache.org/maven/maven-3/3.8.8/binaries/apache-maven-3.8.8-bin.tar.gz \
    && tar -xvf apache-maven-3.8.8-bin.tar.gz \
    && mv apache-maven-3.8.8 /opt/

ENV M2_HOME /opt/apache-maven-3.8.8
ENV PATH $M2_HOME/bin:$PATH
RUN export PATH
RUN export LC_ALL=en_US