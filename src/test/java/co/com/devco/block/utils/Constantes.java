package co.com.devco.block.utils;

public enum Constantes {
    TITULO("Mi primera nota"),
    TEXTO_1("Buenas tardes, como estas?"),
    TEXTO_2(" Espero se encuentren bien"),
    NOTA_SIN_FORMATO("Nota de texto sin formato"),
    NOTA_CON_FORMATO("Nota de texto enriquecido"),
    LISTA_TAREAS ("Lista de tareas"),

    DEFAULT("N/A");

    private final  String constante;

    Constantes(String constante){
        this.constante =constante;
    }
     public String getConstante(){return constante; }

    public String getCantidadCaracteres() {return String.valueOf(constante.length());
    }
}

