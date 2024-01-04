package co.com.devco.block.questions;

import co.com.devco.block.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.By;

import static co.com.devco.block.user_interface.TrabajarConNotasGuardadas.A_ABRIR_NOTA_GUARDADA;


public class LeerMensajeEnPantalla implements Question<Boolean> {
    private final Constantes constanteTitulo;
    private final Constantes tipoDeNota;



    public LeerMensajeEnPantalla(Constantes constanteTitulo,Constantes tipoDeNota){
        this.constanteTitulo = constanteTitulo;
        this.tipoDeNota = tipoDeNota;

    }

    @Override
    public Boolean answeredBy(Actor actor) {
       // actor.attemptsTo(BuscarNota.guardada(Constantes.TITULO));
        //String mensajeEnPantalla = A_ABRIR_NOTA_GUARDADA.resolveFor(actor).getText();
        //actor.attemptsTo(Ensure.that(mensajeEnPantalla).isEqualTo(texto));

        if(tipoDeNota.equals(Constantes.NOTA_SIN_FORMATO)){
            actor.attemptsTo(LeerTextoSiExiste.delElemento(By.xpath("//div[@class='noteItem']/div/a")));
             String mensajeEnPantalla = actor.recall("Texto leido");
             return constanteTitulo.getConstante().equals(mensajeEnPantalla);


        } else if (tipoDeNota.equals(Constantes.NOTA_CON_FORMATO)) {
            actor.attemptsTo(LeerTextoSiExiste.delElemento(By.xpath("//*[@id='editor']/p")));
            String mensajeEnPantalla = actor.recall("Texto leido");
            return constanteTitulo.getConstante().equals(mensajeEnPantalla);
        }
        return true;
    }





    public static LeerMensajeEnPantalla esIgualALaNotaGuardada ( Constantes constanteTitulo,Constantes tipoDeNota){
        return new LeerMensajeEnPantalla(constanteTitulo,tipoDeNota);
  }

}
