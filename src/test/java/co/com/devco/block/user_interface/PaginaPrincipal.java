package co.com.devco.block.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipal {
    public static Target BUTTON_ESCOGER_MENU = Target.the("Escoger el menu a utilizar").locatedBy("//button[text()='{0}']");
    public static Target SPAN_DIALOGO = Target.the("Escoger el menu a utilizar").located(By.xpath("//span[normalize-space(@class)='ns-9ahci-e-18' and normalize-space(text())='Cerrar']//span[contains(text(),'Cerrar')]"));

}
