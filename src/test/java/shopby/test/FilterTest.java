package shopby.test;

import com.codeborne.selenide.*;
import org.testng.annotations.*;
import pages.MainPage;
import pages.VelosipedyPage;

import static com.codeborne.selenide.Selenide.*;
import static pages.VelosipedyPage.VELOSIPEDY_LOGO;

public class FilterTest {
    /**
     * перед выполнением методов (тестов) сетапаем драйвер и конфигурации (вроде reportsFolder)
     **/

    @BeforeMethod
    void setup() {
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
        Configuration.screenshots = true;
        Configuration.reportsFolder = "D:/screenshots/";
    }

    @Test
    public void VelosipedyPageIsOpened() {
        MainPage.openMainPage();
        MainPage.clickButtonVelosipedy();
        $(VELOSIPEDY_LOGO).shouldBe(Condition.visible);
    }

    @Test
    public void verifyFilteredProductsAreDisplayed() {
        MainPage.openMainPage();
        MainPage.clickButtonVelosipedy();
        VelosipedyPage.clickFilterShops();
        VelosipedyPage.scrollToProizvoditel();
        VelosipedyPage.clickFilterProizvoditel();
        VelosipedyPage.scrollToMaterial();
        VelosipedyPage.clickFilterMaterial();
        for (SelenideElement element : $$(VelosipedyPage.PRODUCT_TITLES)) {
            element.shouldHave(Condition.text("Велосипед"));
        }
    }

/*    @Test
    public void verifyFilteredProductAmount() {
        MainPage.openMainPage();
        MainPage.clickButtonVelosipedy();
        VelosipedyPage.clickFilterShops();
        VelosipedyPage.scrollToProizvoditel();
        VelosipedyPage.clickFilterProizvoditel();
        VelosipedyPage.scrollToMaterial();
        VelosipedyPage.clickFilterMaterial();
        VelosipedyPage.clickButtonPosmotretTovary();
        VelosipedyPage.clickButtonPosmotretTovary();
        $$(VelosipedyPage.FILTERED_PRODUCTS).shouldBe(CollectionCondition.size(32));

    }*/


    /**
     * обязательно закрываем драйвер после выполнения теста
     **/
    @AfterMethod
    void closeDriver() {
        closeWebDriver();
    }
}
