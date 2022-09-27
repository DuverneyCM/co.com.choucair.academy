package co.com.choucair.academy.tasks;

import co.com.choucair.academy.userinterface.UtestLoginPage1;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class FillSignUpFormPage1 implements Task {
    private final String firstname,lastname, email, month, day, year, language;
    public FillSignUpFormPage1(List<String> dataList) {
        this.firstname = dataList.get(0);
        this.lastname = dataList.get(1);
        this.email = dataList.get(2);
        this.month = dataList.get(3);
        this.day = dataList.get(4);
        this.year = dataList.get(5);
        this.language = dataList.get(6);
    }
    public static FillSignUpFormPage1 with(List<String> dataList) {
        return Tasks.instrumented(FillSignUpFormPage1.class, dataList);
    }

    @Override
    @Step("{0} fill the page 1/4 of the register form: Personal")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstname).into(UtestLoginPage1.FIRST_NAME_FIELD),
                Enter.theValue(lastname).into(UtestLoginPage1.LAST_NAME_FIELD),
                Enter.theValue(email).into(UtestLoginPage1.EMAIL_FIELD),
                SelectFromOptions.byVisibleText(month).from(UtestLoginPage1.BIRTH_MONTH_SELECT),
                SelectFromOptions.byVisibleText(day).from(UtestLoginPage1.BIRTH_DAY_SELECT),
                SelectFromOptions.byVisibleText(year).from(UtestLoginPage1.BIRTH_YEAR_SELECT),
                Enter.theValue(language).into(UtestLoginPage1.LANGUAGE_FIELD),
                Click.on(UtestLoginPage1.NEXT_BUTTON)
        );
    }
}
