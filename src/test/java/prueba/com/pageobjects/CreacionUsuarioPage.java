package prueba.com.pageobjects;

import static org.junit.Assert.assertTrue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.io.File;

public class CreacionUsuarioPage extends PageObject{
	
	protected static final Logger logger = LoggerFactory.getLogger(CreacionUsuarioPage.class);
	
	
	@FindBy (xpath = "//a[@id='nava']")
	public WebElementFacade tituloProducStore;
		
	@FindBy (xpath = "//a[@id='signin2']")
	public WebElementFacade opcionSignUp;
	
	@FindBy (xpath = "//h5[@id='signInModalLabel']")
	public WebElementFacade tituloSignUp;
	
	@FindBy (xpath = "//input[@id='sign-username']")
	public WebElementFacade campoSignUsername;
	
	@FindBy (xpath = "//input[@id='sign-password']")
	public WebElementFacade campoSignPassword;
	
	@FindBy (xpath = "//button[text()='Sign up']")
	public WebElementFacade botonSignUp;
	
	
	
	public void verificaQueIngreseAlSitioPRODUCSTOREPage() {
		
		logger.info("Inicio el paso: Se verifica que se ingrese al sitio PRODUCT STORE");
		
		if (tituloProducStore.isPresent()) {
			logger.info("Se ingreso al sitio PRODUCT STORE");
			waitFor(1).seconds();
		}else {
			assertTrue("No se ingreso al sitio PRODUCT STORE", false);
		}
		
		logger.info("Termina el paso: Se verifica que se ingrese al sitio PRODUCT STORE");	
	}
	
	
	public void ingresoSignUpPage() {
		logger.info("Inicio el paso: Ingreso a la opcion Sign up");
		
		if (opcionSignUp.isPresent()) {
			
			opcionSignUp.click();			
			logger.info("Dio click la opcion Sign up");
			waitFor(1).seconds();
		}else {
			assertTrue("La aplicacion no carga la opcion Sign up", false);
			
		}
		
		logger.info("Termina el paso: Ingreso a la opcion Sign up");
		
	}
	
	
	public void ingresoUsernamePasswordPage(String username, String password) {
		logger.info("Inicio el paso: Ingreso Username y Password.");
		
		if(tituloSignUp.isPresent()) {
			
			campoSignUsername.sendKeys(username);
			logger.info("Ingreso el Username: " + username);
			waitFor(1).seconds();
			
			campoSignPassword.sendKeys(password);
			logger.info("Ingreso el Password: " + password);
			waitFor(1).seconds();
			
			botonSignUp.click();
			logger.info("Click en el boton Sign Up.");
			waitFor(1).seconds();
			
		}else {
			assertTrue("La aplicacion no carga el formulario Sign up", false);
		}
		
		logger.info("Termina el paso: Ingreso Username y Password.");
		
	}
	
}
