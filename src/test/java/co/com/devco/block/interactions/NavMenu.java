package co.com.devco.block.interactions;

import co.com.devco.block.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.block.user_interface.CrearNotasConFormato.BUTTON_TIPO_DE_LETRA;



public class NavMenu implements Interaction {
    private final String tipoDeLetra;

    public NavMenu(String tipoDeLetra) {
        this.tipoDeLetra = tipoDeLetra;

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (tipoDeLetra) {
            case "NEGRITA":
                actor.attemptsTo(Click.on(BUTTON_TIPO_DE_LETRA.of(Constantes.NEGRITA.getConstante())));
                break;
            case "ITALIC":
                actor.attemptsTo(Click.on(BUTTON_TIPO_DE_LETRA.of(Constantes.ITALIC.getConstante())));
                break;
            case "UNDERLINE":
                actor.attemptsTo(Click.on(BUTTON_TIPO_DE_LETRA.of(Constantes.UNDERLINE.getConstante())));
                break;
            case "STRIKETHROUGH":
                actor.attemptsTo(Click.on(BUTTON_TIPO_DE_LETRA.of(Constantes.STRIKETHROUGH.getConstante())));
                break;
            default:
                System.out.println("La nota no fue encontrada");
                break;
        }

    }

    public static NavMenu seleccionado(String tipoDeLetra){
        return Tasks.instrumented(NavMenu.class,tipoDeLetra);
    }
}
