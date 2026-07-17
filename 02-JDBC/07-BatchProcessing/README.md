# Batch Processing in JDBC

Batch processing allows multiple SQL queries to be executed together, improving performance.

---

## 🔑 What is Batch Processing?

* Executes multiple queries in one go
* Reduces database calls
* Improves performance

---

## ⚙️ How it works

```java
ps.addBatch();
ps.executeBatch();
```

---

## 🔥 Steps

1. Create PreparedStatement
2. Add queries using addBatch()
3. Execute using executeBatch()
4. Commit transaction

---

## 🔥 Advantages

* Faster execution
* Reduces network overhead
* Efficient for bulk operations

---

## 🔥 Example

```java
ps.setInt(1, 1);
ps.setString(2, "Adesh");
ps.addBatch();
```

---

## 🔥 Interview Questions

### 1. What is batch processing?

Executing multiple SQL queries together.

---

### 2. Why use batch processing?

To improve performance.

---

### 3. Which method executes batch?

executeBatch()

---

## ⚠️ Important Points

* Use with PreparedStatement
* Disable auto-commit
* Handle exceptions properly

---

## 🚀 Summary

Batch processing improves performance by executing multiple database operations in a single request.
