package co.com.devco.block.task;


import co.com.devco.block.interactions.*;
import co.com.devco.block.utils.Constantes;
import co.com.devco.block.utils.NavBar;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;


import static co.com.devco.block.user_interface.CrearNuevasNotas.*;
import static co.com.devco.block.user_interface.GuardarNotas.*;




public class EscribirNota {


    public EscribirNota() {

    }

    public static Performable conFormato(Constantes tipoDeNota, String tipoDeLetra) {
        return Task.where("escribir la nota en el formato elegido",
                actor -> {
            actor.attemptsTo(EscogerTipo.nota(tipoDeNota.getConstante()));
            actor.attemptsTo(Click.on(A_CREAR_NOTA_NUEVA));
            actor.attemptsTo(NavMenu.seleccionado(tipoDeLetra));
            actor.attemptsTo(Click.on(P_TEXTO));
            actor.attemptsTo(Enter.theValue(" Buenas tardes, como estas?").into(P_TEXTO));
            actor.attemptsTo(ColocarTitulo.conFormato(tipoDeLetra));
            actor.attemptsTo(Click.on(BUTTON_GUARDAR_NOTA_CON_FORMATO));

        }
        );

    }
    public static Performable sinFormato(Constantes constantes) {
        return Task.where("Escribir la nota sin formato",
                actor -> {
            Switch.toAlert().andDismiss();
            actor.attemptsTo(EscogerTipo.nota(constantes.getConstante()));
            actor.attemptsTo(CrearNota.nueva());
            actor.attemptsTo(Click.on(INPUT_TITULO_NOTA));
            actor.attemptsTo(ColocarTitulo.conFormato(Constantes.DEFAULT.getConstante()));
            actor.attemptsTo(Scroll.to(BUTTON_GUARDAR_NOTA_SIN_FORMATO));
            actor.attemptsTo(Click.on(BUTTON_GUARDAR_NOTA_SIN_FORMATO));

                }
        );

    }
}
