package co.com.choucair.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

//@DefaultUrl("https://www.utest.com/signup/devices")
public class UtestLoginPage3 extends PageObject {
    public static final Target PC_OS_SELECT = Target.the("Selector to choose the PC's Operative System (OS)").
            located(By.name("osId"));
    public static final Target PC_OS_FIELD = Target.the("Field to input the PC's Operative System (OS)").
            located(By.xpath("//div[@name='osId']//input[@type='search']"));
    public static final Target PC_VERSION_SELECT = Target.the("Selector to choose the version of PC's Operative System (OS)").
            located(By.name("osVersionId"));
    public static final Target PC_VERSION_FIELD = Target.the("Field to input the version of PC's Operative System (OS)").
            located(By.xpath("//div[@name='osVersionId']//input[@type='search']"));
    public static final Target PC_LANGUAGE_SELECT = Target.the("Selector to choose the language of PC's Operative System (OS)").
            located(By.name("osLanguageId"));
    public static final Target PC_LANGUAGE_FIELD = Target.the("Field to input the language of PC's Operative System (OS)").
            located(By.xpath("//div[@name='osLanguageId']//input[@type='search']"));

    public static final Target MOBILE_BRAND_SELECT = Target.the("Selector to choose the month of the user's date of birth").
            located(By.name("handsetMakerId"));
    public static final Target MOBILE_BRAND_FIELD = Target.the("Field to input the language of PC's Operative System (OS)").
            located(By.xpath("//div[@name='handsetMakerId']//input[@type='search']"));
    public static final Target MOBILE_MODEL_SELECT = Target.the("Selector to choose the month of the user's date of birth").
            located(By.name("handsetModelId"));
    public static final Target MOBILE_MODEL_FIELD = Target.the("Field to input the language of PC's Operative System (OS)").
            located(By.xpath("//div[@name='handsetModelId']//input[@type='search']"));
    public static final Target MOBILE_OS_SELECT = Target.the("Selector to choose the month of the user's date of birth").
            located(By.name("handsetOSId"));
    public static final Target MOBILE_OS_FIELD = Target.the("Field to input the language of PC's Operative System (OS)").
            located(By.xpath("//div[@name='handsetOSId']//input[@type='search']"));

    public static final Target NEXT_BUTTON = Target.the("Button to going to the next form page (4/4) to create a new user").
            located(By.xpath("//*[contains(@aria-label,'Next')]"));
    public static final Target BACK_BUTTON = Target.the("Button to going to the back form page (2/4) to create a new user").
            located(By.xpath("//*[contains(@aria-label,'Back')]"));
}
