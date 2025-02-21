# Multi-threaded Client-Server Communication in Java

## Overview

This project demonstrates a **multi-threaded client-server communication** in Java using **sockets**. The server listens for incoming connections and spawns a new thread for each client. The client creates multiple concurrent connections to the server and exchanges messages.

---

## Features

✅ Multi-threaded server to handle multiple clients concurrently\
✅ Multi-threaded client to initiate multiple parallel connections\
✅ Efficient resource management using **try-with-resources**\
✅ Socket communication over **port 8010**\
✅ Timeout handling for the server (70 seconds)

---

## Requirements

- Java 8 or later
- Any Java IDE (e.g., IntelliJ IDEA, Eclipse, VS Code)

---

## How It Works

### **Server (****`Server.java`****)**

- Creates a **ServerSocket** on port **8010**.
- Listens for incoming client connections.
- For each client, starts a **new thread** to handle communication.
- Sends a **greeting message** to the client.

### **Client (****`Client.java`****)**

- Creates **100 concurrent connections** to the server using **threads**.
- Each client sends a message to the server.
- Waits for the response and prints it.



## How to Run

### **Step 1: Compile the Code**

```
javac Server.java Client.java
```

### **Step 2: Run the Server**

```
java Server
```

*(The server will start listening on port 8010.)*

### **Step 3: Run the Client**

```
java Client
```

*(100 clients will connect to the server, send messages, and receive responses.)*

---

## Expected Output

### **Server Output**

```
Server is listening on port 8010
Accepted Connection: /127.0.0.1:XXXXX
Accepted Connection: /127.0.0.1:XXXXX
...
```

### **Client Output**

```
Response from Server: Hello from server /127.0.0.1
Response from Server: Hello from server /127.0.0.1
...
```

---

## Notes

- The **server runs indefinitely** until stopped manually.
- The **server timeout** is **70 seconds**, after which it will throw a `SocketTimeoutException` if no connection is made.
- Clients **terminate after receiving the server response**.

---

## Enhancements (Future Improvements)

- Use **ThreadPoolExecutor** for better performance instead of creating a new thread per client.
- Implement **bidirectional communication** (server can also read messages from clients).
- Add **logging** instead of using `System.out.println()`.
- Implement **secure communication** with SSL/TLS.

---

## Author

**Your Name**

Feel free to contribute or report issues!

Devesh
