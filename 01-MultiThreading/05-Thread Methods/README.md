# Thread Methods in Java

Thread methods are used to control the execution and behavior of threads.

---

## 🔑 Important Methods

### 1. sleep()

* Pauses the current thread for a specified time
* Does NOT release lock

```java
Thread.sleep(2000);
```

---

### 2. join()

* Makes one thread wait for another thread to finish

```java
t1.join();
```

---

### 3. yield()

* Suggests scheduler to give chance to other threads
* Not guaranteed

```java
Thread.yield();
```

---

### 4. setPriority()

* Sets thread priority (1 to 10)

```java
t1.setPriority(Thread.MAX_PRIORITY);
```

---

## ⚖️ sleep() vs wait()

| sleep()               | wait()                 |
| --------------------- | ---------------------- |
| Does not release lock | Releases lock          |
| Used for delay        | Used for communication |

---

## 🔥 Interview Questions

### 1. What does sleep() do?

Pauses thread for given time.

---

### 2. What does join() do?

Makes current thread wait for another thread.

---

### 3. What is yield()?

Gives hint to scheduler to switch thread.

---

### 4. What is thread priority?

Value (1–10) that suggests execution priority.

---

## ⚠️ Important Points

* join() ensures execution order
* sleep() is time-based pause
* yield() is not guaranteed
* Priority does not guarantee execution order

---

## 🚀 Summary

Thread methods help manage execution flow by controlling timing, order, and scheduling of threads.
