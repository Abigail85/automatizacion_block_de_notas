package co.com.devco.block.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static co.com.devco.block.user_interface.NotaTextoEnriquecidoHomePage.BUTTON_NEGRITA;
import static co.com.devco.block.user_interface.NotaTextoEnriquecidoHomePage.P_TEXTO;
import static co.com.devco.block.user_interface.PaginaPrincipal.BUTTON_ESCOGER_MENU;

public class EscribirNota {
    public static Performable enNegrita(String mensaje) {
        return Task.where("escribir la nota en negrita",
                Scroll.to(BUTTON_ESCOGER_MENU.of("Nota de texto sin formato")),
                Click.on(BUTTON_NEGRITA),
                Enter.theValue(mensaje).into(P_TEXTO)

                );

    }
}
