package co.com.devco.block.task;


import co.com.devco.block.interactions.*;
import co.com.devco.block.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;

import static co.com.devco.block.user_interface.CrearNotasConFormato.BUTTON_NEGRITA;
import static co.com.devco.block.user_interface.CrearNuevasNotas.*;
import static co.com.devco.block.user_interface.GuardarNotas.*;
import static co.com.devco.block.user_interface.PaginaPrincipal.BUTTON_ESCOGER_MENU;
import static co.com.devco.block.user_interface.PaginaPrincipal.SPAN_DIALOGO;


public class EscribirNota {
    private final Constantes constantes;

    public EscribirNota(Constantes constantes) {
        this.constantes = constantes;
    }

    public static Performable enNegrita(Constantes constantes, Constantes constantes1) {
        return Task.where("escribir la nota en negrita",
                actor -> {
                    actor.attemptsTo(EscogerTipo.nota(constantes.getConstante()));
                    actor.attemptsTo(Scroll.to(BUTTON_ESCOGER_MENU.of("Nota de texto sin formato")));
                    actor.attemptsTo(Click.on(A_CREAR_NOTA_NUEVA));
                    actor.attemptsTo(Click.on(BUTTON_NEGRITA));
                   // actor.attemptsTo(Click.on(P_TEXTO));
                    //actor.attemptsTo(Hit.the(Keys.SPACE).into(P_TEXTO));
                    actor.attemptsTo(Enter.theValue(constantes1.getConstante()).into(P_TEXTO));
                    actor.attemptsTo(Click.on(BUTTON_GUARDAR_NOTA_CON_FORMATO));
                }
                );

    }
    public static Performable sinFormato(Constantes constantes) {
        return Task.where("Escribir la nota sin formato",
                actor -> {
                    try {
                        Switch.toAlert().andDismiss();
                    } finally {

                    }
                    actor.attemptsTo(EscogerTipo.nota(constantes.getConstante()));
                    actor.attemptsTo(CrearNota.nueva(Constantes.TEXTO_1));
                    actor.attemptsTo(ColocarTitulo.aLaNota(Constantes.TITULO));
                    actor.attemptsTo(Scroll.to(BUTTON_GUARDAR_NOTA_SIN_FORMATO));
                    actor.attemptsTo(Click.on(BUTTON_GUARDAR_NOTA_SIN_FORMATO));

                }
        );

    }
}
