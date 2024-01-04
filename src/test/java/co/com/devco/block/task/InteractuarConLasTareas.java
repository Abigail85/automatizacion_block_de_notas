package co.com.devco.block.task;

import co.com.devco.block.interactions.*;
import co.com.devco.block.utils.Constantes;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;


import javax.swing.*;
import java.util.List;


import static co.com.devco.block.user_interface.CrearNuevasNotas.*;
import static co.com.devco.block.user_interface.ListaDeTareas.*;
import static co.com.devco.block.user_interface.PaginaPrincipal.BUTTON_ESCOGER_MENU;


public class InteractuarConLasTareas {

    public static Performable crear(DataTable datatable,Constantes constantes) {
        return Task.where("Crear tareas en una lista de tareas",
                actor -> {
                    actor.attemptsTo(EscogerTipo.nota(constantes.getConstante()));
                    actor.attemptsTo(Click.on(A_CREAR_NOTA_NUEVA));
                    List<List<String>> userDataList = datatable.asLists(String.class);
                    for (List<String> e : userDataList) {
                        actor.attemptsTo(Enter.theValue(e.get(0)).into(INPUT_CREAR_TAREAS));
                        actor.attemptsTo(Click.on(INPUT_ADICIONAR_TAREAS));

                    }
                    actor.attemptsTo(ColocarTitulo.aLaNota(Constantes.TITULO));
                    actor.attemptsTo(GuardarNota.enElBlock("Lista de tareas"));
                }
        );
    }
    public static Performable mover(Integer elemento,Integer elementoDos) {
        return Task.where("Mueve una tarea de la lista de tareas",
                actor -> {
                    //BuscarNota.guardada("Mi primera lista");
                   // Click.on(AbrirNota.guardada());
                    String elementoAMover = String.valueOf(elemento);
                    String elementoDondeSeMueve = String.valueOf(elementoDos);
                    actor.attemptsTo(Drag.from(DIV_MOVER_ELIMINAR_TAREA.of(elementoAMover)).to(DIV_MOVER_ELIMINAR_TAREA.of(elementoDondeSeMueve)));
                }
        );
    }
    public static Performable eliminar(int elemento) {
        return Task.where("Eliminar tareas de una lista de tareas",
                actor -> {
                    actor.attemptsTo(Scroll.to(BUTTON_ESCOGER_MENU.of("Nota de texto sin formato")));
                    String elementoAEliminar = String.valueOf(elemento);
                    actor.attemptsTo(Click.on(DIV_MOVER_ELIMINAR_TAREA.of(elementoAEliminar)));
                }
        );
    }
}



