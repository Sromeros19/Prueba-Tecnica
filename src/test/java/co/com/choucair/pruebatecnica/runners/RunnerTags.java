package co.com.choucair.pruebatecnica.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= "src/test/resources/features/pruebatecnica.feature",
        tags="@stories",
        glue="co.com.choucair.pruebatecnica.stepdefinitions",
        snippets=SnippetType.CAMELCASE)
//Comentario x
public class RunnerTags {
}
