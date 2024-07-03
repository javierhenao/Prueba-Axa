package prueba.com.steps;

import net.thucydides.core.annotations.Step;
import prueba.com.pageobjects.CreacionUsuarioPage;

public class CreacionUsuarioSteps {
	
	CreacionUsuarioPage creacionUsuarioPage;
	
	@Step
	public void verificaQueIngreseAlSitioPRODUCSTOREStep() {
		creacionUsuarioPage.verificaQueIngreseAlSitioPRODUCSTOREPage();
	}
	
	
	@Step
	public void ingresoSignUpStep() throws InterruptedException {
		creacionUsuarioPage.ingresoSignUpPage();
	}
	
	
	@Step
	public void ingresoUsernamePasswordStep(String username, String password) {
		creacionUsuarioPage.ingresoUsernamePasswordPage(username, password);
	}
	


}
