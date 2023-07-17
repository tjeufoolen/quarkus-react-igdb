# quarkus-react-igdb

This project uses Quarkus, the Supersonic Subatomic Java Framework.
It is created using tips from [Dmytro Chaban's medium post](https://medium.com/quarkify/build-run-and-deploy-react-app-with-quarkus-6cc4f6074d6).
If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Prerequisites
- Maven v3.9.0 or higher
- JRE 17

## Getting started

1. Clone this project
2. Navigate into the root of the project using `cd ./quarkus-react-igdb`.
3. Execute `./mvnw clean package` to automatically download and install frontend tools.

## Development

For local development and auto recompiling you'll have to use two commands.

To run the backend rest service the `./mvnw compile quarkus:dev` command is used inside the root of the project.
Disclaimer; this does not auto reload the page, only auto-recompile on refresh of the page.

To run the frontend react application the `npm run start` command is used inside `/src/main/webapp`.

After running the commands you can access the backend at [http://localhost:8080](http://localhost:8080) and the frontend at [http://localhost:3000](http://localhost:3000).

## Create and run production jar

1. Navigate to the root of the project.
2. Execute `./mvnw clean package` to build the project and generate a jar.
3. Run the jar using `java -jar ./target/quarkus-app/quarkus-run.jar`.

## OpenAPI and Swagger

This code automatically generates an [openapi schema](http://localhost:8080/q/openapi) and publishes a [Swagger UI](http://localhost:8080/q/swagger-ui/#/).

## Author(s)

- [Tjeu Foolen](https://github.com/tjeufoolen)

## References
- [Build, run and deploy React app with Quarkus](https://medium.com/quarkify/build-run-and-deploy-react-app-with-quarkus-6cc4f6074d6)
- [Setting up Swagger with Quarkus and React](https://medium.com/quarkify/setting-up-swagger-with-quarkus-and-react-a811c7ca5ace)
- [Using Hibernate ORM and Jakarta Persistence ](https://quarkus.io/guides/hibernate-orm)
- [Simplified Hibernate ORM with Panache](https://quarkus.io/guides/hibernate-orm-panache)
- [Configure data sources in Quarkus](https://quarkus.io/guides/datasource)
- [Quarkus: blocked by CORS policy](https://stackoverflow.com/questions/56959505/quarkus-blocked-by-cors-policy)
- [Using OpenAPI and Swagger UI ](https://quarkus.io/guides/openapi-swaggerui)