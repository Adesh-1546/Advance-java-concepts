# Inter-Thread Communication in Java

Inter-thread communication allows threads to coordinate with each other while working on shared resources.

---

## 🔑 Key Methods

### 1. wait()

* Causes thread to wait
* Releases lock
* Must be inside synchronized block

---

### 2. notify()

* Wakes up one waiting thread

---

### 3. notifyAll()

* Wakes up all waiting threads

---

## ⚙️ Requirements

* Must be used inside synchronized method/block
* Works on object monitor (lock)

---

## 🔄 Flow

1. Thread calls wait() → goes to WAITING
2. Another thread calls notify()
3. Waiting thread resumes execution

---

## 🔥 Example

Producer produces data → Consumer waits
Consumer consumes data → Producer waits

---

## 🔥 Interview Questions

### 1. Difference between wait() and sleep()?

| wait()                  | sleep()               |
| ----------------------- | --------------------- |
| Releases lock           | Does not release lock |
| Used in synchronization | Used for delay        |

---

### 2. Difference between notify() and notifyAll()?

* notify() → wakes one thread
* notifyAll() → wakes all threads

---

### 3. Why wait() inside loop?

To avoid false wake-up (spurious wakeup)

---

## ⚠️ Important Points

* Always use wait() inside loop
* Must be used with synchronized
* Used for thread coordination

---

## 🚀 Summary

Inter-thread communication allows threads to cooperate efficiently using wait(), notify(), and notifyAll().
