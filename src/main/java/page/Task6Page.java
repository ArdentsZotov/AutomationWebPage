package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task6Page extends BasePage {

    public Task6Page(WebDriver driver) {
        super(driver);
    }

    public void checkPageIsCorrect() {
        elementIsDisplayed(By.xpath("//li[text()='Zadanie 6']"));
    }

    public void setLogin(String login) {
        String xpath = "//input[contains(@id,'username')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        this.waitVisibility(By.xpath(xpath));
        writeText(element, login);
    }

    public void setPassword(String password) {
        String xpath = "//input[contains(@id,'password')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        this.waitVisibility(By.xpath(xpath));
        writeText(element, password);
    }

    public void clickLogin() {
        String xpath = "//button[@id='LoginForm_save']";
        WebElement element = driver.findElement(By.xpath(xpath));
        this.waitVisibility(By.xpath(xpath));
        element.click();
    }


}
