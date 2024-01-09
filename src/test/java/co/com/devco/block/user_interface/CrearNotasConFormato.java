package co.com.devco.block.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearNotasConFormato {

	public static final Target BUTTON_TIPO_DE_LETRA = Target.the("espacio poner la negrita").locatedBy("//div[@class='ck ck-toolbar__items']//span[text()='{0}']/../..");
	public static Target SPAN_NAV_MENU = Target.the("Escoger el menu a utilizar").locatedBy("//span[text()='Bold']");
	public static final Target S_MENSAJE = Target.the("espacio para crea la nota").located(By.xpath("//div[@id='editor']/p/strong"));

}
