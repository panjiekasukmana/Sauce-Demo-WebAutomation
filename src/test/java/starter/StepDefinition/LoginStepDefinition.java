package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Page.Inventorypage;
import starter.Page.LoginPage;

import static org.junit.Assert.*;

public class LoginStepDefinition {

    LoginPage loginPage;

    Inventorypage inventorypage;
    @Given("I Already Login In Page")
    public void IAlreadyOnLoginPage(){
        loginPage.open();
    }

    @When("I Input Username {string}")
    public void IInputUsername(String Username){
        loginPage.InputUsername(Username);
    }

    @And("I Input Password {string}")
    public void IInputPassword(String Password){
        loginPage.InputPassword(Password);
    }

    @And("I Click Login Button")
    public void IClickLoginButton(){
        loginPage.clickButton();
    }

    @Then("I Redirect To Inventory Page")
     public void IRedirectToInventoryPage(){
        assertEquals("https://www.saucedemo.com/inventory.html", inventorypage.getUrl());
        assertEquals("PRODUCTS", inventorypage.getHeaderTittle());
        assertTrue(inventorypage.isCartVisible());

    }
    @Given("Already logged in")
    public void AlreadyLoggedIn() {
        loginPage.open();
        loginPage.InputUsername("standard_user");
        loginPage.InputPassword("secret_sauce");
        loginPage.clickButton();

    }

    @And("Already logged in and Add one item")
    public void AlreadyloggedinandAddoneitem() {
        loginPage.open();
        loginPage.InputUsername("standard_user");
        loginPage.InputPassword("secret_sauce");
        loginPage.clickButton();
        inventorypage.selectanitem();
    }
}
