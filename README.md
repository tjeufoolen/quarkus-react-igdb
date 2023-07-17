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

To run the backend rest service the `./mvnw compile quarkus:dev` command is used.
Disclaimer; this does not auto reload the page, only auto-recompile on refresh of the page.

To run the frontend react application the `npm run start` command is used.

## Create and run production jar

1. Navigate to the root of the project.
2. Execute `./mvnw clean package` to build the project and generate a jar.
3. Run the jar using `java -jar ./target/quarkus-app/quarkus-run.jar`.

## Author(s)

- [Tjeu Foolen](https://github.com/tjeufoolen)