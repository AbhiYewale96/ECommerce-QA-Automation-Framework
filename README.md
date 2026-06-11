# 🚀 QA Automation Testing Framework

## 📌 Project Overview

This project is an automated testing framework developed for the SauceDemo e-commerce application using Selenium WebDriver, Java, TestNG, and Maven.

The framework validates critical business workflows such as user authentication, product management, shopping cart functionality, and checkout processes. It follows the Page Object Model (POM) design pattern to improve test maintainability, scalability, and reusability.

---

## 🎯 Project Objectives

✅ Automate end-to-end testing of core application workflows

✅ Reduce manual testing effort through automation

✅ Validate functional requirements and UI behavior

✅ Generate execution evidence through automated screenshots

✅ Demonstrate industry-standard QA Automation practices

---

## 🛠️ Tech Stack

| Technology              | Purpose                  |
| ----------------------- | ------------------------ |
| Java                    | Programming Language     |
| Selenium WebDriver      | Browser Automation       |
| TestNG                  | Test Execution Framework |
| Maven                   | Dependency Management    |
| Page Object Model (POM) | Test Design Pattern      |
| Git & GitHub            | Version Control          |
| IntelliJ IDEA           | Development Environment  |

---

## 📂 Project Structure

```text
QA-Automation-Project/
│
├── src
│   ├── main
│   └── test
│       ├── base
│       ├── pages
│       ├── tests
│       └── utils
│
├── screenshots/
├── pom.xml
├── testng.xml
├── README.md
├── Test-Scenarios.md
├── Test-Cases.md
└── Test-Execution-Report.md
```

---

## ✅ Automated Test Coverage

### 🔐 Login Module (5 Test Cases)

* Verify login with valid credentials
* Verify login with invalid username
* Verify login with invalid password
* Verify login with invalid username and password
* Verify login with empty credentials

### 🛒 Product Module (6 Test Cases)

* Verify product can be added to cart
* Verify multiple products can be added
* Verify cart quantity updates dynamically
* Verify product removal from cart
* Verify price validation during checkout
* Verify cart persistence after page refresh

### 💳 Checkout Module (1 Test Case)

* Verify successful checkout process

---

## 📊 Test Execution Summary

| Module    | Total Cases | Passed | Failed |
| --------- | ----------- | ------ | ------ |
| Login     | 5           | 5      | 0      |
| Product   | 6           | 6      | 0      |
| Checkout  | 1           | 1      | 0      |
| **Total** | **12**      | **12** | **0**  |

### 🎉 Overall Result

**Pass Rate: 100%**

All automated test cases executed successfully and validated expected application behavior.

---

## 📸 Screenshot Reporting

The framework automatically captures screenshots for:

* ✅ Passed Test Cases
* ❌ Failed Test Cases
* ⚠️ Skipped Test Cases

Screenshots are stored inside the `screenshots` directory for execution evidence and debugging purposes.

---

## ▶️ How to Execute Tests

### Clone Repository

```bash
git clone <repository-url>
```

### Navigate to Project

```bash
cd QA-Automation-Project
```

### Run Tests

```bash
mvn test
```

---

## 🔥 Key Features

✔ Selenium WebDriver Automation

✔ TestNG Framework Integration

✔ Maven Build Management

✔ Page Object Model (POM)

✔ Automated Screenshot Capture

✔ Reusable Framework Structure

✔ Functional & UI Validation

✔ Git Version Control

---

## 📈 Future Enhancements

* Extent Reports Integration
* Data-Driven Testing using Excel
* Cross-Browser Testing
* Jenkins CI/CD Integration
* Parallel Test Execution
* API Testing Integration

---

## 👨‍💻 Author

**Abhishek Yewale**

Aspiring QA Automation Engineer passionate about software quality, test automation, and continuous learning.

---

⭐ If you found this project useful, feel free to star the repository.
