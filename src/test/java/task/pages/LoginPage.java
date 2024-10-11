package task.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    String login = "test@mail.ru";
    String password = "123456";

    private final SelenideElement logInButton = $x("//*[@id='mailbox']/div[1]/button");
    private final SelenideElement inputAccountName = $x("//input[@name='username']");
    private final SelenideElement enterButton = $x("//*[@id='root']/div/div/div/div[2]/div/form/div[2]/div[2]/div[3]/div/div/div[1]/button/span");
    private final SelenideElement inputPassword = $x("//*[@id='root']/div/div/div/div[2]/div/form/div[2]/div/div[2]/div/div/div/div/div/input");
    private final SelenideElement enter2Button = $x("//*[@id='root']/div/div/div/div[2]/div/form/div[2]/div/div[3]/div/div/div[1]/button/span");


    public void logIn() {
        // Открываем страницу
        open("https://mail.ru/");

        // Вводим логин и пароль
        logInButton.click();
        inputAccountName.setValue(login);
        enterButton.click();
        inputPassword.setValue(password);
        enter2Button.click();

        // Проверяем, что мы успешно вошли
        $x("//span[@class='compose-button__wrapper']").shouldHave(Condition.text("Написать письмо"));
    }


}
