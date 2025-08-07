✅ Test Case Suite: IsValidISBN10 SOAP API
📄 Overview
This document contains a comprehensive set of test cases for the SOAP API operation IsValidISBN10, which validates 10-digit ISBN numbers. It covers:

✅ Positive test cases (valid input)

❌ Negative test cases (invalid input)

⚠️ Edge/corner cases

🔐 Header & Cookie scenarios

⛔ Malformed / format issues

🚫 Unsupported HTTP methods

📌 API Details
Endpoint: POST /services/isbnservice.wso

Host: webservices.daehosting.com

Protocols Supported: SOAP 1.1, SOAP 1.2, JSON

Input Parameter: sISBN (string)

Output: Boolean (true or false)



| Test Case ID    | Category    | Description                        | Method | Protocol | Content-Type                  | Input / Headers / Cookies                  | Expected Status | Expected Output    |
| --------------- | ----------- | ---------------------------------- | ------ | -------- | ----------------------------- | ------------------------------------------ | --------------- | ------------------ |
| TC\_POS\_01     | Positive    | Valid ISBN-10 (digits only)        | POST   | SOAP 1.1 | text/xml                      | sISBN: `0471958697`                        | 200             | true               |
| TC\_POS\_02     | Positive    | Valid ISBN-10 with "X"             | POST   | SOAP 1.1 | text/xml                      | sISBN: `156881111X`                        | 200             | true               |
| TC\_POS\_03     | Positive    | Valid ISBN-10 using JSON           | POST   | JSON     | application/json              | sISBN: `0306406152`                        | 200             | true               |
| TC\_POS\_04     | Positive    | Valid ISBN-10 using SOAP 1.2       | POST   | SOAP 1.2 | application/soap+xml          | sISBN: `048665088X`                        | 200             | true               |
| TC\_POS\_05     | Positive    | Valid ISBN with leading zeros      | POST   | SOAP 1.1 | text/xml                      | sISBN: `0000000009`                        | 200             | true               |
| TC\_NEG\_01     | Negative    | Invalid checksum                   | POST   | SOAP 1.1 | text/xml                      | sISBN: `0471958696`                        | 200             | false              |
| TC\_NEG\_02     | Negative    | Too few digits                     | POST   | SOAP 1.1 | text/xml                      | sISBN: `1234567`                           | 200             | false              |
| TC\_NEG\_03     | Negative    | Too many digits                    | POST   | SOAP 1.1 | text/xml                      | sISBN: `123456789012`                      | 200             | false              |
| TC\_NEG\_04     | Negative    | Alphabetic input                   | POST   | SOAP 1.1 | text/xml                      | sISBN: `ABCDEFGHIJ`                        | 200             | false              |
| TC\_NEG\_05     | Negative    | Lowercase 'x' as checksum          | POST   | SOAP 1.1 | text/xml                      | sISBN: `156881111x`                        | 200             | false              |
| TC\_NEG\_06     | Negative    | Null input                         | POST   | JSON     | application/json              | sISBN: `null`                              | 500             | Error              |
| TC\_NEG\_07     | Negative    | Empty string                       | POST   | JSON     | application/json              | sISBN: `""`                                | 500             | Error              |
| TC\_NEG\_08     | Negative    | Special characters                 | POST   | SOAP 1.1 | text/xml                      | sISBN: `@#*(!)$%^`                         | 200             | false              |
| TC\_NEG\_09     | Negative    | Whitespace-only input              | POST   | SOAP 1.1 | text/xml                      | sISBN: `"        "`                        | 200             | false              |
| TC\_NEG\_10     | Negative    | Numbers with spaces                | POST   | SOAP 1.1 | text/xml                      | sISBN: `"0471 958 697"`                    | 200             | false              |
| TC\_EDGE\_01    | Edge        | Input with leading/trailing spaces | POST   | SOAP 1.1 | text/xml                      | sISBN: `" 0471958697 "`                    | 200             | false (or trim)    |
| TC\_EDGE\_02    | Edge        | JSON format with valid input       | POST   | JSON     | application/json              | sISBN: `0306406152`                        | 200             | true               |
| TC\_EDGE\_03    | Edge        | Invalid content-type (text/plain)  | POST   | SOAP 1.1 | text/plain                    | sISBN: `0471958697`                        | 415             | Error              |
| TC\_EDGE\_04    | Edge        | Empty JSON body                    | POST   | JSON     | application/json              | `{}`                                       | 500             | Error              |
| TC\_EDGE\_05    | Edge        | No `sISBN` key in JSON             | POST   | JSON     | application/json              | `{"wrongKey": 1}`                          | 500             | Error              |
| TC\_EDGE\_06    | Edge        | SOAP 1.2 with invalid checksum     | POST   | SOAP 1.2 | application/soap+xml          | sISBN: `1234567890`                        | 200             | false              |
| TC\_HDR\_01     | Header      | Missing Content-Type header        | POST   | SOAP 1.1 | *(none)*                      | Header: *(none)*                           | 415             | Error              |
| TC\_HDR\_02     | Header      | Incorrect Content-Type             | POST   | SOAP 1.1 | text/plain                    | Raw XML                                    | 415             | Error              |
| TC\_HDR\_03     | Header      | Additional custom headers          | POST   | JSON     | application/json              | Header: `X-Debug: true`                    | 200             | true/false         |
| TC\_HDR\_04     | Header      | Invalid charset in Content-Type    | POST   | JSON     | application/json; charset=xyz | sISBN: `0471958697`                        | 415             | Error              |
| TC\_HDR\_05     | Header      | Accept: application/xml            | POST   | SOAP 1.1 | text/xml                      | Header: `Accept: application/xml`          | 200             | XML                |
| TC\_CK\_01      | Cookie      | Valid session cookie               | POST   | JSON     | application/json              | Cookie: `sessionid=abc123`                 | 200             | true               |
| TC\_CK\_02      | Cookie      | Invalid cookie value               | POST   | SOAP 1.1 | text/xml                      | Cookie: `sessionid=<script>bad</script>`   | 200             | true/false         |
| TC\_CK\_03      | Cookie      | No cookies (default)               | POST   | JSON     | application/json              | *(no cookies)*                             | 200             | true/false         |
| TC\_FMT\_01     | Format      | Malformed XML (unclosed tag)       | POST   | SOAP 1.1 | text/xml                      | `<sISBN>0471958697</sISBN` (missing close) | 500             | Error              |
| TC\_FMT\_02     | Format      | Malformed JSON                     | POST   | JSON     | application/json              | `{sISBN: 1234,}`                           | 400/500         | Error              |
| TC\_FMT\_03     | Format      | Empty body with content-length     | POST   | SOAP 1.1 | text/xml                      | Empty body with content-length set         | 400/500         | Error              |
| TC\_FMT\_04     | Format      | Full-width Unicode characters      | POST   | JSON     | application/json              | sISBN: `１２３４５６７８９Ｘ`                        | 200             | false              |
| TC\_TIMEOUT\_01 | Performance | Extremely large input (\~1MB)      | POST   | JSON     | application/json              | sISBN: `long string`                       | 500             | Error / Timeout    |
| TC\_TIMEOUT\_02 | Performance | Client timeout (1ms)               | POST   | SOAP 1.1 | text/xml                      | Normal input, forced short timeout         | Timeout/Error   | N/A                |
| TC\_CACHE\_01   | Repetition  | Repeat valid ISBN multiple times   | POST   | JSON     | application/json              | sISBN: `0471958697` (loop 10x)             | 200             | true               |
| TC\_CACHE\_02   | Repetition  | Rapid invalid ISBNs in succession  | POST   | JSON     | application/json              | sISBN: `1234567890` (loop 10x)             | 200             | false              |
| TC\_METHOD\_01  | Method      | Use GET instead of POST            | GET    | SOAP 1.1 | N/A                           | *(no body)*                                | 405             | Method Not Allowed |
| TC\_METHOD\_02  | Method      | Use PUT method                     | PUT    | JSON     | application/json              | sISBN: `0471958697`                        | 405             | Method Not Allowed |
| TC\_METHOD\_03  | Method      | Use DELETE method                  | DELETE | JSON     | application/json              | sISBN: `0471958697`                        | 405             | Method Not Allowed |

---

## 📊 Summary

* ✅ **Positive Tests**: 5
* ❌ **Negative Tests**: 10
* ⚠️ **Edge/Format Tests**: 6
* 🔐 **Header Tests**: 5
* 🍪


**Cookie Tests**: 3

* 🧾 **Malformed Format Tests**: 4
* ⏱️ **Performance Tests**: 2
* 🔁 **Repetition Tests**: 2
* 🚫 **Unsupported Method Tests**: 3

**🔢 Total: 40 Test Cases**



I'm happy to generate the file for you.
