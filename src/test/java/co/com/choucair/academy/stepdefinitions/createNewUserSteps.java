package co.com.choucair.academy.stepdefinitions;

import co.com.choucair.academy.model.RegisterData;
import co.com.choucair.academy.tasks.Create;
import co.com.choucair.academy.tasks.OpenUp;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class createNewUserSteps {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) want to register in UTest website$")
    public void duverneycmWantToRegisterInUTestWebsite(String actor) {
        System.out.println("running Given" + actor);
        OnStage.theActorCalled(actor).wasAbleTo(OpenUp.thePage());
    }
    @When("^he fill the register form with the following data:$")
    public void heFillTheRegisterFormWithTheFollowingData(List<List<String>> registerData) {
        //DataTable table
        //List<List<String>> dataList = table.asLists(String.class);
        System.out.println("running When" + registerData.get(1).get(1));
        OnStage.theActorInTheSpotlight().attemptsTo(Create.newUserWith(registerData.get(1)));
    }
    @Then("he should be registered in UTest website")
    public void heShouldBeRegisteredInUTestWebsite() {
        System.out.println("running Then");
        //Ensure.that(Attribute.of(Form.Checkbox).called('checked'), equals('true'))
    }
}

