package com.eci.myproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemoveElementsPage {
    WebDriver driver;

    @FindBy(xpath = "//button[text()='Add Element']")
    WebElement addElementButton;

    @FindBy(xpath = "//button[text()='Delete']")
    WebElement deleteButton;

    public AddRemoveElementsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAddElement() {
        addElementButton.click();
    }

    public boolean isDeleteButtonDisplayed() {
        return deleteButton.isDisplayed();
    }

    public void clickDeleteButton() {
        deleteButton.click();
    }
}
