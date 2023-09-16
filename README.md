# Blood4All - Bridging Lives through Blood Donation

Blood4All is a humanitarian initiative designed to facilitate blood donations and connect donors with those in need. This comprehensive project comprises both frontend and backend components and offers several APIs for efficient data retrieval and user management.

## Frontend

The frontend of Blood4All is built using HTML, CSS, JavaScript, and AJAX for effective data processing. It's highly customizable to suit your specific requirements.

**Key Technologies:**

- <img src="https://cdn0.iconfinder.com/data/icons/social-media-2183/512/social__media__social_media__html_5_-1024.png" alt="HTML5" width="50"> HTML5
- <img src="https://cdn2.iconfinder.com/data/icons/neon-line-social-circles/100/Neon_Line_Social_Circles_50Icon_10px_grid-07-1024.png" alt="CSS3" width="50"> CSS3
- <img src="https://cdn1.iconfinder.com/data/icons/development-2-yellow/60/30_-Javascript-_development_coding_programming_code-1024.png" alt="JavaScript" width="50"> JavaScript
- <img src="https://cdn1.iconfinder.com/data/icons/programming-15/100/ProgrammingC_AJAX-1024.png" alt="AJAX" width="50"> AJAX

**APIs available on the local machine with the same backend:**

- **Find Blood by Group, State, and City:**  
  - [http://localhost:8082/blood/${bloodGroup}/${state}/${city}](http://localhost:8082/blood/${bloodGroup}/${state}/${city})

- **Find Blood Donor by Blood Group:**  
  - [http://localhost:8082/blood/${bloodGroup}](http://localhost:8082/blood/${bloodGroup})

- **User Login and Status Update:**  
  - [http://localhost:8083/login/${userID}/${password}](http://localhost:8083/login/${userID}/${password})
  - [http://localhost:8083/login/${userID}](http://localhost:8083/login/${userID})
  - [http://localhost:8083/update/${userID}/${availabilityStatus}](http://localhost:8083/update/${userID}/${availabilityStatus})

- **User Registration:**  
  - [http://localhost:8081/blood](http://localhost:8081/blood)

## Backend

The backend is organized into microservices, each dedicated to a specific purpose.

**Key Technologies:**

- <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="Spring Boot" width="50"> Spring Boot
- <img src="https://www.vectorlogo.zone/logos/postgresql/postgresql-icon.svg" alt="PostgreSQL" width="50"> PostgreSQL

### bloodDataInput

This service allows you to add new users or donors and offers one API endpoint:

- [http://localhost:8081/blood](http://localhost:8081/blood)

For detailed information on the parameters it accepts, refer to the `bloodDonor.java` file located at `src/main/java/bloodDataInput`.

### BloodDonorList

Efficiently list all donors based on specific criteria using this service. It provides two API endpoints:

- [http://localhost:8082/blood/${bloodGroup}](http://localhost:8082/blood/${bloodGroup})
- [http://localhost:8082/blood/${bloodGroup}/${state}/${city}](http://localhost:8082/blood/${bloodGroup}/${state}/${city})

### logInService

This service manages user login and availability status updates and offers three API endpoints:

- [http://localhost:8083/login/${userID}/${password}](http://localhost:8083/login/${userID}/${password})
- [http://localhost:8083/login/${userID}](http://localhost:8083/login/${userID})
- [http://localhost:8083/update/${userID}/${availabilityStatus}](http://localhost:8083/update/${userID}/${availabilityStatus})

Feel free to explore these APIs and integrate Blood4All into your applications.

For inquiries or assistance, please contact [Amitabh Chaurasia ![LinkedIn](https://image-url-for-linkedin-icon.com)](https://www.linkedin.com/in/amitabh-chaurasia-6883591b7/).

