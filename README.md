# Blood4All - Project Overview

Blood4All is a project aimed at facilitating blood donations and connecting donors with those in need. This project consists of both frontend and backend components, and it offers several APIs for data retrieval and user management.

## Frontend

For the frontend, we used HTML, CSS, JavaScript, and AJAX for data processing. You can customize the frontend to suit your needs. Here are the APIs available on the local machine with the same backend:

- **Find Blood by Group, State, and City:**
  - http://localhost:8082/blood/${bloodGroup}/${state}/${city}

- **Find Blood Donor by Blood Group:**
  - http://localhost:8082/blood/${bloodGroup}

- **User Login and Status Update:**
  - http://localhost:8083/login/${userID}/${password}
  - http://localhost:8083/login/${userID}
  - http://localhost:8083/update/${userID}/${availabilityStatus}

- **User Registration:**
  - http://localhost:8081/blood

## Backend

The backend is divided into microservices, each serving a specific purpose:

### bloodDataInput

This service is for adding new users or donors, and it has one API endpoint:

- http://localhost:8081/blood

To understand the parameters it accepts, please visit the `bloodDonor.java` file located at `src/main/java/bloodDataInput`.

### BloodDonorList

This service is for listing all donors based on the call, and it has two API endpoints:

- http://localhost:8082/blood/${bloodGroup}
- http://localhost:8082/blood/${bloodGroup}/${state}/${city}

### logInService

This service handles user login and availability status updates, and it has three API endpoints:

- http://localhost:8083/login/${userID}/${password}
- http://localhost:8083/login/${userID}
- http://localhost:8083/update/${userID}/${availabilityStatus}

Feel free to explore these APIs to integrate Blood4All into your applications.

For any inquiries or assistance, please contact [Your Contact Information].
