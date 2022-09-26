package co.com.choucair.academy.questions;

import co.com.choucair.academy.userinterface.UtestLoginPage4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CheckboxValue;

public class TermsAndConditions implements Question<Boolean>{
    public TermsAndConditions() { }
    public static Question<Boolean> areAccepted() {
        return new TermsAndConditions();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return CheckboxValue.of(UtestLoginPage4.ACCEPT_TERMS_CHECKBOX).answeredBy(actor);
    }
}


