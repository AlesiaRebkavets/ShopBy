package shopby.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.MainPage;
import pages.VelosipedyPage;

import static com.codeborne.selenide.Selenide.*;
import static pages.VelosipedyPage.VELOSIPEDY_LOGO;

public class AddToCart {


    @BeforeMethod
    void setup() {
        Configuration.browserSize = "1920x1080";
        Configuration.reportsFolder = "D:/screenshots/";
        Configuration.timeout = 10000;
        Configuration.screenshots = true;
    }


    @Test
    public void toCart() {
        MainPage.openMainPage();
        MainPage.clickVoitiButton();
        LoginPage.signIn("", "");
        MainPage.clickButtonVelosipedy();
        //VelosipedyPage.clickFilterShops();
        //VelosipedyPage.scrollToProizvoditel();
        //VelosipedyPage.clickFilterProizvoditel();
        //VelosipedyPage.scrollToMaterial();
        //VelosipedyPage.clickFilterMaterial();
        //elosipedyPage.clickButtonPosmotretTovary();
        //VelosipedyPage.clickButtonPosmotretTovary();
        VelosipedyPage.clickKupitNaShopByButton();
        VelosipedyPage.clickOnVelosiped();
        VelosipedyPage.clickAddToCartButton();
        MainPage.clickCartButton();
        $(CartPage.PRODUCT_TITLES).shouldBe(Condition.visible);
    }


    /**
     * обязательно закрываем драйвер после выполнения теста
     **/
    @AfterMethod
    void closeDriver() {
        closeWebDriver();
    }
}

