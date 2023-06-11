package co.com.devco.block.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearNotasConFormato {

	public static final Target BUTTON_NEGRITA = Target.the("espacio poner la negrita").located(By.xpath("//div[@class='ck ck-toolbar__items']//span[text()='Bold (Ctrl+B)']/../.."));
	public static final Target S_MENSAJE = Target.the("espacio para crea la nota").located(By.xpath("//div[@id='editor']/p/strong"));

}
