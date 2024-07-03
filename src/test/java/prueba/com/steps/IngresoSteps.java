package prueba.com.steps;

import net.thucydides.core.annotations.Step;
import prueba.com.pageobjects.IngresoPage;

	
public class IngresoSteps {

	IngresoPage ingresoPage;
	
			
	@Step
	public void ingresoSitioLoginSteps() {
		ingresoPage.open();
	}	
	
}
