# Hibernate (ORM Framework)

This module covers Hibernate and JPA concepts used to interact with relational databases using Java objects instead of SQL.

---

## 📚 Topics Covered

### 1. Basics

* What is Hibernate
* ORM (Object Relational Mapping)
* Hibernate vs JDBC

---

### 2. Configuration

* hibernate.cfg.xml (Session API)
* persistence.xml (JPA / EntityManager)

---

### 3. Entity Mapping

* @Entity
* @Table
* @Id
* @GeneratedValue

---

### 4. CRUD Operations ⭐

* Insert (persist / save)
* Read (find / get)
* Update (merge / update)
* Delete (remove / delete)

---

### 5. JPQL (Hibernate Query Language) ⭐

* SELECT
* WHERE
* UPDATE
* DELETE

---

## 🔄 Overall Workflow

### Hibernate (Session API)

1. Configure using hibernate.cfg.xml
2. Create SessionFactory
3. Open Session
4. Perform CRUD
5. Close Session

---

### JPA (EntityManager)

1. Configure using persistence.xml
2. Create EntityManagerFactory
3. Create EntityManager
4. Perform CRUD
5. Close EntityManager

---

## 🔑 Key Concepts

* ORM maps objects to database tables
* Entity represents a table
* Session / EntityManager interacts with database
* JPQL works on objects instead of tables

---

## 🔥 Interview Questions

### 1. What is Hibernate?

ORM framework used to map Java objects to database tables.

---

### 2. What is JPA?

Java specification for ORM implemented by Hibernate.

---

### 3. Difference between Hibernate and JPA?

| Hibernate      | JPA                |
| -------------- | ------------------ |
| Implementation | Specification      |
| Uses Session   | Uses EntityManager |

---

### 4. What is JPQL?

Query language that works on entities.

---

## ⚠️ Important Points

* Avoid writing raw SQL
* Always use transactions for write operations
* Use EntityManager in modern applications
* Do not mix Session API and EntityManager in same flow

---

## 🚀 Purpose

* Simplify database operations
* Reduce boilerplate code
* Prepare for Spring Boot & JPA

---

## 📌 Conclusion

Hibernate enables object-based database interaction, and JPA provides a standardized approach, forming the foundation for modern Java backend development.

