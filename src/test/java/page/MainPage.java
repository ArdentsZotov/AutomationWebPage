package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {
    protected final String SITE_URL = "https://testingcup.pgs-soft.com/";

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get(SITE_URL);
    }

    public void chooseTask(String taskNumber) {
        click(By.xpath("//h2[text()='Zadanie "+ taskNumber + "']"));
    }

}
