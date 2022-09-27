package co.com.choucair.academy.stepdefinitions;

import co.com.choucair.academy.model.RegisterData;
import co.com.choucair.academy.questions.Polices;
import co.com.choucair.academy.questions.SelectImageCAPTCHA;
import co.com.choucair.academy.questions.TermsAndConditions;
import co.com.choucair.academy.tasks.*;
import co.com.choucair.academy.userinterface.UtestHomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
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
        OnStage.theActorCalled(actor).wasAbleTo(OpenUp.thePage());
    }

    @And("^he click on the button (.*)$")
    public void heClickOnTheButtonJoinToday(String signUpButton) {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(UtestHomePage.JOIN_TODAY_BUTTON));
    }

    @When("^he fill the page 1/4 of the register form with the following data:$")
    public void heFillThePage1OfTheRegisterFormWithTheFollowingData(List<List<String>> registerData) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillSignUpFormPage1.with(registerData.get(1)));
    }

    @And("^he fill the page 2/4 of the register form with the following data:$")
    public void heFillThePage2OfTheRegisterFormWithTheFollowingData(List<List<String>> registerData) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillSignUpFormPage2.with(registerData.get(1)));
    }

    @And("^he fill the page 3/4 of the register form with the following data:$")
    public void heFillThePage3OfTheRegisterFormWithTheFollowingData(List<List<String>> registerData) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillSignUpFormPage3.with(registerData.get(1)));
    }

    @And("^he fill the page 4/4 of the register form with the following data, and accept terms and polices:$")
    public void heFillThePage4OfTheRegisterFormWithTheFollowingDataAndAcceptTermsAndPolices(List<List<String>> registerData) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillSignUpFormPage4.with(registerData.get(1)));
    }

    @When("^he fill the register form with the following data:$")
    public void heFillTheRegisterFormWithTheFollowingData(List<List<String>> registerData) {
    //public void heFillTheRegisterFormWithTheFollowingData(DataTable dataTable) {
    //public void heFillTheRegisterFormWithTheFollowingData(List<RegisterData> registerData) {
        //List<RegisterData> registerData = dataTable.asList(RegisterData.class);
        //System.out.println("running When By " + registerData);
        //System.out.println("running When By " + registerData.get(1).get(0));
        //OnStage.theActorInTheSpotlight().attemptsTo(Create.newUserWith(registerData.get(1)));
    }

    @Then("he should be ready to be registered in UTest website")
    public void heShouldBeRegisteredInUTestWebsite() {
        //System.out.println("running Then");
        //System.out.println(Polices.areAccepted().answeredBy(OnStage.theActorInTheSpotlight()));
        OnStage.theActorInTheSpotlight().should(seeThat( Polices.areAccepted() ));
        OnStage.theActorInTheSpotlight().should(seeThat( TermsAndConditions.areAccepted() ));
        OnStage.theActorInTheSpotlight().should(seeThat( SelectImageCAPTCHA.isVisible() ));
    }
}

