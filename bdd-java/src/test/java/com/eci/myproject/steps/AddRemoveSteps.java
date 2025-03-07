package com.eci.myproject.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import com.eci.myproject.pages.AddRemoveElementsPage;;

public class AddRemoveElementsSteps {
    WebDriver driver;
    AddRemoveElementsPage addRemovePage;

    @Given("I am on the Add/Remove Elements page")
    public void i_am_on_the_add_remove_elements_page() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        addRemovePage = new AddRemoveElementsPage(driver);
    }

    @When("I click the Add Element button")
    public void i_click_the_add_element_button() {
        addRemovePage.clickAddElement();
    }

    @Then("a Delete button should appear")
    public void a_delete_button_should_appear() {
        assertTrue(addRemovePage.isDeleteButtonDisplayed());
    }

    @When("I click the Delete button")
    public void i_click_the_delete_button() {
        addRemovePage.clickDeleteButton();
    }

    @Then("the Delete button should disappear")
    public void the_delete_button_should_disappear() {
        try {
            assertTrue(!addRemovePage.isDeleteButtonDisplayed());
        } catch (Exception e) {
            // Si el botón no existe, la prueba es exitosa
        } finally {
            driver.quit();
        }
    }
}
