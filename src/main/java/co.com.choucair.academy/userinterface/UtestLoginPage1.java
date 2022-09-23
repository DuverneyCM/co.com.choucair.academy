package co.com.choucair.academy.userinterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

//@DefaultUrl("https://www.utest.com/signup/personal")
public class UtestLoginPage1 extends PageObject {
    public static final Target FIRST_NAME_FIELD = Target.the("Field to input the user's first name").
            located(By.id("firstName"));
    public static final Target LAST_NAME_FIELD = Target.the("Field to input the user's last name").
            located(By.id("lastName"));
    public static final Target EMAIL_FIELD = Target.the("Field to input the user's email").
            located(By.id("email"));
    public static final Target BIRTH_MONTH_SELECT = Target.the("Selector to choose the month of the user's date of birth").
            located(By.id("birthMonth"));
    public static final Target BIRTH_DAY_SELECT = Target.the("Selector to choose the day of the user's date of birth").
            located(By.id("birthDay"));
    public static final Target BIRTH_YEAR_SELECT = Target.the("Selector to choose the year of the user's date of birth").
            located(By.id("birthYear"));
    //User could be registered just with the default language
    public static final Target LANGUAGE_FIELD = Target.the("Input field to add more languages").
            located(By.xpath("//*[contains(@class,'select-search')]"));
    public static final Target NEXT_BUTTON = Target.the("Button that open the next form page (2/4) to create a new user").
            located(By.xpath("//*[contains(@aria-label,'Next')]"));
}
