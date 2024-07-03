package prueba.com.Runners;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import prueba.com.utilidades.BeforeSuite;
import prueba.com.utilidades.DataToFeature;


@CucumberOptions(features ="src/test/resources/feature/",
				 glue = "prueba.com",
				 tags = {"@PruebaAxa"},
				 monochrome= true)

@RunWith(RunnerPersonalizado.class)
public class RunnerTodo {

	@BeforeSuite
	public static void test() throws InvalidFormatException, IOException {		
		DataToFeature.overrideFeatureFiles("./src/test/resources/feature/");
		}
}
 