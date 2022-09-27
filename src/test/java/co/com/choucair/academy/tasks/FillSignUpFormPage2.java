package co.com.choucair.academy.tasks;

import co.com.choucair.academy.userinterface.UtestLoginPage2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import java.util.List;

public class FillSignUpFormPage2 implements Task {
    private final String city, zip, country;
    public FillSignUpFormPage2(List<String> dataList) {
        this.city = dataList.get(0);
        this.zip = dataList.get(1);
        this.country = dataList.get(2);
    }
    public static FillSignUpFormPage2 with(List<String> dataList) {
        return Tasks.instrumented(FillSignUpFormPage2.class, dataList);
    }

    @Override
    @Step("{0} fill the page 2/4 of the register form: Location")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(city).into(UtestLoginPage2.CITY_FIELD),
                        //.thenHit(Keys.ARROW_DOWN, Keys.RETURN),
                        Enter.keyValues(Keys.ARROW_DOWN, Keys.RETURN).into(UtestLoginPage2.CITY_FIELD),
                Enter.theValue(zip).into(UtestLoginPage2.ZIP_FIELD),
                        //.thenHit(Keys.ARROW_DOWN, Keys.RETURN),
                        Enter.keyValues(Keys.ARROW_DOWN, Keys.RETURN).into(UtestLoginPage2.ZIP_FIELD),
                Click.on(UtestLoginPage2.COUNTRY_SELECT),
                Enter.theValue(country).into(UtestLoginPage2.COUNTRY_FIELD)
                        .thenHit(Keys.RETURN),
                Click.on(UtestLoginPage2.NEXT_BUTTON)
        );
    }
}
