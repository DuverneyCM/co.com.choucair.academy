package co.com.choucair.academy.tasks;

import co.com.choucair.academy.userinterface.UtestHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenUp implements Task {
    //private ChoucairAcademyPage choucairAcademyPage;
    private UtestHomePage UtestHomePage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    @Step("{0} open the web browser and go to uTest website")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(UtestHomePage));
    }
}
