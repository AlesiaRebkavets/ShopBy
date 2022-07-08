package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    public static final By PHONE_FIELD = By.cssSelector(".Page__WindowValueInputText.Page__WindowValueInputPhone");
    public static final By PASSWORD_FIELD = By.cssSelector(".Page__WindowValueInputText.Page__WindowValueInputPassword");
    public static final By VOJTI_BUTTON = By.cssSelector(".Page__ActiveButtonBg.Header__ButtonLogIn");



    public static void signIn(String phone, String password) {
        $(PHONE_FIELD).sendKeys(phone);
        $(PASSWORD_FIELD).sendKeys(password);
        $(VOJTI_BUTTON).click();
    }
}
