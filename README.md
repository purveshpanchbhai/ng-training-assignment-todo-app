# 📝 To-Do List App (Spring Boot + MongoDB + HTML/JS)

A full-stack To-Do List app that lets users add, update, and delete tasks. The backend is built using Spring Boot with MongoDB, and the frontend is built with plain HTML, CSS, and JavaScript.

## 📦 Tech Stack

| Layer      | Technology           |
|------------|----------------------|
| Backend    | Java, Spring Boot    |
| Database   | MongoDB              |
| Frontend   | HTML, CSS, JavaScript |
| Build Tool | Gradle               |

## ⚙️ Backend Setup

### 🔧 Prerequisites

- Java 17+
- MongoDB running locally on port 27017
- Gradle installed (or use Gradle wrapper)

### 📁 application.properties

spring.data.mongodb.uri=mongodb://localhost:27017/todo_db  
server.port=8080

### ▶️ Run the Server

cd backend  
./gradlew bootRun     # Linux/macOS  
gradlew.bat bootRun   # Windows

Server runs on: http://localhost:8080

## 🌐 REST API Endpoints

Method | Endpoint             | Description         
-------|----------------------|---------------------
GET    | /api/tasks           | Get all tasks       
POST   | /api/task            | Create a new task   
PUT    | /api/task/{id}       | Update a task       
DELETE | /api/task/{id}       | Delete a task       
GET    | /api/health          | Check API health    

## 🖥️ Frontend Setup

### 🔗 Open in Browser

cd frontend  
start index.html     # Windows  
open index.html      # macOS

Make sure the backend is running at http://localhost:8080.

### ✨ Frontend Features

- Add a new task
- Edit existing tasks
- Delete tasks
- Fetch and show all tasks in real-time

## 🧪 Sample MongoDB Data

If you want to seed some tasks manually:

use todo_db  
db.tasks.insertMany([
{ title: "Finish backend", description: "Implement Spring Boot APIs" },
{ title: "Connect frontend", description: "Use fetch to call backend" }
])

## 🛠️ Troubleshooting

- CORS error?  
  Ensure your controller includes: @CrossOrigin("*")

- MongoDB not running?  
  Run it in Docker:  
  docker run -d -p 27017:27017 --name mongo mongo

- Frontend not fetching data?  
  Make sure backend is accessible at http://localhost:8080

## ✅ Credits

Built as a Junior Developer Assignment using clean full-stack architecture.
