package prueba.com.definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import prueba.com.steps.RealizarCompraSteps;

public class RealizarCompraDefiitions {
	
	@Steps
	RealizarCompraSteps realizarCompraSteps;
	
	@When("^Seleccionar Categories \"([^\"]*)\"$")
	public void seleccionar_Categories(String categories) throws Exception {
	    realizarCompraSteps.seleccionarCategoriesStep(categories);
	}
	
	
	@When("^Selecciono Producto \"([^\"]*)\"$")
	public void selecciono_Producto(String producto) throws Exception {
	    realizarCompraSteps.seleccionoProductoStep(producto);
	}
	
	
	@Then("^Dar click en el boton Add to cart$")
	public void dar_click_en_el_boton_Add_to_cart() throws Exception {
	    realizarCompraSteps.darClickBotonAddToCartStep();
	}
	

}
