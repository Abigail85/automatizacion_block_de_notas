package co.com.devco.block.stepdefinitions;


import co.com.devco.block.exceptions.LosMensajesNoSonLosMismosExceptions;
import co.com.devco.block.questions.LeerMensajeEnPantalla;
import co.com.devco.block.task.EscribirNota;
import co.com.devco.block.task.IngresarAlBlock;
import co.com.devco.block.utils.Constantes;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;


import static co.com.devco.block.exceptions.LosMensajesNoSonLosMismosExceptions.LOS_MENSAJES_NO_SON_LOS_MISMOS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class CreaNotaConFormatoStepDefinitions {

    @Dado("que un usuario ingresa nuevamente al block de notas")
    public void queUnUsuarioIngresaNuevamenteAlBlockDeNotas() {
       OnStage.theActorCalled("usuario").attemptsTo(
               IngresarAlBlock.deNotas());

    }
    @Cuando("escribe una nota nueva")
    public void creaLaNotaEnNegrita() {
        theActorInTheSpotlight().attemptsTo(
                EscribirNota.enNegrita(Constantes.NOTA_CON_FORMATO,Constantes.TEXTO_2)
        );

    }
    @Entonces("debe ver como resultado su nota en negrita")
    public void debeVerComoResultadoSuNotaEn() {
        theActorInTheSpotlight().should(seeThat(LeerMensajeEnPantalla.esIgualALaNotaGuardada(Constantes.NOTA_CON_FORMATO,Constantes.TITULO)).orComplainWith(LosMensajesNoSonLosMismosExceptions.class, LOS_MENSAJES_NO_SON_LOS_MISMOS));




    }



}
