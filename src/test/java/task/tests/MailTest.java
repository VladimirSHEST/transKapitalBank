package task.tests;

import org.junit.jupiter.api.Test;
import task.pages.LetterPage;
import task.pages.LoginPage;

public class MailTest {

    @Test
    public void loginMail() {

        LoginPage loginPage = new LoginPage();
        loginPage.logIn();

        LetterPage letterPage = new LetterPage();
        letterPage.writeLetter();
    }
}
