package co.com.devco.block.stepdefinitions;


import co.com.devco.block.interactions.EscogerTipo;
import co.com.devco.block.task.IngresarAlBlock;
import co.com.devco.block.task.InteractuarConLasTareas;
import co.com.devco.block.utils.Constantes;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ListaDeTareasStepDefinitions {

    @Dado("que un usuario crea una lista de tareas")
    public void creaUnaListaDe(DataTable dataTable) {
        OnStage.theActorCalled("usuario").attemptsTo(
                IngresarAlBlock.deNotas(),
                InteractuarConLasTareas.crear(dataTable, Constantes.LISTA_TAREAS)
        );
    }

    @Y("un usuario mueve el elemento {int} de la lista donde de encuentra el elemento {int}")
    public void unUsuarioMueveElElementoDeLaLista(Integer elemento, Integer elementoDos) {
       theActorInTheSpotlight().attemptsTo(
               InteractuarConLasTareas.mover(elemento,elementoDos)
       );
    }

    @Cuando("elimina el elemento {int} de la lista")
    public void eliminaElElementoDeLaLista(int elemento)  {
        theActorInTheSpotlight().attemptsTo(
                InteractuarConLasTareas.eliminar(elemento)
        );
    }

    @Entonces("debe ver como resultado {int} elementos")
    public void debeVerComoResultadoElementos(Integer cantidadElementos) {
        theActorInTheSpotlight().attemptsTo(
                //Ensure.that(DIV_LISTA_DE_TAREAS.resolveAllFor(theActorInTheSpotlight())).hasSize(cantidadElementos)
        );
    }



}
