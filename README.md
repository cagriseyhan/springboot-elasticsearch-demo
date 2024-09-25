# Spring Boot Elasticsearch Demo

This is a demo project for integrating **Spring Boot** with **Elasticsearch**. The project demonstrates basic CRUD operations and the interaction between a Spring Boot application and an Elasticsearch cluster.

## Features
- **Spring Boot** 2.x
- **Elasticsearch** RestHighLevelClient for operations
- Basic **CRUD** operations (Create, Read, Update, Delete)
- Search functionalities with Elasticsearch queries

## Prerequisites

Before you can run the project, ensure you have the following installed:
- **Java** (version 11 or higher)
- **Maven** (version 3.x)
- **Docker** (for running Elasticsearch)

## Setup and Running the Project

1. **Clone the repository:**

    ```bash
    git clone https://github.com/cagriseyhan/springboot-elasticsearch-demo.git
    cd springboot-elasticsearch-demo
    ```

2. **Run Elasticsearch in Docker:**

   If you don't have an Elasticsearch cluster running, you can quickly start one using Docker:

    ```bash
    docker pull elasticsearch:7.15.0
    docker run -d -p 9200:9200 -p 9300:9300 --name elasticsearch elasticsearch:7.15.0
    ```

   After starting the container, you can verify that Elasticsearch is running by visiting `http://localhost:9200` in your browser or sending a request using curl:

    ```bash
    curl http://localhost:9200/
    ```

3. **Configure Application Properties:**

   Make sure your `application.properties` or `application.yml` file is configured to connect to your Elasticsearch instance. Default settings are:

    ```properties
    spring.elasticsearch.rest.uris=http://localhost:9200
    ```

4. **Build the project:**

   You can use Maven to build the project:

    ```bash
    mvn clean install
    ```

5. **Run the application:**

   After building the project, you can run it using the following command:

    ```bash
    mvn spring-boot:run
    ```

## API Endpoints

The application exposes the following API endpoints for interacting with Elasticsearch:

- **POST /api/documents**: Create a new document
- **GET /api/documents/{id}**: Retrieve a document by ID
- **PUT /api/documents/{id}**: Update a document by ID
- **DELETE /api/documents/{id}**: Delete a document by ID
- **GET /api/documents/search**: Search for documents using query parameters

## Example Requests

- **Create a Document:**

    ```bash
    curl -X POST "http://localhost:8080/api/documents" -H "Content-Type: application/json" -d '{
      "id": "1",
      "title": "Sample Document",
      "content": "This is a sample document"
    }'
    ```

- **Search Documents:**

    ```bash
    curl -X GET "http://localhost:8080/api/documents/search?query=sample"
    ```

## Running Tests

To run the unit tests for this project:

```bash
mvn test
```

## Technologies Used
- **Spring Boot**: Java-based framework for building microservices
- **Elasticsearch**: Search engine for distributed search and analytics
- **Maven**: Build automation tool
- **Docker**: Containerization platform

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Bu taslağı, projenin gereksinimlerine ve ihtiyaçlarına göre daha fazla özelleştirebiliriz. Başka bir detay eklememi istersen, lütfen belirt!