# Hibernate & JPA Configuration

This module includes two configuration approaches:

1. Hibernate Configuration (hibernate.cfg.xml)
2. JPA Configuration (persistence.xml)

Both are used to connect Java applications with a database, but they follow different APIs.

---

## 🔑 1. Hibernate Configuration (hibernate.cfg.xml)

Used with:

* Hibernate Session API

### Purpose

* Configure database connection
* Define Hibernate properties
* Map entity classes

### Example Usage

```java
SessionFactory factory = new Configuration().configure().buildSessionFactory();
Session session = factory.openSession();
```

---

## 🔑 2. JPA Configuration (persistence.xml)

Used with:

* JPA EntityManager API (implemented by Hibernate)

### Purpose

* Define persistence unit
* Configure database connection
* Manage entities using JPA

### Example Usage

```java
EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
EntityManager em = emf.createEntityManager();
```

---

## ⚖️ Difference Between Both

| Hibernate (cfg.xml) | JPA (persistence.xml) |
| ------------------- | --------------------- |
| Uses Session API    | Uses EntityManager    |
| Hibernate-specific  | Standard JPA          |
| More control        | More abstraction      |
| Older approach      | Modern approach       |

---

## 🔥 When to Use What?

* Use **hibernate.cfg.xml** when working with Hibernate Session
* Use **persistence.xml** when working with JPA (EntityManager)

---

## ⚠️ Important Points

* Do not mix both APIs in the same logic flow
* Choose one approach per implementation
* JPA is preferred in modern applications

---

## 🚀 Summary

Hibernate configuration uses hibernate.cfg.xml for Session-based operations, while JPA uses persistence.xml for EntityManager-based operations. Hibernate can act as the implementation for JPA.
