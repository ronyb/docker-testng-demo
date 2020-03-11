FROM maven
COPY . /home/docker-testng-demo
CMD mvn -f /home/docker-testng-demo/pom.xml clean test

# docker build . -t docker-testng-demo
# docker run -e BASE_URL=http://google.com docker-testng-demo