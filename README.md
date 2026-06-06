# Banking Transaction API

A production-ready REST API for banking transaction management, built with Java and Spring Boot.

## Tech Stack

- Java 17
- Spring Boot 3.2
- Spring Security (Basic Auth)
- Spring Data JPA
- H2 In-Memory Database
- Maven

## Features

- Create and manage financial transactions
- Secure endpoints with authentication
- Filter transactions by sender, receiver, or status
- Auto-timestamp and status management
- RESTful API design

## Getting Started

### Prerequisites
- Java 17+
- Maven 3.8+

### Run the application

```bash
git clone https://github.com/mohammedhasan92/banking-api.git
cd banking-api
mvn spring-boot:run
```

API will start on `http://localhost:8080`

Default credentials:
- Username: `admin`
- Password: `admin123`

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /api/transactions | Create a transaction |
| GET | /api/transactions | Get all transactions |
| GET | /api/transactions/{id} | Get transaction by ID |
| GET | /api/transactions/sender/{sender} | Get by sender |
| PATCH | /api/transactions/{id}/status | Update status |
| DELETE | /api/transactions/{id} | Delete transaction |

## Example Request

```bash
curl -u admin:admin123 -X POST http://localhost:8080/api/transactions \
-H "Content-Type: application/json" \
-d '{
  "sender": "Ahmed",
  "receiver": "Mohammed",
  "amount": 1500.00,
  "currency": "USD"
}'
```

## Example Response

```json
{
  "id": 1,
  "sender": "Ahmed",
  "receiver": "Mohammed",
  "amount": 1500.00,
  "currency": "USD",
  "status": "PENDING",
  "createdAt": "2026-06-06T14:44:44"
}
```

## Author

**Mohammed Hasan** — Senior Java Backend Engineer  
10 years experience in banking and enterprise systems  
[LinkedIn](https://www.linkedin.com/in/mohammed-hasan-78652111b)