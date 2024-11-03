# Spring Boot Tutorials

This multi-project contains examples and tutorials prepared for those who want to learn development with Spring Boot. Below, you’ll find a guide on setting up, running, and learning the features of this project.

## Projects

1. **spring-rest-api**: This project provides a simple example of building a basic REST API without a database. It demonstrates core REST principles and follows a layered architecture.

2. **spring-data-jpa**: This project showcases REST API development integrated with a PostgreSQL database. It uses Spring Data JPA to manage data persistence and employs Spring Validation for data validation. Annotations like ```@OneToMany``` and ```@ManyToOne``` are used to establish relationships between data entities.

3. **exception-management**: This project demonstrates centralized exception handling in Spring Boot using ```@ControllerAdvice``` and ```@ExceptionHandler```. It provides a structured approach to handle various error types, allowing clear and user-friendly error responses for REST APIs.

4. **jwt**: This project covers authentication and authorization in a Spring Boot REST API using JSON Web Tokens (JWT). It includes endpoints for login and signup, generating JWTs for authenticated users, and securing API routes by validating tokens. Also Swagger integration has also been added.

5. **pageable**: This project illustrates how to implement pagination and sorting in a Spring Boot REST API using Spring Data's Pageable interface. It shows efficient data retrieval techniques and how to customize pagination parameters for large datasets.

## Getting Started

### Requirements
- **Java 17 or higher**
- **Maven 3.6.0 or higher**
- **IDE**: IDE: IntelliJ IDEA or Eclipse (IntelliJ preferred)

### Installation

After cloning the project, run the following command in your terminal to install the necessary dependencies:
```bash
mvn clean install
