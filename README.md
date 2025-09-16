# 💬 Real-Time WebSocket Chat Application

A lightweight real-time chat application built with **Java Spring Boot (backend)** and **HTML + JavaScript + Bootstrap (frontend)**. It uses **WebSockets (STOMP over SockJS)** to send and receive chat messages with timestamps.

## 🚀 Features

- Real-time chat using WebSockets
- Simple and clean frontend (HTML + Bootstrap)
- Timestamped messages
- Auto-reconnect if the WebSocket disconnects
- Live connection status (🟢 Connected / 🔴 Disconnected)
- Basic sender name and message input

## 🛠️ Tech Stack

- **Backend:** Java 17+, Spring Boot, WebSocket (STOMP)
- **Frontend:** HTML, Bootstrap 5, Vanilla JavaScript
- **Build Tool:** Maven

## 📁 Project Structure

- Chat-Application/
- ├── AppApplication.java # Main Spring Boot entry point
- ├── ChatController.java # Handles incoming chat messages
- ├── ChatMessage.java # Model class for messages
- ├── WebSocketConfig.java # WebSocket/STOMP configuration
- ├── static/
- │ ├── index.html # Chat UI
- │ └── styles.css # Custom styles for messages


## 🏁 How to Run

### 📦 Prerequisites

- Java 17 or later
- Maven

### ▶️ Steps

1. **Clone the repository**

```bash
git clone https://github.com/KrishAgarwal-44/Chat-Application-.git
cd Chat-Application-
```
2.  **Run the Spring Boot application**
3.  **Open the chat app in browser**

Visit: http://localhost:8080

## 🖼️ Screenshot

<img src="https://github.com/user-attachments/assets/a910e58d-588a-4273-a224-70cba27b87ae" width="700"/>



