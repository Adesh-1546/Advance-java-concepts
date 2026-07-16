# Thread Lifecycle in Java

A thread in Java goes through different states during its execution. This is known as the thread lifecycle.

---

## 🔄 Thread States

### 1. NEW

* Thread is created but not started
* Example: `new Thread()`

---

### 2. RUNNABLE

* Thread is ready to run
* Waiting for CPU scheduling

---

### 3. RUNNING

* Thread is currently executing

---

### 4. WAITING / TIMED WAITING

* Thread is paused
* Methods:

  * sleep()
  * join()
  * wait()

---

### 5. TERMINATED

* Thread has finished execution

---

## 🔁 Lifecycle Flow

```
NEW → RUNNABLE → RUNNING → WAITING → RUNNING → TERMINATED
```

---

## 🔑 Important Methods

* start() → moves thread to RUNNABLE
* sleep() → pauses thread
* join() → waits for another thread
* getState() → returns current state

---

## 🔥 Interview Questions

### 1. What are thread states in Java?

NEW, RUNNABLE, RUNNING, WAITING, TERMINATED

---

### 2. Difference between RUNNABLE and RUNNING?

Runnable → ready
Running → executing

---

### 3. What does join() do?

Main thread waits for another thread to finish.

---

### 4. What is sleep()?

Pauses thread for specific time.

---

## ⚠️ Important Points

* Thread scheduling is handled by JVM
* State may change quickly
* You may not always see exact state

---

## 🚀 Summary

Thread lifecycle represents the different states a thread goes through from creation to termination, controlled by JVM scheduling and thread methods.
