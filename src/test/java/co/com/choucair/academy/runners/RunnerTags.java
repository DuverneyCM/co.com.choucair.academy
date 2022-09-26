package co.com.choucair.academy.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/createNewUser.feature",
        tags = "@HappyPath", //"@Stories",
        glue = "co.com.choucair.academy.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerTags {
}