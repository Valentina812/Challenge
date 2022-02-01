package co.com.kinandcarta.certification.amazon.stepdefinitions;

import co.com.kinandcarta.certification.amazon.models.Search;
import co.com.kinandcarta.certification.amazon.taks.PurchaseProduct;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class PurchaseStepDefinitions {

    @Managed
    WebDriver driver;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("user");
    }

    @Given("^The user enters the page$")
    public void theUserEntersToThePage(){
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.amazon.com/"));
    }


    @When("^The user search Alexa$")
    public void theUserSearchAlexa(List<Search>data) {
        OnStage.theActorInTheSpotlight().attemptsTo(PurchaseProduct.theData(data));

    }

    @Then("^The user add the product the cart$")
    public void theUserAddTheProductTheCart() {
    }
}
