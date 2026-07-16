# JDBC Introduction

JDBC (Java Database Connectivity) is an API used to connect Java applications with databases and execute SQL queries.

---

## 📌 Why JDBC?

* To interact with databases (MySQL, Oracle, PostgreSQL)
* To perform CRUD operations
* To fetch and update data

---

## 🔑 Key Components

* DriverManager
* Connection
* Statement / PreparedStatement
* ResultSet

---

## ⚙️ How JDBC Works

1. Java application sends request
2. JDBC API communicates with DriverManager
3. DriverManager selects appropriate driver
4. Driver connects to database
5. SQL query is executed
6. Result is returned to application

---

## 🔥 JDBC Flow

```text
Java App → JDBC API → DriverManager → JDBC Driver → Database
```

---

## 🧠 Example Use Case

* Login system
* Fetching user data
* Updating records

---

## 🚀 Summary

JDBC provides a standard way to connect Java applications with databases and perform operations using SQL.
