package co.com.choucair.pruebatecnica.stepdefinitions;
import co.com.choucair.pruebatecnica.task.Login;
import co.com.choucair.pruebatecnica.task.OpenUp;
import co.com.choucair.pruebatecnica.task.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class PruebaTecnicaStepDefinitions {
    @Before public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^Stephany wants to log in to the Utest website$")
    public void stephanyWantsToLogInToTheUtestWebsite() {
        OnStage.theActorCalled("Stephany").wasAbleTo(OpenUp.thePage());
    }


    @When("^She enters the registration section of the Utest website$")
    public void sheEntersTheRegistrationSectionOfTheUtestWebsite() {
        OnStage.theActorCalled("Stephany").wasAbleTo(Login.onthePage());
    }

    @Then("^She is registered on the Utest website$")
    public void sheIsRegisteredOnTheUtestWebsite() {
        OnStage.theActorCalled("Stephany").wasAbleTo(Register.onthePage());
    }
}

