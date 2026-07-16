# JDBC Basics

JDBC (Java Database Connectivity) is used to connect Java applications with relational databases.

---

## 🔑 JDBC Architecture

```text
Java Application
       ↓
JDBC API
       ↓
DriverManager
       ↓
JDBC Driver
       ↓
Database
```

---

## 🔌 Types of JDBC Drivers

### 1. Type 1 – JDBC-ODBC Bridge

* Old and not used now

---

### 2. Type 2 – Native API Driver

* Requires native libraries

---

### 3. Type 3 – Network Protocol Driver

* Uses middleware server

---

### 4. Type 4 – Thin Driver (MOST USED)

* Pure Java
* Direct connection to database

---

## 🔥 Steps to Connect to Database

1. Load Driver
2. Establish Connection
3. Create Statement
4. Execute Query
5. Process Result
6. Close Connection

---

## 🔥 Interview Questions

### 1. What is JDBC?

API to connect Java with database.

---

### 2. Which driver is most used?

Type 4 (Thin Driver)

---

### 3. What are JDBC steps?

Load driver → connection → statement → execute → result → close

---

## ⚠️ Important Points

* Always close connection
* Use PreparedStatement for safety
* Handle exceptions properly

---

## 🚀 Summary

JDBC enables database connectivity using drivers and provides standard methods to execute SQL queries in Java.
