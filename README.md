# 🚀 E-Commerce QA Automation Framework

![Java](https://img.shields.io/badge/Java-17%2B-orange?logo=openjdk&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-WebDriver-43B02A?logo=selenium&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-Testing_Framework-red)
![Maven](https://img.shields.io/badge/Maven-Build_Tool-C71A36?logo=apachemaven&logoColor=white)
![Test Cases](https://img.shields.io/badge/UI_Test_Cases-18-blue)
![Design Pattern](https://img.shields.io/badge/Design_Pattern-POM-informational)

A scalable **End-to-End (E2E) Test Automation Framework** developed using **Java, Selenium WebDriver, TestNG, and Maven** to validate critical user workflows in the [SauceDemo E-Commerce Application](https://www.saucedemo.com/).

Built using the **Page Object Model (POM)** design pattern, this framework focuses on maintainable automation, reusable components, functional validation, negative testing, and automated screenshot capture.

## 📌 Key Features

- **Page Object Model (POM):** Separates page locators and reusable actions from test logic.
- **End-to-End Testing:** Automates login, product selection, cart management, and checkout workflows.
- **Functional & Negative Testing:** Validates successful scenarios, invalid credentials, and checkout form errors.
- **TestNG Integration:** Organizes test cases and provides assertions and test execution management.
- **Screenshot Capture:** Supports capturing test execution evidence for debugging and failure analysis.
- **Maven Integration:** Manages dependencies and simplifies test execution.
- **Reusable Architecture:** Organizes base setup, page objects, test classes, and utility components.
- **Test Reporting:** Supports reviewing execution results through configured TestNG reports.

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| [Java](https://www.oracle.com/java/) | Programming language |
| [Selenium WebDriver](https://www.selenium.dev/documentation/webdriver/) | Browser automation |
| [TestNG](https://testng.org/) | Test execution and assertions |
| [Apache Maven](https://maven.apache.org/) | Dependency management |
| [Page Object Model](https://www.selenium.dev/documentation/test_practices/encouraged/page_object_models/) | Automation design pattern |
| [Apache POI](https://poi.apache.org/) | Excel data handling, if configured |
| [Git](https://git-scm.com/) | Version control |
| [GitHub](https://github.com/) | Source code hosting |

## 🏗️ Project Structure

```text
ECommerce-QA-Automation-Framework/
│
├── Report/                         # Test execution reports
├── Screenshots/                    # Captured test screenshots
├── Sheet/                           # Test data files
│
├── src/
│   └── test/
│       ├── java/
│       │   ├── base/
│       │   │   └── BaseTest.java
│       │   │
│       │   ├── pages/
│       │   │   ├── LoginPage.java
│       │   │   ├── ProductsPage.java
│       │   │   ├── CartPage.java
│       │   │   └── CheckoutPage.java
│       │   │
│       │   ├── tests/
│       │   │   ├── LoginTest.java
│       │   │   ├── ProductTest.java
│       │   │   └── CheckoutTest.java
│       │   │
│       │   └── utils/
│       │       ├── ConfigReader.java
│       │       ├── ExcelUtils.java
│       │       └── ScreenshotUtils.java
│       │
│       └── resources/
│           ├── testng.xml
│           └── config.properties
│
├── .gitignore
├── pom.xml
└── README.md
```

*Note: The structure reflects the documented framework layout. Keep entries that exist in the actual repository.*

## 🧪 Test Coverage

### 1. Authentication — `LoginTest.java`

**7 Test Scenarios**

- Login with valid credentials
- Login with an invalid username
- Login with an invalid password
- Login with invalid username and password
- Validation for an empty username
- Validation for an empty password
- Validation when both fields are empty

### 2. Product & Shopping Cart — `ProductTest.java`

**6 Test Scenarios**

- Verify a product can be added to the cart
- Verify multiple products can be added
- Validate dynamic cart badge updates
- Verify product removal from the cart
- Validate product prices during checkout
- Verify cart state after a page refresh

### 3. Checkout — `CheckoutTest.java`

**5 Test Scenarios**

- Complete a successful checkout
- Validate missing first name
- Validate missing last name
- Validate missing postal code
- Validate submission with all required fields empty

## 📊 Test Execution Summary

| Module | Test Cases | Passed | Failed |
|---|---:|---:|---:|
| Authentication | 7 | 7 | 0 |
| Product & Cart | 6 | 6 | 0 |
| Checkout | 5 | 5 | 0 |
| **Total** | **18** | **18** | **0** |

**Reported Pass Rate: 100%**

*The figures above reflect the supplied execution summary. Verify them against the latest TestNG report before publishing.*

## 📸 Screenshot Reporting

The framework includes screenshot utilities to support test execution evidence and troubleshooting.

- **Failure Evidence:** Capture screenshots when a test fails, if configured.
- **Visual Validation:** Review the browser state during test execution.
- **Debugging Support:** Use screenshots to investigate unexpected UI behavior.

Screenshots are saved to the configured output directory.

## ⚙️ Getting Started

### Prerequisites

- [Java JDK](https://adoptium.net/)
- [Apache Maven](https://maven.apache.org/download.cgi)
- [Git](https://git-scm.com/downloads)
- [Google Chrome](https://www.google.com/chrome/) or another configured browser

### Installation

**1. Clone the repository**

```bash
git clone https://github.com/AbhiYewale96/QA-Automation-Project.git
```

**2. Navigate to the project directory**

```bash
cd QA-Automation-Project
```

**3. Compile the project**

```bash
mvn clean compile
```

**4. Execute the test suite**

```bash
mvn test
```

**5. Review test reports**

Check the Maven Surefire reports, typically generated under:

```text
target/surefire-reports/
```

The exact report and screenshot locations depend on the framework configuration.

## ▶️ Test Execution Commands

| Execution Goal | Command |
|---|---|
| Run automated tests | `mvn test` |
| Clean and run tests | `mvn clean test` |
| Compile project | `mvn clean compile` |

## 🔗 Useful Resources

- **Application Under Test:** [SauceDemo](https://www.saucedemo.com/)
- **Selenium Documentation:** [Official Documentation](https://www.selenium.dev/documentation/)
- **TestNG Documentation:** [Official Documentation](https://testng.org/)
- **Maven Documentation:** [Official Documentation](https://maven.apache.org/guides/)

## 📈 Future Enhancements

- Integrate ExtentReports for detailed execution reports.
- Expand data-driven testing with Excel and TestNG DataProviders.
- Add cross-browser test execution.
- Implement parallel test execution.
- Integrate automated testing into GitHub Actions or Jenkins.
- Extend coverage with REST API testing using REST Assured.

## 👨‍💻 Author

**Abhishek Yewale**

QA Automation Engineer | Aspiring SDET

GitHub: [@AbhiYewale96](https://github.com/AbhiYewale96)

---

⭐ If you find this project useful, feel free to explore the repository and share feedback.
