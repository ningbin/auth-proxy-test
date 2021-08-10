# ssl-auth-proxy
ssl-auth-proxy
first one

# docker

docker run -d -p 8443:8443 -e RESOURCE_SERVER=http://10.237.200.11:8080 --name ssl-proxy-cdi -t ningbin/ssl-auth-proxy:latest
