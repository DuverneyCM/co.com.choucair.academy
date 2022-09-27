package co.com.choucair.academy.tasks;

import co.com.choucair.academy.userinterface.UtestHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.rest.interactions.Ensure;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.screenplay.questions.page.TheWebPage;

import org.assertj.core.api.Assertions;

import static java.lang.String.valueOf;
import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;

public class OpenUp implements Task {
    private UtestHomePage UtestHomePage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }


    @Override
    @Step("{0} open the web browser and go to uTest website")
    public <T extends Actor> void performAs(T actor) {
        //String colors = "Red Green Blue";
        actor.attemptsTo(
                Open.browserOn(UtestHomePage)
                //Ensure.that(BrowseTheWeb.as(actor).getDriver().getCurrentUrl()).isEqualto("https://www.utest.com/")
                //Ensure.that("",valueOf(TheWebPage.currentUrl()).contains("uTest"),
                  //      Ensure.that("",not(true).equals(valueOf(false))),
                    //    Ensure.that(colors).contains("Green")

        );
        assertThat(BrowseTheWeb.as(actor).getDriver().
                getCurrentUrl()).isEqualTo("https://www.utest.com/");
        String title = valueOf(TheWebPage.currentUrl());
    }
}
