# JSP Implicit Objects

JSP provides built-in objects called implicit objects that can be used directly without declaration.

---

## 🔑 What are Implicit Objects?

Predefined objects available in JSP pages for handling request, response, session, and application data.

---

## 🔥 Important Implicit Objects

| Object      | Description                   |
| ----------- | ----------------------------- |
| request     | Handles client request data   |
| response    | Sends response to client      |
| session     | Stores user data              |
| application | Global application data       |
| out         | Sends output to client        |
| pageContext | Provides access to all scopes |

---

## 🔥 Examples

### Request

```jsp
request.getParameter("username");
```

---

### Session

```jsp
session.setAttribute("user", "Adesh");
```

---

### Application

```jsp
application.setAttribute("appName", "MediConnect");
```

---

### Out

```jsp
out.println("Hello");
```

---

## 🔥 Interview Questions

### 1. What are implicit objects?

Predefined objects available in JSP.

---

### 2. Name some implicit objects.

request, response, session, application, out

---

### 3. Difference between session and application?

| Session   | Application       |
| --------- | ----------------- |
| Per user  | Global            |
| Temporary | Until server runs |

---

## ⚠️ Important Points

* No need to create these objects
* Automatically available in JSP
* Used for data handling

---

## 🚀 Summary

Implicit objects simplify JSP development by providing built-in access to request, session, and application data.
