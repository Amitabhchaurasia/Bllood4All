# Blood4All - Bridging Lives through Blood Donation

Blood4All is a humanitarian initiative designed to facilitate blood donations and connect donors with those in need. This comprehensive project comprises both frontend and backend components and offers several APIs for efficient data retrieval and user management.

## Frontend

The frontend of Blood4All is built using HTML, CSS, JavaScript, and AJAX for effective data processing. It's highly customizable to suit your specific requirements.

**Key Technologies:**

- <img src="https://cdn2.iconfinder.com/data/icons/tech-logos-1/512/html5-512.png" alt="HTML5" width="20"> HTML5
- <img src="https://cdn2.iconfinder.com/data/icons/tech-logos-1/512/css3-512.png" alt="CSS3" width="20"> CSS3
- <img src="https://cdn2.iconfinder.com/data/icons/tech-logos-1/512/javascript-512.png" alt="JavaScript" width="20"> JavaScript
- <img src="https://cdn2.iconfinder.com/data/icons/tech-logos-1/512/ajax-512.png" alt="AJAX" width="20"> AJAX

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

- <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="Spring Boot" width="20"> Spring Boot
- <img src="https://www.vectorlogo.zone/logos/postgresql/postgresql-icon.svg" alt="PostgreSQL" width="20"> PostgreSQL

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

For inquiries or assistance, please contact [Amitabh Chaurasia on LinkedIn](https://www.linkedin.com/in/amitabh-chaurasia-6883591b7/).
