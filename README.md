# Employee_Data_Management

Project Overview

Employee Data Management is a simple web application built with Spring Boot, Spring Data JPA, MySQL, and REST APIs. It allows users to add, view, update, and delete employee records like name, email, department, and salary.

Technologies Used:

Java 17+

Spring Boot 3

Spring Data JPA

MySQL 8+

Maven

RESTful APIs

Optional frontend with HTML/JS

Project Structure
employee_data_management/
│
├── src/
│   ├── main/java/com/example/employee_data_management/
│   │   ├── controller/EmployeeController.java
│   │   ├── entity/Employee.java
│   │   ├── service/EmployeeService.java
│   │   ├── service/EmployeeServiceImpl.java
│   │   └── repository/EmployeeRepository.java
│   │   └── EmployeeDataManagementApplication.java
│   └── main/resources/
│       └── application.properties
│
├── .gitignore
├── pom.xml
└── README.md

atabase Setup

Database Name: dataofcompany

Steps:

Create the database in MySQL:

CREATE DATABASE dataofcompany;


Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/dataofcompany
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
server.port=8080


Access APIs:
- `GET http://localhost:8080/api/employees`
- `POST http://localhost:8080/api/employees`
- `PUT http://localhost:8080/api/employees/{id}`
- `DELETE http://localhost:8080/api/employees/{id}`

## Frontend
A simple HTML/JS frontend is available at `src/main/resources/static/index.html`.


Running the Project
Build
mvn clean install

Run
mvn spring-boot:run


Or run EmployeeDataManagementApplication.java from your IDE.

The app runs at:

http://localhost:8080
