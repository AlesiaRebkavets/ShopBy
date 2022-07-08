package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    /**
     * private - модификатор доступа, запрещающий работу с переменной извне (сокрытие данных);
     * final - кейворд, запрещающий модификацию;
     * By - вспомогательный класс, содержащий локатор (таким образом нам все равно, какой тип локатора используется -
     * xpath, ccsSelector или что-то еще;
     * зачем нам в этом примере переменная logo? С помощью нее мы будем определять, загрузилась ли страница.
     **/
    private final By logo = By.cssSelector("[.styles_links_iLq66. styles_logo--big__CfnFj]");
    private final By buttonCatalog = By.xpath("//*[@class = 'b-main-navigation__link'][1]");
    public static final String BASE_URL = "https://shop.by/";
    public static final By VELISIPEDY_BUTTON = By.xpath("//a[text()='Велосипеды']");
    public static final By VOJTI_BUTTON = By.xpath("//span[@title = 'Войти']");
    public static final By CART_BUTTON = By.cssSelector(".cart-link.ok__hidden-link");


    public static void openMainPage() {
        open(BASE_URL);
    }


    public static void clickButtonVelosipedy() {
        $(VELISIPEDY_BUTTON).click();
    }

    public static void clickVoitiButton() {
        $(VOJTI_BUTTON).click();
    }

    public static void clickCartButton() {
        $(CART_BUTTON).click();
    }

}
