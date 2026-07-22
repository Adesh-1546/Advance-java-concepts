# Mini Project: Login System (Servlet + JSP)

This mini project demonstrates a simple login system using Servlets, JSP, and session tracking.

---

## 🔑 Features

* User login form
* Session-based authentication
* Protected home page
* Logout functionality

---

## 🔄 Flow

1. User enters credentials in login.jsp
2. LoginServlet validates input
3. Session is created on success
4. User redirected to home.jsp
5. LogoutServlet invalidates session

---

## 🔥 Technologies Used

* Servlets
* JSP
* HttpSession

---

## 🔐 Authentication Logic

```java
if ("admin".equals(user) && "1234".equals(pass))
```

---

## 🔥 Interview Questions

### 1. How session is used here?

Session stores logged-in user.

---

### 2. How page is protected?

By checking session attribute.

---

### 3. How logout works?

Session is invalidated.

---

## ⚠️ Limitations

* Hardcoded credentials
* No database integration

---

## 🚀 Summary

This project demonstrates basic authentication using Servlets and JSP with session management.
