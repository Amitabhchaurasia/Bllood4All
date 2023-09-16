# Blood4All - Bridging Lives through Blood Donation

Blood4All is a humanitarian initiative designed to facilitate blood donations and connect donors with those in need. This comprehensive project comprises both frontend and backend components and offers several APIs for efficient data retrieval and user management.

## Table of Contents

- [Important Note](#important-note)
- [Key Technologies](#key-technologies)
- [APIs](#apis)
  - [Find Blood by Group, State, and City](#find-blood-by-group-state-and-city)
  - [Find Blood Donor by Blood Group](#find-blood-donor-by-blood-group)
  - [User Login and Status Update](#user-login-and-status-update)
  - [User Registration](#user-registration)
- [Backend](#backend)
- [Contact](#contact)

## Important Note

To use this backend, you must have "SpringToolSuite4" installed. Additionally, to run all backend services, you need to create a PostgreSQL database. If you wish to use another database, ensure you add all the necessary dependencies for that database to the `pom.xml` file in each service. You must also configure your database in the `application-dev.properties` file in each service. The path to this file in each service is `src/main/resources`.

## Key Technologies

- <img src="https://cdn0.iconfinder.com/data/icons/social-media-2183/512/social__media__social_media__html_5_-1024.png" alt="HTML5" width="20"> HTML5
- <img src="https://cdn2.iconfinder.com/data/icons/neon-line-social-circles/100/Neon_Line_Social_Circles_50Icon_10px_grid-07-1024.png" alt="CSS3" width="20"> CSS3
- <img src="https://cdn1.iconfinder.com/data/icons/development-2-yellow/60/30_-Javascript-_development_coding_programming_code-1024.png" alt="JavaScript" width="20"> JavaScript
- <img src="https://cdn1.iconfinder.com/data/icons/programming-15/100/ProgrammingC_AJAX-1024.png" alt="AJAX" width="20"> AJAX
- <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="Spring Boot" width="20"> Spring Boot
- <img src="https://www.vectorlogo.zone/logos/postgresql/postgresql-icon.svg" alt="PostgreSQL" width="20"> PostgreSQL

## APIs

### Find Blood by Group, State, and City

- [http://localhost:8082/blood/${bloodGroup}/${state}/${city}](http://localhost:8082/blood/${bloodGroup}/${state}/${city})

### Find Blood Donor by Blood Group

- [http://localhost:8082/blood/${bloodGroup}](http://localhost:8082/blood/${bloodGroup})

### User Login and Status Update

- [http://localhost:8083/login/${userID}/${password}](http://localhost:8083/login/${userID}/${password})
- [http://localhost:8083/login/${userID}](http://localhost:8083/login/${userID})
- [http://localhost:8083/update/${userID}/${availabilityStatus}](http://localhost:8083/update/${userID}/${availabilityStatus})

### User Registration

- [http://localhost:8081/blood](http://localhost:8081/blood)

## Backend

The backend is organized into microservices, each dedicated to a specific purpose. For detailed information on each service and its endpoints, please refer to the respective service folders.

## Contact

For inquiries or assistance, please contact Amitabh Chaurasia:

- LinkedIn: [![LinkedIn](https://cdn3.iconfinder.com/data/icons/free-social-icons/67/linkedin_circle_color-1024.png)](https://www.linkedin.com/in/amitabh-chaurasia-6883591b7/)
- Email: [![Email](https://cdn4.iconfinder.com/data/icons/social-media-logos-6/512/112-gmail_email_mail-1024.png)](mailto:amitabh.12004548@lpu.in)
