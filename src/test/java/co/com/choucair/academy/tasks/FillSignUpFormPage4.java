package co.com.choucair.academy.tasks;

import co.com.choucair.academy.userinterface.UtestLoginPage4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class FillSignUpFormPage4 implements Task {
    private final String new_Password;
    public FillSignUpFormPage4(List<String> dataList) {
        this.new_Password = dataList.get(0);
    }
    public static FillSignUpFormPage4 with(List<String> dataList) {
        return Tasks.instrumented(FillSignUpFormPage4.class, dataList);
    }

    @Override
    @Step("{0} fill the page 4/4 of the register form: Final")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(new_Password).into(UtestLoginPage4.NEW_PASSWORD_FIELD),
                Enter.theValue(new_Password).into(UtestLoginPage4.CONFIRM_PASSWORD_FIELD),
                Click.on(UtestLoginPage4.STAY_INFORMED_CHECKBOX),
                Click.on(UtestLoginPage4.ACCEPT_TERMS_CHECKBOX),
                Click.on(UtestLoginPage4.ACCEPT_POLICY_CHECKBOX),
                Click.on(UtestLoginPage4.COMPLETE_BUTTON)
        );
    }
}
