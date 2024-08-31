devlan
devdb

sudo docker container run --name mysqldb -p 3305:3306 --network devlan -v devdb -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=mydb -d mysql:5.6



K8
====
minikube start --driver=docker