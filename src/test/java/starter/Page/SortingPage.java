package starter.Page;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SortingPage extends PageObject {

    @Managed
    WebDriver driver =getDriver();


    private final By selectSort = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[2]");

    private final By addItem = By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]");
    private final By clickiconcart = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");
    private final By removeItem = By.xpath("//*[@id=\"remove-sauce-labs-fleece-jacket\"]");
    private final By clickcontinueshoppingbutton = By.xpath("//*[@id=\"continue-shopping\"]");


    public void selectSort() {driver.findElement(selectSort).click();}
    public void selectItem() {driver.findElement(addItem).click();}
    public void clickIconCart() {driver.findElement(clickiconcart).click();}
    public  void clickremoveItem() {driver.findElement(removeItem).click();}
    public void Clickcontinueshoppingbuttona() {driver.findElement(clickcontinueshoppingbutton).click();}

    public void SelectSort(String sortBy) {
        Select dropdown = new Select(driver.findElement(selectSort));
        dropdown.selectByVisibleText(sortBy);
    }


    public String getUrl(){return driver.getCurrentUrl();}



}
