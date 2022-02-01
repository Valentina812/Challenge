package co.com.kinandcarta.certification.amazon.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "C:/Users/sebas/Desktop/Challenge/src/test/resources/features/Purchase.feature",
        glue = "co/com/kinandcarta/certification/amazon/stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class Purchase {

}
