# order-service

# H2 DB 
http://localhost:8080/h2-console/ 
http://localhost:81/h2-console/     (When running as a service inside container use )
jdbc:h2:mem:orderdb

# Swagger 
http://localhost:8080/swagger-ui/index.html 
http://localhost:81/swagger-ui/index.html  (When running as a service inside container use )

# Building Docker Image
eval $(minikube -p minikube docker-env) then do docker build

# For exposing the Loadbalance Ip else it will be in pendig state
minikube tunnel


