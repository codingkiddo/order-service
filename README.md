./mvnw clean install 

docker build --build-arg JAR_FILE=target/order-service-0.0.8-SNAPSHOT.jar -t order-service .


docker tag order-service:0.0.8-SNAPSHOT ghcr.io/codingkiddo/order-service:0.0.8-SNAPSHOT

docker push ghcr.io/codingkiddo/order-service:0.0.8-SNAPSHOT

kubectl logs deployment/order-service

kubectl apply -f k8s/deployment.yml
kubectl delete -f k8s/deployment.yml



docker buildx build --push --platform linux/arm/v7,linux/arm64/v8,linux/amd64 --tag codingkiddo/order-service:0.0.8-SNAPSHOT .