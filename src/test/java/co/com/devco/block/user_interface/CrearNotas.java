package co.com.devco.block.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearNotas {

	public static final Target A_CREAR_NOTA_NUEVA = Target.the("Espacio para crear nota nueva").located(By.id("newNote"));
    public static final Target TEXTAREA_ESCRIBIR_NOTA = Target.the("Espacio para crear nota sin formato").located(By.id("input"));
	public static final Target P_TEXTO = Target.the("espacio para crea la nota").located(By.id("editor"));
	public static final Target INPUT_EDITAR_TITULO = Target.the("Espacio para crear el titulo de la nota").located(By.id("editNoteName"));
	public static final Target INPUT_TITULO_NOTA = Target.the("Espacio para crear el titulo de la nota").located(By.id("noteName"));
	public static final Target SPAN_DESCARGAR_NOTA = Target.the("Espacio para descargar la nota").located(By.xpath("//span[text()='Guardar descarga']"));
	public static final Target BUTTON_GUARDAR_NOTA = Target.the("espacio para guardar la nota").located(By.xpath("//div[@id=\"plaintextnote\"]//following::button"));
	public static final Target A_NOTA_GUARDADA = Target.the("espacio para guardar la nota").located(By.xpath("//div[@class='noteItem']"));
	public static final Target INPUT_BUSCAR_NOTA = Target.the("Busqueda de las notas guardadas").located(By.id("noteSearch"));

}
