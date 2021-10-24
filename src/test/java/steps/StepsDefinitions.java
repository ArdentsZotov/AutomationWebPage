package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.ru.Когда;

public class StepsDefinitions extends StartEndTestHooks {

    @Before
    public void init() {
        start();
    }

    @Когда("открыта главная страница")
    public void MainPageOpen() {
        mainPage.goTo();
    }

    @Когда("выполнено нажатие на элемент {string}")
    public void clickForElement(String elementName) {
        mainPage.chooseTask(elementName);
    }

    @Когда("ввести логин {string} и пароль {string}")
    public void writeInElement(String login, String value) {
        task6Page.checkPageIsCorrect();
        task6Page.setLogin("login");
        task6Page.setPassword("password");
        task6Page.clickLogin();
    }

    @After
    public void close() {
        end();
    }

}
