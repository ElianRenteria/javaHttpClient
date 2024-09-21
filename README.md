
# Simple Java HTTP Client

This project demonstrates a simple HTTP client in Java using the Apache HttpClient library. It provides two main functions: making HTTP GET and POST requests.

## Prerequisites

- **Java 17 or later**: Ensure that you have Java 17+ installed.
- **Apache Maven**: Make sure Maven is installed and configured on your system.

## Getting Started

### 1. Clone the Repository

To get started, clone the repository to your local machine.

```bash
git clone <repository-url>
cd <repository-folder>
```

### 2. Compile and Run the Application

You can compile the project using Maven.

```bash
mvn clean compile
```

To run the application:

```bash
mvn exec:java -Dexec.mainClass="com.example.App"
```

This will execute the `App` class.

### 3. Usage of HTTP Client

The `HttpClient` class provides two static methods:

- **GET Request**: To send a GET request to a specific URL.
- **POST Request**: To send a POST request with a JSON payload to a specified URL.

#### Example Usage

In the `App.java` file, you can use the HTTP client as follows:

```java
package com.example;

public class App {
    public static void main(String[] args) {
        // Sending a GET request
        System.out.println("GET Request:");
        HttpClient.get("http://httpbin.org/get");

        // Sending a POST request with a JSON payload
        String jsonPayload = "{"name":"John", "age":30}";
        System.out.println("\nPOST Request:");
        HttpClient.post("http://httpbin.org/post", jsonPayload);
    }
}
```

### 4. Build and Run Example

To build and run the example code in `App.java`:

```bash
mvn compile exec:java -Dexec.mainClass="com.example.App"
```

### Dependencies

This project uses the following dependencies:

- **Apache HttpClient**: The HTTP client library for making GET and POST requests.
  
Add the following dependency to the `pom.xml` file:

```xml
<dependency>
    <groupId>org.apache.httpcomponents</groupId>
    <artifactId>httpclient</artifactId>
    <version>4.5.13</version>
</dependency>
```

### 5. License

This project is licensed under the MIT License.
