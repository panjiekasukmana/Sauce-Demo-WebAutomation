package starter.Page;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Inventorypage extends PageObject {

    @Managed
    WebDriver driver =getDriver();

    private final By headerTittle = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    private final By cartIcon = By.cssSelector("#shopping_cart_container > a");
    private final By removeIcon = By.xpath("//*[@id=\"remove-sauce-labs-fleece-jacket\"]");
    public final By selectanitem = By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]");
    public String getUrl() { return driver.getCurrentUrl(); }
    private final By oneItem = By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]");

    public String getHeaderTittle() { return driver.findElement(headerTittle).getText(); }

    public  void selectanitem() {driver.findElement(selectanitem).click();}
    public boolean isCartVisible() { return driver.findElement(cartIcon).isDisplayed(); }

    public boolean removeIcon() {
        return driver.findElement(removeIcon).isDisplayed();
    }
}
