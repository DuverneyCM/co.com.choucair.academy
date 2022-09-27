package co.com.choucair.academy.tasks;

import co.com.choucair.academy.userinterface.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.rest.interactions.Ensure;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import java.util.List;

public class Create implements Task {
    private String firstname,lastname, email, month, day, year, language;
    private String city, zip, country;
    private String pc_OS, pc_Version, pc_Language, cel_Brand, cel_Model, cel_OS;
    private String new_Password;

    public Create(List<String> dataList) {
        this.firstname = dataList.get(0);
        this.lastname = dataList.get(1);
        this.email = dataList.get(2);
        this.month = dataList.get(3);
        this.day = dataList.get(4);
        this.year = dataList.get(5);
        this.language = dataList.get(6);
        this.city = dataList.get(7);
        this.zip = dataList.get(8);
        this.country = dataList.get(9);
        this.pc_OS = dataList.get(10);
        this.pc_Version = dataList.get(11);
        this.pc_Language = dataList.get(12);
        this.cel_Brand = dataList.get(13);
        this.cel_Model = dataList.get(14);
        this.cel_OS = dataList.get(15);
        this.new_Password = dataList.get(16);
    }
    public static Create newUserWith(List<String> dataList) {
        return Tasks.instrumented(Create.class, dataList);
    }

    @Override
    @Step("{0} start to fill the register form")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            //PAGE 1/4 of the CREATE NEW USER form: PERSONAL
            Enter.theValue(firstname).into(UtestLoginPage1.FIRST_NAME_FIELD),
            Enter.theValue(lastname).into(UtestLoginPage1.LAST_NAME_FIELD),
            Enter.theValue(email).into(UtestLoginPage1.EMAIL_FIELD),
            SelectFromOptions.byVisibleText(month).from(UtestLoginPage1.BIRTH_MONTH_SELECT),
            SelectFromOptions.byVisibleText(day).from(UtestLoginPage1.BIRTH_DAY_SELECT),
            SelectFromOptions.byVisibleText(year).from(UtestLoginPage1.BIRTH_YEAR_SELECT),
            Enter.theValue(language).into(UtestLoginPage1.LANGUAGE_FIELD),
            Click.on(UtestLoginPage1.NEXT_BUTTON),
            //PAGE 2/4 of the CREATE NEW USER form: LOCATION
            Enter.theValue(city).into(UtestLoginPage2.CITY_FIELD),
                //.thenHit(Keys.ARROW_DOWN, Keys.RETURN),
                Enter.keyValues(Keys.ARROW_DOWN, Keys.RETURN).into(UtestLoginPage2.CITY_FIELD),
            Enter.theValue(zip).into(UtestLoginPage2.ZIP_FIELD),
                //.thenHit(Keys.ARROW_DOWN, Keys.RETURN),
                Enter.keyValues(Keys.ARROW_DOWN, Keys.RETURN).into(UtestLoginPage2.ZIP_FIELD),
            Click.on(UtestLoginPage2.COUNTRY_SELECT),
                Enter.theValue(country).into(UtestLoginPage2.COUNTRY_FIELD)
                    .thenHit(Keys.RETURN),
            Click.on(UtestLoginPage2.NEXT_BUTTON),
            //PAGE 3/4 of the CREATE NEW USER form: DEVICES
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
            Click.on(UtestLoginPage3.NEXT_BUTTON),
            //PAGE 4/4 of the CREATE NEW USER form: DEVICES
            Enter.theValue(new_Password).into(UtestLoginPage4.NEW_PASSWORD_FIELD),
            Enter.theValue(new_Password).into(UtestLoginPage4.CONFIRM_PASSWORD_FIELD),
            Click.on(UtestLoginPage4.STAY_INFORMED_CHECKBOX),
            Click.on(UtestLoginPage4.ACCEPT_TERMS_CHECKBOX),
            Click.on(UtestLoginPage4.ACCEPT_POLICY_CHECKBOX),
            Click.on(UtestLoginPage4.COMPLETE_BUTTON)
        );
    }
}
