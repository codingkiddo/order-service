./mvnw clean install 

docker build --build-arg JAR_FILE=target/order-service-0.0.8-SNAPSHOT.jar -t order-service .

docker push ghcr.io/codingkiddo/order-service:0.0.8-SNAPSHOT