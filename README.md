MyFirstWebApp
Project Overview
MyFirstWebApp is a simple Java-based web application built using the Spring Boot framework. It demonstrates basic web application functionality and the use of Spring Boot features like dependency injection, security, and structured project organization.

Directory Structure
hello/: Module or component related to greeting functionalities.
login/: Handles user authentication and login processes.
security/: Manages application security configurations and user authorization.
todo/: Manages "To-Do" tasks and related operations.
Tech Stack
Language: Java
Framework: Spring Boot
Tools: Eclipse IDE, JUnit for testing
Features
User Login: Secure authentication for users.
Task Management: Add, update, and delete To-Do tasks.
Spring Security: Configured for secure access to the application.
Modular Design: Organized structure with components like hello, login, security, and todo.
Setup Instructions
Prerequisites:
Java JDK (version 11 or higher)
Maven (to build the project)
Eclipse IDE (or any IDE of choice)
Git (for version control)
Steps:
Clone the repository:

bash
Copy code
git clone <repository_url>
cd MyFirstWebApp
Import the project into Eclipse:

File → Import → Maven → Existing Maven Projects → Select the directory.
Build and run the project:

bash
Copy code
mvn clean install
mvn spring-boot:run
Access the application:

Open a browser and navigate to: http://localhost:8080
Testing
The project includes unit tests written using JUnit. Run the tests using:

bash
Copy code
mvn test
Author
Developed by Adarsh Gaurav.

License
This project is licensed under the MIT License.
