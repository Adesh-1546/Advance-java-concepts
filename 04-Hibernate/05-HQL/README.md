# JPQL (Java Persistence Query Language)

JPQL is a query language used in JPA to perform database operations using entity objects instead of tables.

---

## 🔑 What is JPQL?

* Object-oriented query language
* Works on entities, not tables
* Similar to SQL but uses class names

---

## 🔥 Key Difference (SQL vs JPQL)

| SQL         | JPQL         |
| ----------- | ------------ |
| Table name  | Entity class |
| Column name | Field name   |

---

## 🔥 Common Queries

### 1. SELECT

```java
em.createQuery("from Student", Student.class).getResultList();
```

---

### 2. WHERE

```java
"from Student where age > :age"
```

---

### 3. UPDATE

```java
"update Student set name = :name where id = :id"
```

---

### 4. DELETE

```java
"delete from Student where id = :id"
```

---

## 🔑 Parameters

```java
query.setParameter("age", 20);
```

Used to safely pass values

---

## 🔥 Interview Questions

### 1. What is JPQL?

A query language that works on entity objects.

---

### 2. Difference between SQL and JPQL?

SQL uses tables, JPQL uses entities.

---

### 3. What is named parameter?

A parameter passed using name (e.g., :age)

---

## ⚠️ Important Points

* Use entity name, not table name
* Use field names, not column names
* Always use parameters (avoid hardcoding)

---

## 🚀 Summary

JPQL allows performing database operations using entity objects, making code more object-oriented and database-independent.
