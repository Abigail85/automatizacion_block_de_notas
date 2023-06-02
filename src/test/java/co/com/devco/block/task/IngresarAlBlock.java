package co.com.devco.block.task;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.devco.block.user_interface.PaginaPrincipal.BUTTON_ESCOGER_MENU;

public class IngresarAlBlock {
    public static Performable deNotas(String menu) {
        return Task.where("{0} Ingresar al block de notas",
                Open.url("https://www.online-notepad.net/es/bloc-de-notas-online"),
                Click.on(BUTTON_ESCOGER_MENU.of(menu))


                );

    }
}
