package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Task1Page extends BasePage {

    public Task1Page(WebDriver driver) {
        super(driver);
    }

    public void checkPageIsCorrect() {
        elementIsDisplayed(By.xpath("//li[text()='Zadanie 1']"));
    }
}
