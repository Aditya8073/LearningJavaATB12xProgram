# Restful Booker API – Detailed Test Cases

| TC ID | Endpoint | Method | Scenario Type | Description | Prerequisites | Input / Headers / Cookies | Expected Status | Expected Response |
|-------|----------|--------|---------------|-------------|---------------|---------------------------|-----------------|-------------------|
| AUTH-01 | /auth | POST | Positive | Valid credentials generate token | None | Body: `{ "username": "admin", "password": "password123" }`, Content-Type: application/json | 200 | JSON with valid token |
| AUTH-02 | /auth | POST | Negative | Invalid username | None | Body: `{ "username": "wrong", "password": "password123" }` | 200 or 401 | Error message or Unauthorized |
| AUTH-03 | /auth | POST | Negative | Invalid password | None | Body: `{ "username": "admin", "password": "wrongpass" }` | 200 or 401 | Error message or Unauthorized |
| AUTH-04 | /auth | POST | Negative | Missing username field | None | Body: `{ "password": "password123" }` | 400 | Error: Missing username |
| AUTH-05 | /auth | POST | Negative | Missing password field | None | Body: `{ "username": "admin" }` | 400 | Error: Missing password |
| AUTH-06 | /auth | POST | Negative | Wrong Content-Type header | None | Body: `{ "username": "admin", "password": "password123" }`, Content-Type: text/plain | 415 | Unsupported Media Type |
| AUTH-07 | /auth | POST | Negative | Empty body | None | Empty body, Content-Type: application/json | 400 | Error: Missing credentials |
| AUTH-08 | /auth | POST | Negative | Extra fields in payload | None | Body: `{ "username": "admin", "password": "password123", "extra": "data" }` | 200 | Token generated (ignore extra field) |
| AUTH-09 | /auth | POST | Corner | Very long username/password | None | Body: `{ "username": "a"*500, "password": "b"*500 }` | 400 or 401 | Error message |
| AUTH-10 | /auth | POST | Header | Missing Content-Type header | None | Raw JSON payload without Content-Type | 415 | Unsupported Media Type |
| BOOK-01 | /booking | GET | Positive | Retrieve all booking IDs | None | GET request | 200 | JSON array of booking IDs |
| BOOK-02 | /booking | GET | Positive | Filter by firstname | None | Query: `firstname=Jim` | 200 | Filtered booking IDs |
| BOOK-03 | /booking | GET | Positive | Filter by lastname | None | Query: `lastname=Brown` | 200 | Filtered booking IDs |
| BOOK-04 | /booking | GET | Positive | Filter by checkin date | None | Query: `checkin=2025-01-01` | 200 | Filtered booking IDs |
| BOOK-05 | /booking | GET | Negative | Invalid query parameter | None | Query: `foo=bar` | 200 | No matches or ignored param |
| BOOK-06 | /booking | GET | Negative | Invalid date format in query | None | Query: `checkin=01-01-2025` | 400 | Error: Invalid date format |
| BOOK-07 | /booking | GET | Header | Wrong Accept header | None | Accept: application/xml (if not supported) | 406 | Not Acceptable |
| BOOKID-01 | /booking/:id | GET | Positive | Retrieve booking by valid ID | Booking exists | Path param: `id=1` | 200 | Booking details JSON |
| BOOKID-02 | /booking/:id | GET | Negative | Non-existent booking ID | None | Path param: `id=99999` | 404 | Not Found |
| BOOKID-03 | /booking/:id | GET | Negative | Invalid booking ID format | None | Path param: `id=abc` | 400 | Error: Invalid ID |
| BOOKID-04 | /booking/:id | GET | Header | Wrong Accept header | None | Accept: text/plain | 406 | Not Acceptable |
| CREATE-01 | /booking | POST | Positive | Create booking with valid JSON payload | None | Body: valid booking JSON, Content-Type: application/json | 200/201 | JSON with booking ID and details |
| CREATE-02 | /booking | POST | Positive | Create booking with valid XML payload | None | Body: valid booking XML, Content-Type: application/xml | 200/201 | Booking created |
| CREATE-03 | /booking | POST | Negative | Missing required field | None | Body without `firstname` | 400 | Error: Missing field |
| CREATE-04 | /booking | POST | Negative | Invalid data type for totalprice | None | `"totalprice": "abc"` | 400 | Error: Invalid type |
| CREATE-05 | /booking | POST | Negative | Invalid date format | None | `"checkin": "01-01-2025"` | 400 | Error: Invalid date |
| CREATE-06 | /booking | POST | Header | Missing Content-Type header | None | Raw JSON payload | 415 | Unsupported Media Type |
| CREATE-07 | /booking | POST | Corner | Large payload | None | Overly large JSON | 413 | Payload Too Large |
| UPDATE-01 | /booking/:id | PUT | Positive | Full update with valid token | Valid booking ID & token | Header: Cookie=token, Body: full valid JSON | 200 | Updated booking JSON |
| UPDATE-02 | /booking/:id | PUT | Negative | Missing token | Valid booking ID | No token header | 403 | Forbidden |
| UPDATE-03 | /booking/:id | PUT | Negative | Expired token | Valid booking ID | Cookie=expiredtoken | 403 | Forbidden |
| UPDATE-04 | /booking/:id | PUT | Negative | Invalid ID | None | Path param: id=99999 | 404 | Not Found |
| UPDATE-05 | /booking/:id | PUT | Negative | Invalid payload | None | `"totalprice": "abc"` | 400 | Error: Invalid type |
| PATCH-01 | /booking/:id | PATCH | Positive | Partial update with valid token | Valid booking ID & token | Cookie=token, Body: partial JSON | 200 | Updated booking JSON |
| PATCH-02 | /booking/:id | PATCH | Negative | No token | Valid booking ID | No auth header | 403 | Forbidden |
| PATCH-03 | /booking/:id | PATCH | Negative | Invalid payload | None | Body: `"totalprice": "abc"` | 400 | Error: Invalid type |
| DELETE-01 | /booking/:id | DELETE | Positive | Delete booking with valid token | Valid booking ID & token | Cookie=token | 201 | Deleted confirmation |
| DELETE-02 | /booking/:id | DELETE | Negative | No token | Valid booking ID | No token | 403 | Forbidden |
| DELETE-03 | /booking/:id | DELETE | Negative | Invalid token | Valid booking ID | Cookie=invalidtoken | 403 | Forbidden |
| DELETE-04 | /booking/:id | DELETE | Negative | Non-existent booking ID | None | Path param: id=99999 | 404 | Not Found |
| DELETE-05 | /booking/:id | DELETE | Negative | Already deleted booking | None | Path param: deleted ID | 404 | Not Found |
| PING-01 | /ping | GET | Positive | Health check | None | GET request | 201 | Created/OK |
| PING-02 | /ping | GET | Negative | Wrong HTTP method | None | POST request | 405 | Method Not Allowed |
| PING-03 | /ping | GET | Negative | Wrong endpoint | None | GET /pong | 404 | Not Found |
