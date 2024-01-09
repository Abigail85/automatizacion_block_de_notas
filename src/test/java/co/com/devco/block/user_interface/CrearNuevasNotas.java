package co.com.devco.block.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearNuevasNotas {

	public static final Target A_CREAR_NOTA_NUEVA = Target.the("Espacio para crear nota nueva").located(By.xpath("//*[@id='newNote']/span"));//xpath("//*[@id=\"newNote\"]/span"));//*[@id='newNote']/img"));//id("newNote"));//xpath("//a[@id=\"newNote\"]/span"));//span[text()='Nueva nota']"));//a[@id=\"newNote\"]//following :: span"));//cssSelector("#newNote > span"));
	public static final Target TEXTAREA_ESCRIBIR_NOTA = Target.the("Espacio para crear nota sin formato").located(By.id("input"));
	public static final Target P_TEXTO = Target.the("espacio para crea la nota").located(By.xpath("//div[@id='editor']"));//By.id("editor"));
	public static final Target INPUT_EDITAR_TITULO = Target.the("Espacio para seleccionar el titulo de la nota").located(By.id("editNoteName"));
	public static final Target INPUT_TITULO_NOTA = Target.the("Espacio para crear el titulo de la nota").located(By.id("noteName"));;
}



