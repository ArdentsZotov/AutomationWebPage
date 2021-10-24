package page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.jupiter.api.Assertions;

import java.util.Objects;

public abstract class BasePage {

    private final int TIME_OUT = 15;

    protected WebDriver driver;
    protected WebDriverWait webDriverWait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, TIME_OUT);
    }

    public void click(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    public void waitVisibility(By elementBy) {
        webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void elementIsDisplayed(By elementBy) {
        waitVisibility(elementBy);
        boolean isDisplayed = driver.findElement(elementBy).isDisplayed();
        Assertions.assertTrue(isDisplayed, "Элемент видим на странице");
    }

    protected void writeText(WebElement element, String sendKeys) {
        element.isDisplayed();
        element.clear();
        element.sendKeys(sendKeys);
    }
}
