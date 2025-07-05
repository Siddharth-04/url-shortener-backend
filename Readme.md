# 🔗 URL Shortener API (Spring Boot)

A secure, authenticated URL shortener built with Spring Boot, MySQL, JWT, and Spring Security. Users can register/login, shorten URLs, and track click analytics over custom date ranges.

---

## 📁 Project Structure

com.url.shortner  
├── controllers  
│   ├── AuthController  
│   ├── RedirectController  
│   └── UrlMappingController  
├── dtos  
│   ├── ClickEventDTO  
│   ├── LoginRequest  
│   ├── RegisterRequest  
│   └── UrlMappingDTO  
├── models  
│   ├── ClickEvent  
│   ├── UrlMapping  
│   └── User  
├── repository  
│   ├── ClickEventRepository  
│   ├── UrlMappingRepository  
│   └── UserRepository  
├── security  
│   ├── jwt/  
│   ├── WebConfig  
│   └── WebSecurityConfig  
├── service  
│   ├── UrlMappingService  
│   ├── UserDetailsImpl  
│   ├── UserDetailsServiceImpl  
│   └── UserService  
└── UrlShortnerApplication.java

---

## 🚀 Features

- 🔐 JWT-based user authentication
- ✂️ Create short URLs
- 🌐 Redirect to original URLs
- 📊 Track click events and analytics
- 📈 View total clicks grouped by day
- ✅ Role-based access control

---

## ⚙️ Tech Stack

- Spring Boot
- Spring Security (JWT)
- Spring Data JPA
- MySQL/Postgres
- Lombok
- Maven

---

## 🛠️ Getting Started

### ✅ Prerequisites

- Java 17+
- Maven
- MySQL

---

### ⚙️ Configuration

Update `src/main/resources/application.properties`:

```properties
spring.application.name=url-shortner

spring.datasource.url=jdbc:mysql://localhost:3306/urlshortnerdb
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.show-sql=true
```

---

### ▶️ Run the App

```bash
mvn clean install
mvn spring-boot:run
```

API runs on: `http://localhost:8080`

---

## 🔐 Auth Endpoints

| Method | Endpoint                     | Description        |
|--------|------------------------------|--------------------|
| POST   | /api/auth/public/register    | Register new user  |
| POST   | /api/auth/public/login       | Login and get JWT  |

---

## 🔗 URL Shortening Endpoints

> 🔒 Require `Bearer <token>` in headers

| Method | Endpoint                            | Description                     |
|--------|-------------------------------------|---------------------------------|
| POST   | /shorten                            | Create short URL                |
| GET    | /myurls                             | Get URLs of logged-in user      |
| GET    | /analytics/{shortUrl}               | Clicks for a short URL (filter) |
| GET    | /totalClicks                        | Total clicks grouped by date    |

---

## 🌐 Redirect Endpoint (Public)

| Method | Endpoint        | Description                 |
|--------|------------------|-----------------------------|
| GET    | /{shortUrl}     | Redirect to original URL    |

---

## 📊 Analytics Examples

**Clicks for a short URL**
```
GET /analytics/abc123?startDate=2025-01-01T00:00:00&endDate=2025-01-10T23:59:59
```

**Total clicks grouped by date**
```
GET /totalClicks?startDate=2025-01-01&endDate=2025-01-10
```

---

## 📌 DTOs

- `LoginRequest`: `{ "username": "", "password": "" }`
- `RegisterRequest`: `{ "username": "", "password": "", "email": "" }`
- `UrlMappingDTO`: `{ "originalUrl": "", "shortUrl": "", "clickCount": 0 }`
- `ClickEventDTO`: `{ "timestamp": "" }`

---

## ✅ To-Do

- [ ] Add QR code generator for short links
- [ ] Add link expiration
- [ ] Admin dashboard
- [ ] Export analytics to CSV/PDF

---

## 👨‍💻 Author

**Siddharth Singh**  
GitHub: [Siddharth-04](https://github.com/Siddharth-04)  
Email: siddharth.singh0403@gmail.com

---

## 📄 License

MIT License
