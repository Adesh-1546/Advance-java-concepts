# Hibernate CRUD using EntityManager (JPA)

CRUD operations can be performed using JPA's EntityManager, which is implemented by Hibernate.

---

## 🔑 Core Components

* EntityManagerFactory
* EntityManager
* EntityTransaction

---

## 🔥 CRUD Methods

### Insert

```java
em.persist(entity);
```

---

### Read

```java
em.find(Entity.class, id);
```

---

### Update

```java
em.merge(entity);
```

---

### Delete

```java
em.remove(entity);
```

---

## 🔄 Workflow

1. Create EntityManagerFactory
2. Create EntityManager
3. Begin Transaction
4. Perform operation
5. Commit
6. Close

---

## 🔥 Interview Questions

### 1. What is EntityManager?

Interface used to interact with persistence context.

---

### 2. Difference between persist() and merge()?

| persist()  | merge()         |
| ---------- | --------------- |
| Insert     | Update          |
| New entity | Existing entity |

---

### 3. Why transaction?

To ensure data consistency.

---

## ⚠️ Important Points

* Always close EntityManager
* Transactions required for write
* EntityManager is not thread-safe

---

## 🚀 Summary

EntityManager simplifies database operations using JPA, with Hibernate acting as the implementation.
