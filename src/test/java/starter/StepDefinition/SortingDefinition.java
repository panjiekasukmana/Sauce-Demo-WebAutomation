package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.Page.SortingPage;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.junit.Assert.assertEquals;

public class SortingDefinition {

    SortingPage sortingPage;

    @Managed
    WebDriver driver =getDriver();

    @When("I click sort by {string}")
    public void IClickSortBy(String sortBy) {sortingPage.selectSort();}

    @And("I add item")
    public void IAddItem(){sortingPage.selectItem();}

    @And("I click cart icon")
    public void Iclickcarticon() {sortingPage.clickIconCart();}

    @And("I redirect to cart page")
    public void Iredirecttocartpage() {
        assertEquals("https://www.saucedemo.com/cart.html", sortingPage.getUrl());

    }

    @And("I remove item")
    public void Iremoveitem() {sortingPage.clickremoveItem();}

    @Then("I click continue shopping button")
    public void Iclickcontinueshoppingbutton() {sortingPage.Clickcontinueshoppingbuttona();}
}
