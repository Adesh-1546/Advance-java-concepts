# Connection Pooling in JDBC (HikariCP)

Connection pooling is used to manage database connections efficiently by reusing them instead of creating new ones every time.

---

## 🔑 What is Connection Pooling?

* Maintains a pool of database connections
* Reuses connections instead of creating new ones
* Improves performance

---

## 🔥 Why Needed?

Without pooling:

* Each request → new connection (slow)

With pooling:

* Reuse existing connections (fast)

---

## ⚙️ HikariCP

* Fastest JDBC connection pool
* Lightweight and widely used

---

## 🔧 Dependency (Maven)

```xml
<dependency>
    <groupId>com.zaxxer</groupId>
    <artifactId>HikariCP</artifactId>
    <version>5.1.0</version>
</dependency>
```

---

## 🔥 Steps

1. Configure HikariConfig
2. Create HikariDataSource
3. Get connection
4. Execute query
5. Close pool

---

## 🔥 Interview Questions

### 1. What is connection pooling?

Reusing database connections for better performance.

---

### 2. Why use HikariCP?

Fast and efficient connection pool.

---

### 3. What is DataSource?

Factory for database connections.

---

## ⚠️ Important Points

* Reduces overhead of creating connections
* Improves application performance
* Used in real-world backend systems

---

## 🚀 Summary

Connection pooling improves performance by reusing database connections instead of creating new ones repeatedly.
