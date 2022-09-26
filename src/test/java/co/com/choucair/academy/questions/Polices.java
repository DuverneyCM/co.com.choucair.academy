package co.com.choucair.academy.questions;

import co.com.choucair.academy.userinterface.UtestLoginPage4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CheckboxValue;

public class Polices implements Question<Boolean> {
    public Polices() { }
    public static Question<Boolean> areAccepted() {
        return new Polices();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return CheckboxValue.of(UtestLoginPage4.ACCEPT_POLICY_CHECKBOX).answeredBy(actor);
    }
}
