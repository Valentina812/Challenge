package co.com.kinandcarta.certification.amazon.stepdefinitions;

import co.com.kinandcarta.certification.amazon.exceptions.ExceptionError;
import co.com.kinandcarta.certification.amazon.models.Search;
import co.com.kinandcarta.certification.amazon.questions.ValidateButton;
import co.com.kinandcarta.certification.amazon.taks.NavigatePage;
import co.com.kinandcarta.certification.amazon.taks.PurchaseAlexa;
import co.com.kinandcarta.certification.amazon.taks.SelectItem;
import co.com.kinandcarta.certification.amazon.utils.MessageError;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.*;

public class PurchaseStepDefinitions {

    @Managed
    WebDriver driver;

    @Before
    public void setUp() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        theActorCalled("user");
    }

    @Given("^The user enters the page$")
    public void theUserEntersToThePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.amazon.com/"));
    }


    @When("^The user search Alexa$")
    public void theUserSearchAlexa(List<Search> data) {
        theActorInTheSpotlight().attemptsTo(PurchaseAlexa.theData(data));

    }

    @And("^User navigates to the second page$")
    public void userNavigatesToTheSecondPage(List<Search> data) {
        theActorInTheSpotlight().attemptsTo(NavigatePage.theData(data));
    }

    @And("^User selects the third item$")
    public void userSelectsTheThirdItem(List<Search> data) {
        theActorInTheSpotlight().attemptsTo(SelectItem.theData(data));
    }


    @Then("^The user not add the product the cart$")
    public void theUserNotAddTheProductTheCart() {
        theActorInTheSpotlight().should(seeThat(ValidateButton.addCart(), equalTo(true)).orComplainWith(ExceptionError.class, MessageError.MSG_VALUE_BUTTON_ENABLE.getMsg()));
    }


    @Given("^The user enters the page Amazon$")
    public void theUserEntersThePageAmazon() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.amazon.com/"));
    }

    @When("^The user search Nintendo Switch$")
    public void theUserSearchNintendoSwitch() {
    }

    @Then("^The user add the product the cart$")
    public void theUserAddTheProductTheCart() {
    }
}
