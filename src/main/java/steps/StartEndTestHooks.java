package steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.MainPage;
import page.Task1Page;
import page.Task6Page;

import java.util.concurrent.TimeUnit;

public class StartEndTestHooks {

    protected WebDriver driver;
    public MainPage mainPage;
    public Task1Page task1Page;
    public Task6Page task6Page;

    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        mainPage = PageFactory.initElements(driver, MainPage.class);
        task1Page = PageFactory.initElements(driver, Task1Page.class);
        task6Page = PageFactory.initElements(driver, Task6Page.class);
    }

    public void end() {
        driver.quit();
    }
}
