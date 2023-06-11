package co.com.devco.block.stepdefinitions;

import co.com.devco.block.task.EscribirNota;
import co.com.devco.block.task.IngresarAlBlock;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;


import static co.com.devco.block.user_interface.CrearNotas.A_NOTA_GUARDADA;



public class CrearNota {
    @Dado("que un usuario ingresa a la opcion {string}")
    public void queUnUsuarioIngresaALaOpcion(String menu) {
        OnStage.theActorCalled("usuario").attemptsTo(
                IngresarAlBlock.deNotas(menu)
        );

    }
    @Cuando("escribe el mensaje {string} y le cambia el titulo a la nota por {string}")
    public void escribeElMensajeYLeCambiaElTituloALaNota(String mensaje, String titulo) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                EscribirNota.sinFormato(mensaje,titulo)
        );
    }
    @Entonces("puede buscar y ver la nota guardada con el titulo {string}")
    public void puedeBUscarYVerLaNotaGuardadaConElTitulo(String titulo) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(A_NOTA_GUARDADA).text().isEqualTo(titulo)
        );

    }

}
