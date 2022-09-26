package co.com.choucair.academy.stepdefinitions;

import co.com.choucair.academy.questions.Polices;
import co.com.choucair.academy.questions.TermsAndConditions;
import co.com.choucair.academy.tasks.Create;
import co.com.choucair.academy.tasks.OpenUp;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class createNewUserSteps {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) want to register in UTest website$")
    public void duverneycmWantToRegisterInUTestWebsite(String actor) {
        //System.out.println("running Given by " + actor);
        OnStage.theActorCalled(actor).wasAbleTo(OpenUp.thePage());
    }
    @When("^he fill the register form with the following data:$")
    public void heFillTheRegisterFormWithTheFollowingData(List<List<String>> registerData) {
        //System.out.println("running When By " + registerData.get(1).get(0));
        OnStage.theActorInTheSpotlight().attemptsTo(Create.newUserWith(registerData.get(1)));
    }
    @Then("he should be ready to be registered in UTest website")
    public void heShouldBeRegisteredInUTestWebsite() {
        //System.out.println("running Then");
        //System.out.println(Polices.areAccepted().answeredBy(OnStage.theActorInTheSpotlight()));
        OnStage.theActorInTheSpotlight().should(seeThat( Polices.areAccepted() ));
        OnStage.theActorInTheSpotlight().should(seeThat( TermsAndConditions.areAccepted() ));
    }
}

