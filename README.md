# Transactions using OpenBank

* To compile the project you can use:

`mvn package`

* To execute the project you can use:

`mvn spring-boot:run`

The endpoints created are:

> [localhost:8080/base/v1/transactionList]()
> [localhost:8080/base/v1/transactionFilter]()
> [localhost:8080/base/v1/transactionGroup]()


* To create the docker image:

`docker build -f src/main/docker/Dockerfile -t transactions target/`