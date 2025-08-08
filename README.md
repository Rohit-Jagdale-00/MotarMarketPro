# MotarMarketPro

MotarMarketPro is a Spring Boot application designed to manage vehicle inventory and sold vehicle records. It provides a RESTful API for performing CRUD (Create, Read, Update, Delete) operations on vehicle and sold vehicle data, along with a simple web interface for interaction.

## Table of Contents

*   [Getting Started](#getting-started)
    *   [Prerequisites](#prerequisites)
    *   [Installation](#installation)
    *   [Running the Application](#running-the-application)
*   [Project Structure](#project-structure)
*   [API Endpoints](#api-endpoints)
*   [Web Interface](#web-interface)
*   [Technologies Used](#technologies-used)
*   [Further Reference](#further-reference)
*   [License](#license)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

*   **Java Development Kit (JDK)**: Version 21 or higher.
*   **Apache Maven**: Version 3.x or higher.
*   **PostgreSQL**: A PostgreSQL database instance for data storage.
*   **Git**: For cloning the repository.
*   **Spring Tool Suite (STS)**: For developing the Spring Boot application.
*   **Visual Studio Code (VS Code)**: For editing HTML, CSS, and JavaScript files.

### Installation

1.  **Clone the repository:**
    ```bash
    git clone <repository_url>
    cd MotarMarketPro
    ```

2.  **Configure the database:**
    *   Create a PostgreSQL database.
    *   Update the `src/main/resources/application.properties` file with your PostgreSQL database connection details (e.g., URL, username, password).
        *   _Note: An `application.properties` file is typically used for Spring Boot database configuration. You'll need to create or modify this file with your specific database credentials._

3.  **Build the project:**
    ```bash
    ./mvnw clean install
    ```
    
### Running the Application

You can run the Spring Boot application using Maven:

```bash
./mvnw spring-boot:run
Running the Web Interface
To serve the web interface, navigate to the directory containing your index.html file and run:

```bash
python -m http.server 5500
```
The web interface will be accessible at http://localhost:5500.
---
Technologies Used
Backend:
Spring Boot: Framework for building the Java application.
Spring Data JPA: For simplified data access and persistence with relational databases.
Hibernate: JPA implementation.
PostgreSQL: Relational database.
Spring Web: For building RESTful APIs.
Frontend:
HTML5: For structuring the web content.
CSS3: For styling the web interface.
JavaScript: For interactive functionality and API communication.
Font Awesome: For icons in the web interface.
Development Tools:
Spring Tool Suite (STS): For developing the Spring Boot application.
Visual Studio Code (VS Code): For editing HTML, CSS, and JavaScript files.
Build Tool:
Maven: Build automation tool.
---
