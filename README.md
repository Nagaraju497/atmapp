# Java ATM Application

## Overview

This is a **Java-based ATM Application** that simulates core banking operations, designed to demonstrate **Object-Oriented Programming (OOP) concepts**, **Exception Handling**, and **File Handling** in Java. It allows account holders to perform secure transactions while storing data persistently in files.

---

## Features

* **User Authentication**
  Secure login using **Account Number** and **PIN**.

* **Account Operations**

  * Withdraw money (with validation for sufficient balance and multiples of 100)
  * Deposit money (in multiples of 100)
  * Check account balance

* **Data Persistence**
  Account details and transaction history are saved and retrieved using **File Handling**.

* **Robust Exception Handling**

  * Handles invalid inputs (e.g., wrong PIN, insufficient balance)
  * Manages file-related exceptions gracefully

* **Object-Oriented Design**
  Demonstrates key OOP principles:

  * **Classes and Objects** – Separate classes for Account, ATM, and Transactions
  * **Encapsulation** – Private variables with getter/setter methods
  * **Inheritance & Polymorphism** – Extendable design for future features

---

## Core Concepts Demonstrated

1. **OOP (Object-Oriented Programming)**

   * Modular code structure
   * Reusability and scalability

2. **Exception Handling**

   * `try-catch` blocks for runtime errors
   * Custom exceptions for invalid transactions

3. **File Handling**

   * Reading and writing account data to text files
   * Persistent storage to simulate real banking scenarios

---

## Technologies Used

* Java SE 8+
* File I/O (`FileReader`, `FileWriter`, `BufferedReader`, `BufferedWriter`)
* Exception Handling (`try-catch`, `throws`)

---

## How to Run

1. Clone the repository:

```bash
git clone https://github.com/your-username/java-atm-application.git
```

2. Navigate to the project directory:

```bash
cd java-atm-application
```

3. Compile the Java files:

```bash
javac *.java
```

4. Run the application:

```bash
java Main
```

---

## Future Enhancements

* Integration with a **GUI interface**
* Database storage using **MySQL**
* Support for multiple account types
* Transaction history and mini-statements

---

## Author

**Sunkara Nagaraju**

* Email: sunkaranagaraju07@gmail.com
* GitHub: https://github.com/Nagaraju497

