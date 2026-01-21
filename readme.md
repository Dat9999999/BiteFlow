# 🛒 OrderFlow - Retail POS Backend (Java Monolith MVC)

Inventory management and Point of Sale (POS) system focused on inventory data accuracy and traceability.

---

## 🎯 Project Objectives
Build a Java Monolith (MVC) Backend system to manage the flow of goods between the Central Warehouse and Branches, while supporting over-the-counter sales. The system prioritizes inventory data accuracy and auditability.

---

## 🛠️ Tech Stack
* **Language:** Java 21 (LTS)
* **Framework:** Spring Boot 3.x
* **View Engine:** Thymeleaf (MVC Monolith model)
* **Database:** PostgreSQL (ACID compliance)
* **ORM:** Spring Data JPA / Hibernate
* **Validation:** Bean Validation (JSR 380)

---

## 📦 Core Entities
* **Product:** Basic information, unique SKU.
* **Store:** Classified into Warehouse (Central) and Retail Store.
* **Inventory:** Stores the actual quantity of each product at each store.
* **Stock Transfer:** Transfer request between two branches.
* **Invoice:** Records direct sales transactions at the store.

---

## 🚀 Functional Requirements

### 1. Inventory Management
* **Multi-branch Inventory View:** Quickly look up product quantities at each branch.
* **Internal Transfer:** Create transfer requests from A to B.
  * Status: `PENDING` -> `SHIPPING` -> `COMPLETED` (or `CANCELLED`).
  * Logic: Upon `COMPLETED`, the system automatically deducts from Warehouse A and adds to Warehouse B within the same Transaction.
* **Low Stock Alert (Safety Stock):** Display alerts when stock levels at a branch fall below a defined threshold.

### 2. Point of Sale (POS)
* **Quick Order Creation:** Select products and quantities for sale.
* **Real-time Inventory Check:** Prevent sales if the requested quantity exceeds actual stock at that branch.
* **Checkout:** 
  * Calculate total amount (including VAT).
  * Deduct inventory immediately.
  * Save transaction history for reconciliation.

### 3. Reporting & Audit
* **Revenue Statistics:** By branch and time period.
* **Inventory Audit Log:** Detailed tracking of who moved/added/removed items and when.

---

## 🧠 Backend Practices
* **Transaction Management:** Apply `@Transactional` to all business logic involving multi-table data changes.
* **Concurrency Control:** Use **Pessimistic Locking** for stock deduction operations to avoid Race Conditions.
* **Exception Handling:** Centralized error handling using `@ControllerAdvice`, returning user-friendly messages.
* **DTO Pattern:** Use DTOs for data transfer between Entity and View to ensure security and flexibility.

---

## 📂 Project Structure
```text
src/main/java/com/example/orderflow/
├── ⚙️ config/         # Security, JPA configurations, etc.
├── 🕹️ controller/     # Routing and Request handling (MVC)
├── 🧠 service/        # Core business logic
├── 🗄️ repository/     # Data access layer
├── 📦 model/          # Entities & DTOs
└── 🛡️ exception/      # Centralized exception handling
```
