# 🍽️ Scalable Restaurant POS Backend

A high-performance, concurrency-optimized **Point of Sale (POS)** system designed for the F&B industry. This project serves as a deep dive into **Java Core**, multithreading, and scalable backend architecture.

---

## 🎯 Project Scope
This repository focuses exclusively on **Server-side Engineering**. 
* **Backend:** Advanced Spring Boot implementation.
* **Deep Java Core:** Heavy focus on concurrency, multithreading, and memory management.
* **Database:** Relational integrity and optimized query performance.

> [!NOTE]  
> The Frontend is not part of this repository. A web template is used strictly for demonstration purposes to visualize the API capabilities.

---

## 🚀 Live Demo
**Demo Link:** [in progresss]  
*(The UI shown here is a template integrated with the custom Java backend.)*

---

## 🛠️ Technical Architecture



### **Core Stack**
* **Language:** Java (LTS version)
* **Framework:** Spring Boot (Data JPA, Security, Web)
* **Database:** PostgreSQL (Relational mapping & ACID compliance)
* **Caching:** MemoryCache (Optimizing data retrieval latency)
* **Concurrency:** Custom Thread Pooling & Synchronization for real-time order processing.

---

## 🧠 Key Technical Highlights

### 1. High Concurrency Management
Designed to handle peak-hour restaurant traffic. I implemented robust multithreading logic to ensure:
* **Race Condition Prevention:** Ensuring two waiters cannot book the same table simultaneously.
* **Thread Safety:** Using `Concurrent` collections and atomic variables where performance is critical.

### 2. Scalable Monolith Pattern
While the system is a monolith, it follows **Clean Architecture** principles. Each domain (Billing, Menu, Inventory) is decoupled, making it "Cloud-Ready" and easy to migrate to Microservices if needed.

### 3. Database & Caching Strategy
* **PostgreSQL:** Optimized with proper indexing for fast retrieval of transaction history.
* **Memory Caching:** Frequently accessed data (like the daily menu) is cached in-memory to reduce DB load and improve response times.

---

## 📂 Project Structure (Server-side)

```text
src/main/java/com/project/pos/
├── ⚙️ config/         # Concurrency & Cache Configurations
├── 🕹️ controller/     # REST API Endpoints
├── 🧠 service/        # Business Logic & Thread Management
├── 🗄️ repository/     # Data Persistence Layer
└── 📦 model/          # Entities & Data Transfer Objects (DTOs)
