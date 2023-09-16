# Blood4All - Bridging Lives through Blood Donation

Blood4All is a humanitarian initiative designed to facilitate blood donations and connect donors with those in need. This comprehensive project comprises both frontend and backend components and offers several APIs for efficient data retrieval and user management.

## Important Note

To use this backend, you must have "SpringToolSuite4" installed. Additionally, to run all backend services, you need to create a PostgreSQL database. If you wish to use another database, ensure you add all the necessary dependencies for that database to the `pom.xml` file in each service. You must also configure your database in the `application-dev.properties` file in each service. The path to this file in each service is `src/main/resources`.

**Key Technologies:**

- ![HTML5](https://cdn0.iconfinder.com/data/icons/social-media-2183/512/social__media__social_media__html_5_-1024.png) HTML5
- ![CSS3](https://cdn2.iconfinder.com/data/icons/neon-line-social-circles/100/Neon_Line_Social_Circles_50Icon_10px_grid-07-1024.png) CSS3
- ![JavaScript](https://cdn1.iconfinder.com/data/icons/development-2-yellow/60/30_-Javascript-_development_coding_programming_code-1024.png) JavaScript
- ![AJAX](https://cdn1.iconfinder.com/data/icons/programming-15/100/ProgrammingC_AJAX-1024.png) AJAX

## Backend

The backend is organized into microservices, each dedicated to a specific purpose.

**Key Technologies:**

- ![Spring Boot](https://www.vectorlogo.zone/logos/springio/springio-icon.svg) Spring Boot
- ![PostgreSQL](https://www.vectorlogo.zone/logos/postgresql/postgresql-icon.svg) PostgreSQL

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

For inquiries or assistance, please contact Amitabh Chaurasia:

[![LinkedIn](https://cdn3.iconfinder.com/data/icons/free-social-icons/67/linkedin_circle_color-1024.png)](https://www.linkedin.com/in/amitabh-chaurasia-6883591b7/)
[![Email](https://cdn4.iconfinder.com/data/icons/social-media-logos-6/512/112-gmail_email_mail-1024.png)](mailto:amitabh.12004548@lpu.in)
