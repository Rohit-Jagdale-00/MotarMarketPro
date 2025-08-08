#🚗 MotarMarketPro

MotarMarketPro is a Spring Boot application designed to manage vehicle inventory and sold vehicle records. It provides a RESTful API for performing CRUD (Create, Read, Update, Delete) operations on vehicle and sold vehicle data, along with a simple web interface for interaction.

---
#📑 Table of Contents

* [Getting Started](#getting-started)
  
  *⚙️ [Prerequisites](#prerequisites)

  *📥 [Installation](#installation)

  *▶️ [Running-the-Application](#running-the-application)

*🗂️ [Project Structure](#project-structure)

*🔌 [API Endpoints](#api-endpoints)

*🌐 [Web Interface](#web-interface)

*🧰 [Technologies Used](#technologies-used)

*📬 [Contact](#contact)

---

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

###⚙️ Prerequisites

* **Java Development Kit (JDK)**: Version 21 or higher.
* **Apache Maven**: Version 3.x or higher.
* **PostgreSQL**: A PostgreSQL database instance for data storage.
* **Git**: For cloning the repository.
* **Spring Tool Suite (STS)**: For developing the Spring Boot application.
* **Visual Studio Code (VS Code)**: For editing HTML, CSS, and JavaScript files.

---

###📥 Installation

1. **Clone the repository:**
   git clone <repository_url>
   cd MotarMarketPro

2. **Configure the database:**
   * Create a PostgreSQL database.
   * Update the `src/main/resources/application.properties` file with your PostgreSQL database connection details (URL, username, password).

3. **Build the project:**
   ./mvnw clean install

---

###▶️ Running the Application

You can run the Spring Boot application using Maven:
   ./mvnw spring-boot:run

---

###▶️ Running the Web Interface

To serve the web interface, navigate to the directory containing your `index.html` file and run:
   python -m http.server 5500

The web interface will be accessible at:
   http://localhost:5500

---

##🗂️ Project Structure
```
MotarMarketPro/
├── src/
│   ├── main/
│   │   ├── java/com/motarmarketpro/
│   │   │   ├── controller/      # REST API controllers
│   │   │   ├── entity/          # JPA entity classes
│   │   │   ├── repository/      # Spring Data JPA repositories
│   │   │   └── service/         # Business logic and service layer
│   │   └── resources/
│   │       ├── application.properties   # Spring Boot configuration
│   │       └── static/         # Static web files (CSS, JS, images)
│   │       └── templates/      # HTML templates (if using Thymeleaf)
│   └── test/                   # Unit and integration tests
└── pom.xml                     # Maven configuration
```
---

##🔌 API Endpoints

### Vehicle Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET    | `/api/vehicles` | Retrieve all vehicles |
| GET    | `/api/vehicles/{id}` | Retrieve a specific vehicle by ID |
| POST   | `/api/vehicles` | Add a new vehicle |
| PUT    | `/api/vehicles/{id}` | Update an existing vehicle |
| DELETE | `/api/vehicles/{id}` | Delete a vehicle |

### Sold Vehicle Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET    | `/api/sold-vehicles` | Retrieve all sold vehicles |
| GET    | `/api/sold-vehicles/{id}` | Retrieve a specific sold vehicle by ID |
| POST   | `/api/sold-vehicles` | Add a new sold vehicle record |
| PUT    | `/api/sold-vehicles/{id}` | Update a sold vehicle record |
| DELETE | `/api/sold-vehicles/{id}` | Delete a sold vehicle record |

---

##🌐 Web Interface

The web interface provides a simple and interactive way to manage vehicle inventory and sold vehicle records.

It allows users to:

* View vehicle and sold vehicle lists.
* Add new vehicle records.
* Update existing vehicle information.
* Delete vehicle entries.
* Interact with the backend via AJAX calls to the REST API.

**Access:**  
Once the backend is running and the frontend is served via HTTP server, open:  
   http://localhost:5500

---

##🧰 Technologies Used

**Backend:**
- Spring Boot: Framework for building the Java application.
- Spring Data JPA: For simplified data access and persistence with relational databases.
- Hibernate: JPA implementation.
- PostgreSQL: Relational database.
- Spring Web: For building RESTful APIs.

**Frontend:**
- HTML5: For structuring the web content.
- CSS3: For styling the web interface.
- JavaScript: For interactive functionality and API communication.
- Font Awesome: For icons in the web interface.

**Development Tools:**
- Spring Tool Suite (STS): For developing the Spring Boot application.
- Visual Studio Code (VS Code): For editing HTML, CSS, and JavaScript files.

**Build Tool:**
- Maven: Build automation tool.

---

##📬 Contact

**Name:** Rohit Jagdale  
**Email:** rohitjagdale0606@gmail.com
