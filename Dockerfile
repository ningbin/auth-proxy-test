FROM java:8
MAINTAINER ningbin 
WORKDIR /
ADD target/ssl-auth-proxy-1.0.0.RELEASE.jar ssl-auth-proxy-1.0.0.RELEASE.jar
EXPOSE 8443
CMD ["java","-jar","/ssl-auth-proxy-1.0.0.RELEASE.jar"]