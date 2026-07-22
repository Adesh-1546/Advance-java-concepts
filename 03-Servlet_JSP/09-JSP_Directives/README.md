# JSP Directives

JSP directives provide global instructions to the JSP container and affect the entire page.

---

## 🔑 What are JSP Directives?

They are used to configure JSP pages, include files, and use tag libraries.

---

## 🔥 Types of Directives

### 1. Page Directive

```jsp
<%@ page language="java" contentType="text/html" %>
```

Used to define page-level settings.

---

### 2. Include Directive

```jsp
<%@ include file="header.jsp" %>
```

Includes another file at compile time.

---

### 3. Taglib Directive

```jsp
<%@ taglib uri="..." prefix="c" %>
```

Used to include custom tag libraries (like JSTL).

---

## 🔥 Example

```jsp
<%@ page contentType="text/html" %>
<%@ include file="header.jsp" %>
```

---

## 🔥 Interview Questions

### 1. What are JSP directives?

Instructions that affect the entire JSP page.

---

### 2. Types of directives?

Page, Include, Taglib

---

### 3. Difference between include directive and action tag?

| Include Directive | Action Tag      |
| ----------------- | --------------- |
| Compile time      | Runtime         |
| Static include    | Dynamic include |

---

## ⚠️ Important Points

* Directives are processed at compile time
* Affect entire JSP page
* Do not produce output directly

---

## 🚀 Summary

JSP directives are used to configure pages, include files, and integrate tag libraries, making JSP development more flexible.
