package co.com.choucair.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

//@DefaultUrl("https://www.utest.com/signup/address")
public class UtestLoginPage2 extends PageObject {
    public static final Target CITY_FIELD = Target.the("Field to input the user's city").
            located(By.id("city"));
    public static final Target ZIP_FIELD = Target.the("Field to input the user's zip or postal code").
            located(By.id("zip"));
    //postal code can setup the country automatically
    public static final Target COUNTRY_SELECT = Target.the("Selector to choose the user's country").
            //located(By.id("countryId"));
            located(By.xpath("//*[@class='ui-select-match' and @placeholder='Select a country']"));
    public static final Target COUNTRY_FIELD = Target.the("Field to input the user's country").
            located(By.xpath("//input[contains(@placeholder,'Select a country')]"));
    public static final Target NEXT_BUTTON = Target.the("Button to going to the next form page (3/4) to create a new user").
            located(By.xpath("//*[contains(@aria-label,'Next')]"));
    public static final Target BACK_BUTTON = Target.the("Button to going to the back form page (1/4) to create a new user").
            located(By.xpath("//*[contains(@aria-label,'Back')]"));
}
