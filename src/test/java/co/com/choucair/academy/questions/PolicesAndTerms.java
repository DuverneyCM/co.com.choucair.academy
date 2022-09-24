package co.com.choucair.academy.questions;

import co.com.choucair.academy.userinterface.UtestLoginPage4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.SelectedStatus;

public class PolicesAndTerms implements Question<Boolean> {
    boolean question;
    public PolicesAndTerms(boolean question) {
        this.question = question;
    }
    public static PolicesAndTerms isChecked(boolean question) {
        return new PolicesAndTerms(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Question<Boolean> isAcceptedTerms = SelectedStatus.of(UtestLoginPage4.ACCEPT_TERMS_CHECKBOX).asBoolean();
        Question<Boolean> isAcceptedPolices = SelectedStatus.of(UtestLoginPage4.ACCEPT_POLICY_CHECKBOX).asBoolean();
        //I don't know how to read the status of the checkbox, AND question (boolean) don't support the method equals
        if (isAcceptedTerms.equals(question) && isAcceptedPolices.equals(question))
            return true;
        else
            return false;
    }
}
