package co.com.choucair.academy.tasks;

import co.com.choucair.academy.userinterface.UtestLoginPage3;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import java.util.List;

public class FillSignUpFormPage3 implements Task {
    private final String pc_OS, pc_Version, pc_Language, cel_Brand, cel_Model, cel_OS;
    public FillSignUpFormPage3(List<String> dataList) {
        this.pc_OS = dataList.get(0);
        this.pc_Version = dataList.get(1);
        this.pc_Language = dataList.get(2);
        this.cel_Brand = dataList.get(3);
        this.cel_Model = dataList.get(4);
        this.cel_OS = dataList.get(5);
    }
    public static FillSignUpFormPage3 with(List<String> dataList) {
        return Tasks.instrumented(FillSignUpFormPage3.class, dataList);
    }

    @Override
    @Step("{0} fill the page 3/4 of the register form: Devices")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestLoginPage3.PC_OS_SELECT),
                Enter.theValue(pc_OS,Keys.RETURN).into(UtestLoginPage3.PC_OS_FIELD),
                Click.on(UtestLoginPage3.PC_VERSION_SELECT),
                Enter.theValue(pc_Version,Keys.RETURN).into(UtestLoginPage3.PC_VERSION_FIELD),
                Click.on(UtestLoginPage3.PC_LANGUAGE_SELECT),
                Enter.theValue(pc_Language,Keys.RETURN).into(UtestLoginPage3.PC_LANGUAGE_FIELD),
                Click.on(UtestLoginPage3.MOBILE_BRAND_SELECT),
                Enter.theValue(cel_Brand,Keys.RETURN).into(UtestLoginPage3.MOBILE_BRAND_FIELD),
                Click.on(UtestLoginPage3.MOBILE_MODEL_SELECT),
                Enter.theValue(cel_Model,Keys.RETURN).into(UtestLoginPage3.MOBILE_MODEL_FIELD),
                Click.on(UtestLoginPage3.MOBILE_OS_SELECT),
                Enter.theValue(cel_OS,Keys.RETURN).into(UtestLoginPage3.MOBILE_OS_FIELD),
                Click.on(UtestLoginPage3.NEXT_BUTTON)
        );
    }
}
