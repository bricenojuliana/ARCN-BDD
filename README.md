# BDD con Selenium y Cucumber en GitHub Codespaces

Este laboratorio demuestra el uso de Desarrollo Guiado por Comportamiento (BDD) con Cucumber y Selenium WebDriver para pruebas automatizadas en aplicaciones web. Se ejecuta en un entorno basado en GitHub Codespaces.

## Tecnologías utilizadas
- **Java**: Lenguaje principal para la implementación de pruebas.
- **Selenium WebDriver**: Herramienta para la automatización de navegadores.
- **Cucumber**: Framework para escribir pruebas en lenguaje natural (Gherkin).
- **JUnit**: Framework para la ejecución de pruebas.
- **Maven**: Administrador de dependencias y ejecución de pruebas.

## Estructura del proyecto

```
bdd-java
├── pom.xml  # Configuración de Maven y dependencias
├── src
│   ├── main/java/com/eci/myproject
│   │   └── App.java  # Aplicación principal
│   ├── test/java/com/eci/myproject
│   │   ├── features  # Archivos .feature con escenarios BDD
│   │   │   ├── add_remove.feature
│   │   │   └── google_search.feature
│   │   ├── pages  # Clases de Page Object Model (POM)
│   │   │   └── AddRemoveElementsPage.java
│   │   ├── runners  # Configuración de Cucumber
│   │   │   └── TestRunner.java
│   │   └── steps  # Implementación de pasos de prueba
│   │       ├── AddRemoveSteps.java
│   │       └── SearchSteps.java
└── target  # Resultados de compilación y reportes de prueba
```

## Instalación y configuración

1. **Abrir el proyecto en GitHub Codespaces**
2. **Instalar dependencias:**
   ```sh
   mvn clean install
   ```
3. **Ejecutar pruebas BDD:**
   ```sh
   mvn test
   ```

## Ejemplo de escenario en Gherkin

```gherkin
Feature: Add/Remove Elements
  Scenario: Add and remove an element
    Given I am on the Add/Remove Elements page
    When I click the Add Element button
    Then a Delete button should appear
    When I click the Delete button
    Then the Delete button should disappear
```

Este laboratorio permite practicar BDD de manera efectiva utilizando herramientas estándar de la industria.

