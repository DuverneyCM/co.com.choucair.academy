package co.com.choucair.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

//@DefaultUrl("https://www.utest.com/signup/complete")
public class UtestLoginPage4 extends PageObject {
    public static final Target NEW_PASSWORD_FIELD = Target.the("Field to input the new user's password").
            located(By.id("password"));
    public static final Target CONFIRM_PASSWORD_FIELD = Target.the("Field to confirm the new user's password").
            located(By.id("confirmPassword"));
    public static final Target STAY_INFORMED_CHECKBOX = Target.the("Checkbox to accept the terms of use and guidelines").
            located(By.name("newsletterOptIn"));
    public static final Target ACCEPT_TERMS_CHECKBOX = Target.the("Checkbox to accept the terms of use and guidelines").
            located(By.id("termOfUse"));
    public static final Target ACCEPT_POLICY_CHECKBOX = Target.the("Checkbox to accept the Privacy and Security Policy").
            located(By.id("privacySetting"));
    public static final Target COMPLETE_BUTTON = Target.the("Button to going to the next form page (3/4) to create a new user").
            located(By.xpath("//*[contains(@aria-label,'Complete')]"));
    public static final Target BACK_BUTTON = Target.the("Button to going to the back form page (1/4) to create a new user").
            located(By.xpath("//*[contains(@aria-label,'Back')]"));
}
