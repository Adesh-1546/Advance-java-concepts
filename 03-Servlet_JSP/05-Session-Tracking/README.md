# Session Tracking in Servlets

HTTP is a stateless protocol, meaning it does not remember previous requests. Session tracking is used to maintain user data across multiple requests.

---

## 🔑 What is Session?

* A session stores user data on server
* Each user gets a unique session
* Used in login systems

---

## 🔑 HttpSession

* Created using request.getSession()
* Stores data using setAttribute()

---

## 🔥 Example

```java
HttpSession session = request.getSession();
session.setAttribute("user", "Adesh");
```

---

## 🔑 Cookies

* Stored on client browser
* Used to track user sessions

---

## ⚖️ Session vs Cookies

| Session        | Cookies        |
| -------------- | -------------- |
| Server-side    | Client-side    |
| More secure    | Less secure    |
| Stores objects | Stores strings |

---

## 🔥 Interview Questions

### 1. Why session tracking?

To maintain state between requests.

---

### 2. What is HttpSession?

Server-side storage for user data.

---

### 3. Difference between session and cookies?

Session → server, Cookie → client.

---

### 4. What is getSession(false)?

Returns existing session, does not create new one.

---

## ⚠️ Important Points

* Sessions are used in authentication
* Always invalidate session on logout
* Cookies are automatically managed

---

## 🚀 Summary

Session tracking allows web applications to maintain user data across multiple requests, enabling features like login and personalization.
