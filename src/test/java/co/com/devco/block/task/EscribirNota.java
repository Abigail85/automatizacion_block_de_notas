package co.com.devco.block.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static co.com.devco.block.user_interface.CrearNotas.*;
import static co.com.devco.block.user_interface.CrearNotasConFormato.BUTTON_NEGRITA;
import static co.com.devco.block.user_interface.PaginaPrincipal.BUTTON_ESCOGER_MENU;

public class EscribirNota {
    public static Performable enNegrita(String mensaje) {
        return Task.where("escribir la nota en negrita",
                Scroll.to(BUTTON_ESCOGER_MENU.of("Nota de texto sin formato")),
                Click.on(BUTTON_NEGRITA),
                Enter.theValue(mensaje).into(P_TEXTO)

                );

    }
    public static Performable sinFormato(String mensaje, String titulo) {
        return Task.where("Escribir la nota sin formato",
                Scroll.to(BUTTON_ESCOGER_MENU.of("Nota de texto sin formato")),
                Click.on(A_CREAR_NOTA_NUEVA),
                Click.on(TEXTAREA_ESCRIBIR_NOTA),
                Enter.theValue(mensaje).into(TEXTAREA_ESCRIBIR_NOTA),
                Click.on(INPUT_EDITAR_TITULO),
                Enter.theValue(titulo).into(INPUT_TITULO_NOTA),
                Scroll.to(SPAN_DESCARGAR_NOTA),
                Click.on(BUTTON_GUARDAR_NOTA),
                Scroll.to(INPUT_BUSCAR_NOTA),
                Click.on(INPUT_BUSCAR_NOTA),
                Enter.theValue(titulo).into(INPUT_BUSCAR_NOTA)

        );

    }
}
