package co.com.devco.block.questions;

import co.com.devco.block.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.By;


public class LeerMensajeEnPantalla implements Question<Boolean> {

    private final Constantes tipoDeNota;
    private final String tipoDeLetra;



    public LeerMensajeEnPantalla(Constantes tipoDeNota, String tipoDeLetra){

        this.tipoDeNota = tipoDeNota;

        this.tipoDeLetra = tipoDeLetra;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        // actor.attemptsTo(BuscarNota.guardada(Constantes.TITULO));
        //String mensajeEnPantalla = A_ABRIR_NOTA_GUARDADA.resolveFor(actor).getText();
        //actor.attemptsTo(Ensure.that(mensajeEnPantalla).isEqualTo(texto));

        if (tipoDeNota.equals(Constantes.NOTA_SIN_FORMATO)) {
            actor.attemptsTo(LeerTextoSiExiste.delElemento(By.xpath("//div[@class='noteItem']/div/a")));
            String mensajeEnPantalla = actor.recall("Texto leido");
            return "Mi nota sin formato".equals(mensajeEnPantalla);
        } else if (tipoDeNota.equals(Constantes.NOTA_CON_FORMATO)) {
            if (tipoDeLetra.equals("NEGRITA")) {
                actor.attemptsTo(LeerTextoSiExiste.delElemento(By.xpath("//strong[text()='Buenas tardes, como estas?']")));//*[@id='editor']/p")));
                String mensajeEnPantalla = actor.recall("Texto leido");
                return mensajeEnPantalla.equals("Buenas tardes, como estas?");
            } else if (tipoDeLetra.equals("ITALIC")) {
                actor.attemptsTo(LeerTextoSiExiste.delElemento(By.xpath("//i[text()='Buenas tardes, como estas?']")));
                String mensajeEnPantalla = actor.recall("Texto leido");
                return mensajeEnPantalla.equals("Buenas tardes, como estas?");
            } else if (tipoDeLetra.equals("UNDERLINE")) {
                actor.attemptsTo(LeerTextoSiExiste.delElemento(By.xpath("//u[text()='Buenas tardes, como estas?']")));
                String mensajeEnPantalla = actor.recall("Texto leido");
                return mensajeEnPantalla.equals("Buenas tardes, como estas?");
            }else if (tipoDeLetra.equals("STRIKETHROUGH")) {
                actor.attemptsTo(LeerTextoSiExiste.delElemento(By.xpath("//s[text()='Buenas tardes, como estas?']")));
                String mensajeEnPantalla = actor.recall("Texto leido");
                return mensajeEnPantalla.equals("Buenas tardes, como estas?");
            }else{
                System.out.println("No esta");
            }

        }
        return true;
    }


    public static LeerMensajeEnPantalla esIgualALaNotaGuardada (Constantes tipoDeNota, String tipoDeLetra){
        return new LeerMensajeEnPantalla(tipoDeNota, tipoDeLetra);
  }

}
