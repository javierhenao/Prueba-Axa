package prueba.com.pageobjects;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.DoubleClickAction;
import org.openqa.selenium.support.ui.Select;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("deprecation")
public class IngresoPage extends PageObject{	
	protected static final Logger logger = LoggerFactory.getLogger(IngresoPage.class);	
		
}