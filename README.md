# springBootJPA
Spring Boot JPA Student API
This is a Spring Boot application that provides RESTful API endpoints for managing student data. It utilizes Spring Data JPA for database operations.

Prerequisites
Before running the application, make sure you have the following:

Java Development Kit (JDK) installed on your system.
Apache Maven installed on your system.
Getting Started
To run the Spring Boot application, follow these steps:

Clone the repository:

shell
Copy
git clone https://github.com/Abelo73/spring-boot-jpa-student-api.git
```

Navigate to the project directory:

shell
Copy
cd spring-boot-jpa-student-api
```

Build the project using Maven:

shell
Copy
mvn clean install
```

Run the application:

shell
Copy
java -jar target/spring-boot-jpa-student-api.jar
```

The application will start running on http://localhost:8080.

API Endpoints
The following API endpoints are available:

GET /getStudents: Retrieve a list of all students.
GET /getStudentById/{id}: Retrieve a student by ID.
PUT /updateStudent/{id}: Update a student's information by ID.
POST /saveStudent: Save a new student.
POST /saveStudents: Save multiple students.
DELETE /deleteStudent/{id}: Delete a student by ID.
GET /searchStudent/{search}: Search for students by first name, last name, or email.

Technologies Used

Spring Boot
Spring Data JPA
Maven
Contributing
Contributions to the project are welcome! If you would like to contribute, please follow these steps:

Fork the repository on GitHub.
Clone your forked repository to your local machine.
Create a new branch for your feature or bug fix.
Make the necessary changes and commit them.
Push your changes to your forked repository.
Create a pull request on the original repository to submit your changes for review.
License
This project is licensed under the MIT License. See the LICENSE file for more information.

Contact
Name: Abel Adisu
For any questions or inquiries, please contact abeladisu73@gmail.com or +25134777843.
