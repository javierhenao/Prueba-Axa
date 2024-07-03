package prueba.com.definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import prueba.com.steps.IngresoSteps;

public class IngresoDefinition {

	@Steps
	IngresoSteps ingresoSteps;
	
	@Given("^Ingreso al sitio$") 
	public void ingresoSitioLogin(){
		ingresoSteps.ingresoSitioLoginSteps(); 
	}

}