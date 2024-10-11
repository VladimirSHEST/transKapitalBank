package task.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LetterPage {

    private final SelenideElement writeLetterButton = $x("//span[@class='compose-button__wrapper']");
    private final SelenideElement fieldToWhom = $x("/html/body/div[1]/div/div[3]/div/div/div/div[2]/div[3]/div[1]/div/div/div[1]/div/div[2]/div/div/label/div/div/input");
    private final SelenideElement fieldText = $x("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[3]/div[4]/div/div/div[2]/div[1]/div[1]");
    private final SelenideElement buttonSendLetter = $x("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[3]/div[4]/div/div/div[2]/div[1]/div[1]");


    public void writeLetter() {
        writeLetterButton.click();
        fieldToWhom.setValue("dokuchaev_av@tkbbank.ru");
        fieldText.setValue("Добрый день, Шестаков Владимир Викторович, Автотест готов");
        buttonSendLetter.click();
    }
}
