package prueba.com.pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RealizarCompraPage extends PageObject{
	
	protected static final Logger logger = LoggerFactory.getLogger(RealizarCompraPage.class);
	
	@FindBy (xpath = "//a[@id='cat']")
	public WebElementFacade tituloCategories;
	
	@FindBy (xpath = "//a[text()='Phones']")
	public WebElementFacade categoriaPhones;
	
	@FindBy (xpath = "//a[text()='Laptops']")
	public WebElementFacade categoriaLaptops;
	
	@FindBy (xpath = "//a[text()='Monitors']")
	public WebElementFacade categoriaMonitors;
	
	@FindBy (xpath = "//a[text()='Add to cart']")
	public WebElementFacade botonAddToCart;
	
	
	public void seleccionarCategoriesPage(String categories) {
		logger.info("Inicia el paso: Seleccionar Categories");
		waitFor(1).seconds();
		
		if (tituloCategories.isPresent()) {
			
			logger.info("Seccion Categories Presente en la aplicacion");
			WebElementFacade categoriaOpcion;
			switch (categories) {
				case "Phones":
					categoriaOpcion = categoriaPhones;
					break;
				
				case "Laptops":
					categoriaOpcion = categoriaLaptops;
					break;
					
				case "Monitors":
					categoriaOpcion = categoriaMonitors;
					break;
				default:
					throw new IllegalArgumentException("Categoria no válida: " + categories);
			
			}
			
			String categoriaTexto = categoriaOpcion.getText();
			logger.info("Se extrae el nombre de la categoria: " + categoriaTexto);
			
			if (categoriaTexto.equals(categories)) {
				logger.info("Se verifica si la categoria que se busca por data existe en la apliplación");
				categoriaOpcion.click();
				logger.info("Se selecciona la categoria: " + categories);
				waitFor(1).seconds();
			
			} else {
				assertTrue("La aplicacion no carga la categoria: " + categories, false);
				}
		
		} else {
			assertTrue("La aplicacion no carga las categorias", false);
		}
		
		logger.info("Termina el paso: Seleccionar Categorias");
	}
	
	
	public void seleccionoProductoPage(String producto) {
		
		logger.info("Inicia el paso: Seleccionar Producto");
		
		logger.info("Crear el xpath dinámico para el producto basado en el nombre del producto");
		String productoXpath = String.format("//a[text()='%s']", producto);
		WebElementFacade productoElement = find(By.xpath(productoXpath));
		
		if (productoElement.isPresent()) {
			
			logger.info("Verificar que el producto exista en la apicación");
			productoElement.click();
			logger.info("Se selecciona el producto: " + producto);
			waitFor(1).seconds();
		
		} else {
			
			assertTrue("La aplicacion no carga el producto: " + producto, false);
			}
		
		logger.info("Termina el paso: Seleccionar Producto");
	
	}
	
	
	public void darClickBotonAddToCartPage() {
		
		logger.info("Inicia el paso: Dar click en el boton Add to cart");
		
		if (botonAddToCart.isPresent()) {
			
			botonAddToCart.click();
			logger.info("Se da clic en boton Add to cart");
			waitFor(1).seconds();
		
		}else {
			assertTrue("La aplicacion no carga el boton Add to cart", false);
		}
		
	logger.info("Termina el paso: Dar click en el boton Add to cart");
	}
}