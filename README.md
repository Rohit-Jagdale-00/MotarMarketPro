
---

# Motar Market Pro

Motar Market Pro is a modern web application for managing vehicle inventory and sales records. It provides an intuitive interface for adding, updating, and tracking vehicles and sold vehicles, making it ideal for dealerships or anyone needing to manage vehicle data efficiently.

## Features

- **Vehicle Management:** Add, update, and view vehicles with details like type, manufacturer, model, fuel type, ownership, registration date, number, and price.
- **Sold Vehicle Management:** Track sold vehicles, including buyer information and sale details.
- **Modern UI:** Responsive, attractive frontend with dropdowns for type and fuel type, and a clean, user-friendly layout.
- **Easy Customization:** Built with plain HTML, CSS, and JavaScript for easy modification and integration.

## Project Structure

```
MotarMarketPro/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/MotarMarketPro/...
│       └── resources/
│           └── static/
│               ├── index.html
│               ├── style.css
│               └── script.js
├── pom.xml
└── ...
```

## Getting Started

1. **Clone the repository** (if not already):
   ```sh
   git clone <your-repo-url>
   ```

2. **Open the project** in your favorite IDE (e.g., Eclipse, IntelliJ).

3. **Run the Spring Boot application**:
   - Use your IDE’s run configuration, or
   - From the terminal:
     ```sh
     ./mvnw spring-boot:run
     ```

4. **Access the app**:
   - Open your browser and go to: `http://localhost:8080/`
   - The main UI is at `src/main/resources/static/index.html`.

## Customization

- **Frontend:** Edit `index.html` and `style.css` in `src/main/resources/static/` for UI changes.
- **Backend:** Update Java files in `src/main/java/com/example/MotarMarketPro/` for business logic and data handling.

## Technologies Used

- Java, Spring Boot
- HTML5, CSS3, JavaScript

## License

This project is for educational and demonstration purposes. You may modify and use it as needed.

---

Let me know if you want to add anything specific or need a different format!
