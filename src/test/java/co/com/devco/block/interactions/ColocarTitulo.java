package co.com.devco.block.interactions;

import co.com.devco.block.utils.Constantes;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static co.com.devco.block.user_interface.CrearNuevasNotas.INPUT_TITULO_NOTA;

public class ColocarTitulo implements Interaction {
    private final String tipoDeLetra;


    public ColocarTitulo(String tipoDeLetra) {
        this.tipoDeLetra = tipoDeLetra;

    }


    @Step("Coloca el titulo de la nota")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(INPUT_TITULO_NOTA));
        if (tipoDeLetra.equals("NEGRITA")) {
            actor.attemptsTo(Enter.theValue(Constantes.TITULO_NOTA_EN_NEGRITA.getConstante()).into(INPUT_TITULO_NOTA));
        } else if (tipoDeLetra.equals("ITALIC")) {
            actor.attemptsTo(Enter.theValue(Constantes.TITULO_NOTA_EN_ITALIC.getConstante()).into(INPUT_TITULO_NOTA));
        } else if (tipoDeLetra.equals("UNDERLINE")) {
            actor.attemptsTo(Enter.theValue(Constantes.TITULO_NOTA_EN_UNDERLINE.getConstante()).into(INPUT_TITULO_NOTA));
        } else if (tipoDeLetra.equals("STRIKETHROUGH")) {
            actor.attemptsTo(Enter.theValue(Constantes.TITULO_NOTA_EN_STRIKETHROUGH.getConstante()).into(INPUT_TITULO_NOTA));
        } else {
            actor.attemptsTo(Enter.theValue(Constantes.TITULO_NOTA_SIN_FORMATO.getConstante()).into(INPUT_TITULO_NOTA));
        }
    }

    public static ColocarTitulo conFormato(String tipoDeLetra){
        return Tasks.instrumented(ColocarTitulo.class,tipoDeLetra);
    }
}









