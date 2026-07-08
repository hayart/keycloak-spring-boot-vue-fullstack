# Spring Boot Keycloak Vue Full-Stack Application 🚀

A modern full-stack application demonstrating secure authentication and authorization using **Keycloak OAuth2/OpenID Connect**, **Spring Boot**, **Vue.js**, and **PostgreSQL**.

The project demonstrates how to build a secure enterprise-style application where authentication is managed by Keycloak and business data is stored separately in PostgreSQL.

---

## 🏗️ Architecture

```
                     User Browser
                          |
                          |
                    Vue.js Frontend
                          |
                          |
                 OAuth2 / OpenID Connect
                          |
                          |
                      Keycloak
                          |
                    JWT Access Token
                          |
                          |
                  Spring Boot API
                          |
                          |
                    PostgreSQL DB
```

---

## ✨ Features

### Authentication & Security

* OAuth2 authentication
* OpenID Connect integration
* JWT token-based security
* Keycloak identity management
* Role-based authorization
* Secure REST API endpoints

### Frontend

* Vue.js 3 application
* Keycloak JavaScript adapter
* Login/logout functionality
* Protected routes
* User profile display

### Backend

* Spring Boot REST API
* Spring Security 6
* OAuth2 Resource Server
* JWT validation
* RESTful architecture
* PostgreSQL persistence

---

# 🛠️ Technology Stack

## Frontend

* Vue.js 3
* Vite
* Vue Router
* Axios
* Keycloak JS

## Backend

* Java 21
* Spring Boot 3
* Spring Security 6
* Spring Data JPA
* Maven

## Identity Provider

* Keycloak
* OAuth2
* OpenID Connect

## Database

* PostgreSQL

## Infrastructure

* Docker
* Docker Compose

---

# 📂 Project Structure

```
keycloak-spring-boot-vue-fullstack

├── frontend
│   ├── src
│   ├── package.json
│   └── vite.config.js
│
├── backend
│   ├── src/main/java
│   │
│   ├── controller
│   ├── security
│   ├── service
│   ├── repository
│   └── entity
│
└── docker-compose.yml
```

---

# 🔐 Authentication Flow

1. User opens Vue.js application
2. User is redirected to Keycloak login page
3. Keycloak authenticates the user
4. Keycloak returns JWT access token
5. Vue.js sends JWT token with API requests
6. Spring Boot validates JWT token
7. Backend returns protected resources

---

# 🚀 Running the Application

## Prerequisites

Install:

* Java 21
* Maven
* Node.js
* PostgreSQL
* Docker (recommended)

---

# 1. Start Keycloak and PostgreSQL

Using Docker Compose:

```bash
docker compose up
```

Services:

```
Keycloak:
http://localhost:8080

PostgreSQL:
localhost:5432
```

---

# 2. Configure Keycloak

Create a realm:

```
fullstack-demo
```

Create client:

```
vue-frontend
```

Client type:

```
OpenID Connect
```

Valid redirect URI:

```
http://localhost:5173/*
```

Web origin:

```
http://localhost:5173
```

Create roles:

```
USER
ADMIN
```

---

# 3. Start Backend

Go to backend:

```bash
cd backend
```

Run:

```bash
mvn spring-boot:run
```

Backend:

```
http://localhost:8081
```

---

# 4. Start Frontend

Go to frontend:

```bash
cd frontend
```

Install dependencies:

```bash
npm install
```

Start:

```bash
npm run dev
```

Frontend:

```
http://localhost:5173
```

---

# ⚙️ Configuration

## Backend

`application.yml`

```yaml
spring:
  security:
    oauth2:
      resourceserver:
        jwt:
          issuer-uri: http://localhost:8080/realms/fullstack-demo
```

---

## Frontend

`.env`

```properties
VITE_KEYCLOAK_URL=http://localhost:8080
VITE_KEYCLOAK_REALM=fullstack-demo
VITE_KEYCLOAK_CLIENT_ID=vue-frontend

VITE_API_URL=http://localhost:8081/api
```

---

# 📡 API Example

Protected endpoint:

```
GET /api/users/me
```

Request:

```
Authorization: Bearer <JWT_TOKEN>
```

Response:

```json
{
  "username": "hayk",
  "email": "user@example.com",
  "roles": [
    "USER"
  ]
}
```

---

# 🔮 Future Improvements

* Add user profile synchronization with PostgreSQL
* Add refresh token handling
* Add Keycloak administration API integration
* Add Docker Compose production setup
* Add Kubernetes deployment
* Add CI/CD pipeline using GitHub Actions
* Add Swagger/OpenAPI documentation
* Add integration tests with Testcontainers

---

# 📌 Purpose of This Project

This project demonstrates modern enterprise application development using:

* Secure authentication architecture
* OAuth2/OpenID Connect
* Cloud-ready backend design
* Modern frontend development
* Containerized infrastructure

---

# 📄 License

MIT License
