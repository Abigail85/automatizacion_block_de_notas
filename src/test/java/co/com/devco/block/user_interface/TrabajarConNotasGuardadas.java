package co.com.devco.block.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TrabajarConNotasGuardadas {

	public static final Target INPUT_BUSCAR_NOTA = Target.the("Busqueda de las notas guardadas").located(By.id("noteSearch"));//cssSelector("#noteSearch"));//id("noteSearch"));//div[@id="itemId-37516"]/div[1]/a////input[@id="noteSearch"]
	public static final Target A_ABRIR_NOTA_GUARDADA = Target.the("espacio para ver la nota guardada").located(By.xpath("//span[@id='counter']"));//div[@id'editor']/p/span"));//div[@class='noteItem']"));//self::div/child::a[@data-protected='false']"));//div[@class='noteItem']//a[@onclick='showNote(event,this)']"));//div[@class=\"noteItem\"]//a[@data-protected='false']"));//a[@onclick='showNote(event,this)']"));//*[@id="itemId-41017"]/div[1]/a//a[contains(@data-protected,\"false\")]"));//a[@class=\"text-dark text-decoration-none updatedNote-38278\"]"));//div[@class = 'noteItem']//following-sibling::div//a[contains(@onclick, 'showNote(event,this)')]"));//a[contains(@onclick, 'showNote(event,this)')]"));//*[@id=\"itemId-37597\"]/div[1]/a"));//div[@class='noteItem']//following :: a"));//div[@class='side-bar']/div['{0}']");
	public static final Target A_LEER_NOTA_GUARDADA = Target.the("Espacio para leer la nota guardada").located(By.className("paper-content plaintextnote note_editors"));//xpath("//div[@id='plaintextnot']"));//cssSelector("#input"));//xpath("//div[@id=\"plaintextnote\"]//textarea"));
}



