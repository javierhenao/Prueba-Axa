package prueba.com.definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import prueba.com.steps.CreacionUsuarioSteps;

public class CreacionUsuarioDefinition {
	
	@Steps
	CreacionUsuarioSteps creacionUsuarioSteps;
	
	@When("^Se verifica que se ingrese al sitio PRODUCT STORE$")
	public void se_verifica_que_se_ingrese_al_sitio_PRODUCT_STORE() throws Exception {
	    creacionUsuarioSteps.verificaQueIngreseAlSitioPRODUCSTOREStep();
	}
	
	
	@When("^Ingreso a la opcion Sign up$")
	public void ingreso_a_la_opcion_Sign_up() throws Exception {
		creacionUsuarioSteps.ingresoSignUpStep();
	}
	
	
	@When("^Ingreso Username \"([^\"]*)\" y Password \"([^\"]*)\"$")
	public void ingreso_Username_y_Password(String username, String password) throws Exception {
	    creacionUsuarioSteps.ingresoUsernamePasswordStep(username, password);
	}

}
