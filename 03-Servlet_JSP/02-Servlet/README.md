# Servlet Basics

A Servlet is a Java class used to handle HTTP requests and generate responses.

---

## 🔑 How Servlet Works

1. Client sends request
2. Server forwards to Servlet
3. Servlet processes request
4. Response is sent back

---

## 🔥 Key Methods

### doGet()

* Handles GET requests

---

### doPost()

* Handles POST requests

---

## ⚙️ Example

```java
protected void doGet(HttpServletRequest request, HttpServletResponse response)
```

---

## 🔥 Interview Questions

### 1. What is HttpServlet?

Base class for creating servlets.

---

### 2. Difference between doGet() and doPost()?

| doGet()     | doPost()     |
| ----------- | ------------ |
| Data in URL | Data in body |
| Less secure | More secure  |

---

### 3. What is request and response?

Request → client data
Response → server output

---

## ⚠️ Important Points

* Always set content type
* Use PrintWriter to send response
* Extend HttpServlet class

---

## 🚀 Summary

Servlets handle HTTP requests and responses, forming the backbone of Java web applications.
