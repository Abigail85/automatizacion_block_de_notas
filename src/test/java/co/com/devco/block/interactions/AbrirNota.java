package co.com.devco.block.interactions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;

import static co.com.devco.block.user_interface.TrabajarConNotasGuardadas.A_ABRIR_NOTA_GUARDADA;


public class AbrirNota implements Interaction {



    public AbrirNota(){

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                DoubleClick.on(A_ABRIR_NOTA_GUARDADA));
    }

    public static AbrirNota guardada(){
        return Tasks.instrumented(AbrirNota.class);
    }
}




