package co.com.devco.block.stepdefinitions;

import co.com.devco.block.exceptions.LosMensajesNoSonLosMismosExceptions;
import co.com.devco.block.questions.LeerMensajeEnPantalla;
import co.com.devco.block.task.EscribirNota;
import co.com.devco.block.task.IngresarAlBlock;
import co.com.devco.block.utils.Constantes;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;



import static co.com.devco.block.exceptions.LosMensajesNoSonLosMismosExceptions.LOS_MENSAJES_NO_SON_LOS_MISMOS;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;


public class CrearNota {
    @Dado("que un usuario se encuentra en un block de notas")
    public void queUnUsuarioSeEncuntraEnUnBlockDeNotas() {
        theActorCalled("usuario").attemptsTo(
                IngresarAlBlock.deNotas()
        );

    }
    @Cuando("crea una nota")
    public void creaUnaNota() {
        theActorInTheSpotlight().attemptsTo(
                EscribirNota.sinFormato(Constantes.NOTA_SIN_FORMATO)
        );
    }
    @Entonces("puede ver la nota creada de manera exitosa")
    public void puedeVerLaNotaCreadaDeManeraExitosa(String tipoDeLetra) {
        theActorInTheSpotlight().should(seeThat(LeerMensajeEnPantalla.esIgualALaNotaGuardada(Constantes.NOTA_SIN_FORMATO, tipoDeLetra)).orComplainWith(LosMensajesNoSonLosMismosExceptions.class, LOS_MENSAJES_NO_SON_LOS_MISMOS));

    }
}
