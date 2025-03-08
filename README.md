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
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com/eci/myproject/pages  # Clases Page Object
│   ├── test
│   │   ├── java
│   │   │   └── com/eci/myproject/steps  # Definiciones de pasos Cucumber
│   │   │   └── com/eci/myproject/runners # Ejecutores de pruebas
│   │   ├── resources
│   │   │   └── features  # Escenarios en Gherkin
├── pom.xml  # Configuración de Maven y dependencias
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

