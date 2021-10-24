package test;

import org.junit.jupiter.api.Test;

public class First extends TestBase {
    @Test
    public void firstTest() {
        mainPage.goTo();
        mainPage.chooseTask("6");
        task6Page.checkPageIsCorrect();
        task6Page.setLogin("login");
        task6Page.setPassword("password");
        task6Page.clickLogin();
        sleep(2);
    }

    private void sleep(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
