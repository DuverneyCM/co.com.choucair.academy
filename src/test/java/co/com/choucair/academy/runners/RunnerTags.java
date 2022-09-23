package co.com.choucair.academy.runners;

//import cucumber.api.CucumberOptions;
//import cucumber.api.SnippetType;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        //features = "src/test/resources/features/academyChoucair.feature",
        features = "src/test/resources/features/createNewUser.feature",
        tags = "@HappyPath", //"@Stories",
        glue = "co.com.choucair.academy.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE //CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerTags {
}