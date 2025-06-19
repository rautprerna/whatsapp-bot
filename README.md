# 📱 WhatsApp Bot using Java, Spring Boot & Firebase

This project is a simple WhatsApp bot built using **Java**, **Spring Boot**, and the **WhatsApp Cloud API**. It allows sending pre-approved template messages via WhatsApp to any verified number using Meta's Graph API.

---

## 🚀 Features

- Send WhatsApp messages using a template (e.g. `hello_world`)
- Integrated with WhatsApp Cloud API (v17.0)
- Uses `RestTemplate` for making HTTP requests
- Secure API access using bearer token
- Firebase integration (used optionally for future enhancements)

---

## 🔧 Technologies Used

- Java 17+
- Spring Boot
- WhatsApp Cloud API (Meta)
- Firebase (for storage/authentication)
- Maven
- GitHub
  

---

## ▶️ How to Run the Project
Run the application on Windows CMD:
mvnw.cmd spring-boot:run
Send a test message
Open your browser or Postman and go to:
http://localhost:8080/send-message

1. **Clone this repository**
   ```bash
   git clone https://github.com/rautprerna/whatsapp-bot.git
   cd whatsapp-bot

