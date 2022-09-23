package co.com.choucair.academy.stepdefinitions;

//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import co.com.choucair.academy.tasks.OpenUp;
import co.com.choucair.academy.userinterface.ChoucairAcademyPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class academyChoucairStepDefinitions {
    //@Managed(driver = "chrome")
    //private WebDriver navegador;
    //private Actor actor = Actor.named("Global");
    //private ChoucairAcademyPage choucairAcademyPage = new ChoucairAcademyPage();

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage());
        //actor.wasAbleTo(Open.browserOn(choucairAcademyPage));
    }

    @When("^he search for the course Recursos Automatizacion Bancolombia on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform() {
    }

    @Then("^he find the course called resources Recursos Automatizacion Bancolombia$")
    public void heFindTheCourseCalledResourcesRecursosAutomatizacionBancolombia() {
    }
}
