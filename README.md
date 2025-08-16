# Lost & Found Backend

A simple REST API built with Spring Boot and PostgreSQL for managing lost items.

## Tech Stack & Requirements
- Java 17, Spring Boot, Spring Data JPA
- PostgreSQL installed and running locally
- Maven build tool

## Features
- `POST /api/lost` – Add a lost item
- `GET /api/lost` – List all items
- `GET /api/lost/{id}` – View specific item
- `PUT /api/lost/{id}` – Update item info
- `DELETE /api/lost/{id}` – Delete item

## Setup & Run
1. Clone the repository:
   ```bash
   git clone https://github.com/YOUR_USERNAME/lost-found-backend.git
   cd lost-found-backend
