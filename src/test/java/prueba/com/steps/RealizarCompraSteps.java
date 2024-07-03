package prueba.com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import prueba.com.pageobjects.RealizarCompraPage;

public class RealizarCompraSteps {
	
	@Steps
	RealizarCompraPage realizarCompraPage;
	
	@Step
	public void seleccionarCategoriesStep(String categories) {
		realizarCompraPage.seleccionarCategoriesPage(categories);
	}
	
	@Step
	public void seleccionoProductoStep(String producto) {
		realizarCompraPage.seleccionoProductoPage(producto);
	}
	
	@Step
	public void darClickBotonAddToCartStep() {
		realizarCompraPage.darClickBotonAddToCartPage();
	}

}
