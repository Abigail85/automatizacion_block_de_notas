package co.com.devco.block.exceptions;


import co.com.devco.block.utils.Constantes;

public class LosMensajesNoSonLosMismosExceptions extends AssertionError{
    public static final String LOS_MENSAJES_NO_SON_LOS_MISMOS =
            "La nota no es la misma";
    public LosMensajesNoSonLosMismosExceptions(Constantes constantes, Throwable cause) { super(constantes.getConstante(), cause);}

}
