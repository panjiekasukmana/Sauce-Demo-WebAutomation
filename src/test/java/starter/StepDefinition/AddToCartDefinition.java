package starter.StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Page.Inventorypage;
import starter.Page.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class AddToCartDefinition {

    LoginPage loginPage;
    Inventorypage inventorypage ;

    @When("I select an item")
    public void Iselectanitem() {inventorypage.selectanitem();}
    @Then("Item should be added")
    public void Itemshouldbeadded(){
        assertTrue(inventorypage.removeIcon());
    }
}
