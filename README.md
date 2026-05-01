# URL Shortener

A Spring Boot web application that provides URL shortening, user management, and redirect tracking.

## Overview

This project is a URL shortener built with Spring Boot 3.4.4, Spring Data JPA, Spring Security, Thymeleaf, and Flyway.
It stores shortened URLs in PostgreSQL and supports user registration/login, URL creation, and redirection.

## Features

- Short URL creation with optional expiry
- User registration and login
- Redirect from short codes to original URLs
- PostgreSQL persistence with Flyway database migration
- Server-side rendered UI with Thymeleaf
- Spring Security authentication

## Technology Stack

- Java 21
- Spring Boot 3.4.4
- Spring Web
- Spring Data JPA
- Spring Security
- Thymeleaf
- Flyway
- PostgreSQL
- Docker Compose

## Prerequisites

- Java 21
- Maven (or use the provided `./mvnw` wrapper)
- Docker and Docker Compose for local database startup

## Configuration

The application expects a PostgreSQL database configured in `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://postgres:5432/shortner
spring.datasource.username=root
spring.datasource.password=root
```

By default, the app is configured to use Docker Compose service `postgres`.

## Run Locally

### Using Maven wrapper

```bash
./mvnw spring-boot:run
```

### Build JAR

```bash
./mvnw clean package
java -jar target/url-shortner-0.0.1-SNAPSHOT.jar
```

## Docker Compose

If you want to run the PostgreSQL container locally, use:

```bash
docker compose up -d
```

Then start the application using Maven or the executable JAR.

## Database Migrations

Flyway migrations are located under `src/main/resources/db/migration`.
The project contains migration scripts to create the schema and seed sample data.

## Useful Commands

- `./mvnw clean package` — build the application
- `./mvnw spring-boot:run` — start the app in development mode
- `docker compose up -d` — start required Docker services
- `docker compose down` — stop Docker services

## Notes

- The Spring Boot application is named `url-shortner`.
- If you run the app outside Docker, update the datasource URL in `application.properties` to point to your PostgreSQL instance.
