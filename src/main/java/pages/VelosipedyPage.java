package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class VelosipedyPage {
    public static final By SHOP_21VEK = By.xpath("//label[text()='21vek.by']");
    public static final By PROIZVODITEL_AIST = By.xpath("//label[text()='AIST']");
    public static final By MATERIAL_STAL = By.xpath("//label[text()='Сталь']");
    public static final By VELOSIPEDY_LOGO = By.xpath("//h1[@class='Page__TitleActivePage']");
    public static final By PRODUCT_TITLES = By.xpath("//a[@class='ModelList_LinkModel']");
    public static final By POSMOTRET_TOVARY = By.xpath("//span[@class = 'ModelFilter__TxtBtnFormBlock']");
    public static final By FILTERED_PRODUCTS = By.xpath("//div[@class='ModelList']//descendant::div");
    public static final By KUPIT_NA_SHOPBY_BUTTON = By.xpath("//label [@for = 'BuyShop']");
    public static final By VELOSIPED = By.xpath("//a[@data-model = '560793']");
    public static final By ADD_TO_CART_BUTTON = By.cssSelector(".ShopItemList__AddToCart.cart-button");


    public static void clickFilterShops() {
        $(SHOP_21VEK).click();
    }

    public static void scrollToProizvoditel() {
        $(PROIZVODITEL_AIST).scrollTo();
    }

    public static void clickFilterProizvoditel() {
        $(PROIZVODITEL_AIST).click();
    }

    public static void scrollToMaterial() {
        $(MATERIAL_STAL).scrollTo();
    }

    public static void clickFilterMaterial() {
        $(MATERIAL_STAL).click();
    }

    public static void scrollTOPosmotretTovary() {
        $(POSMOTRET_TOVARY).scrollTo();
    }

    public static void clickButtonPosmotretTovary() {
        $(POSMOTRET_TOVARY).click();
    }
    public static void clickKupitNaShopByButton(){
        $(KUPIT_NA_SHOPBY_BUTTON).click();
    }

    public static void clickAddToCartButton(){
        $(ADD_TO_CART_BUTTON).click();
    }

    public static void clickOnVelosiped(){
        $(VELOSIPED).click();
    }

}
