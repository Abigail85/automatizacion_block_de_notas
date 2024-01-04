package co.com.devco.block.exceptions;


public class LosMensajesNoSonLosMismosExceptions extends AssertionError{
    public static final String LOS_MENSAJES_NO_SON_LOS_MISMOS =
            "la nota se creo de manera exitosa";
    public LosMensajesNoSonLosMismosExceptions(String titulo, Throwable cause) { super(titulo, cause);}

}
