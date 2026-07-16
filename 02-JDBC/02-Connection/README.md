# JDBC Connection (PostgreSQL)

This module demonstrates how to connect a Java application to a PostgreSQL database using JDBC.

---

## 🔑 Steps to Establish Connection

1. Load PostgreSQL Driver
2. Create Connection using DriverManager
3. Handle exceptions
4. Close connection

---

## ⚙️ Connection URL Format

```java id="pgurl01"
jdbc:postgresql://localhost:5432/database_name
```

---

## 🔥 Example

```java id="pgex01"
Connection con = DriverManager.getConnection(url, username, password);
```

---

## 🔧 Dependency (IMPORTANT)

Add PostgreSQL driver:

### Maven

```xml id="pgxml01"
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.7.3</version>
</dependency>
```

---

## 🔥 Common Errors & Fixes

### 1. Connection refused

* PostgreSQL server not running

---

### 2. Password authentication failed

* Check username/password

---

### 3. No suitable driver

* Add PostgreSQL dependency

---

## 🔥 Interview Questions

### 1. What is JDBC URL for PostgreSQL?

jdbc:postgresql://localhost:5432/dbname

---

### 2. What is default port?

5432

---

### 3. What is Connection?

Represents session with database

---

## ⚠️ Important Points

* Always close connection
* Use correct credentials
* Ensure PostgreSQL server is running

---

## 🚀 Summary

JDBC with PostgreSQL allows Java applications to connect and interact with databases efficiently.
