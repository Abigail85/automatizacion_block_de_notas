package co.com.devco.block.stepdefinitions;


import co.com.devco.block.task.InteractuarConLasTareas;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.devco.block.user_interface.ListaDeTareas.DIV_LISTA_DE_TAREAS;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ListaDeTareasStepDefinitions {

    @Dado("crea una lista de  {int} tareas")
    public void creaUnaListaDe(int cantidadTareas, DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(
                InteractuarConLasTareas.crear(dataTable,cantidadTareas)
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
                Ensure.that(DIV_LISTA_DE_TAREAS.resolveAllFor(theActorInTheSpotlight())).hasSize(cantidadElementos)
        );
    }



}
