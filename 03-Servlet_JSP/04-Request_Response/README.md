# Request & Response in Servlets

Servlets handle client-server communication using HttpServletRequest and HttpServletResponse objects.

---

## 🔑 HttpServletRequest

Used to get data from client

### Common Methods:

* getParameter() → form data
* getAttribute() → server-side data
* getRequestDispatcher() → forward request

---

## 🔑 HttpServletResponse

Used to send data to client

### Common Methods:

* setContentType()
* getWriter()

---

## 🔄 Flow

1. Client submits form
2. Request goes to servlet
3. Servlet processes data
4. Response sent back

---

## 🔥 Example

```java
String name = request.getParameter("username");
```

---

## 🔥 Forwarding

```java
request.getRequestDispatcher("response").forward(request, response);
```

---

## 🔥 Interview Questions

### 1. What is HttpServletRequest?

Used to read client data.

---

### 2. What is HttpServletResponse?

Used to send response to client.

---

### 3. Difference between getParameter() and getAttribute()?

| getParameter() | getAttribute() |
| -------------- | -------------- |
| Client data    | Server data    |

---

### 4. What is forwarding?

Passing request to another resource on server.

---

## ⚠️ Important Points

* Request object carries client data
* Response object sends output
* Forward keeps same request

---

## 🚀 Summary

HttpServletRequest and HttpServletResponse are used to handle communication between client and server in Java web applications.
