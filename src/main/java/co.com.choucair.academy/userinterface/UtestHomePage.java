package co.com.choucair.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.utest.com/")
public class UtestHomePage extends PageObject {
    public static final Target JOIN_TODAY_BUTTON = Target.the("Button that open the form to create a new user").located(By.className("unauthenticated-nav-bar__sign-up"));
}