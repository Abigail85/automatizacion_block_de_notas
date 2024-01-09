package co.com.devco.block.utils;

public enum Constantes {
    TITULO_NOTA_SIN_FORMATO("Mi nota Sin formato"),
    TITULO_NOTA_EN_NEGRITA("Mi nota en negrita"),
    TITULO_NOTA_EN_ITALIC("Mi nota en italica"),
    TITULO_NOTA_EN_UNDERLINE("Mi nota subrayada"),
    TITULO_NOTA_EN_STRIKETHROUGH("Mi nota tachada"),
    TEXTO_1("Buenas tardes, como estas?"),
    TEXTO_2(" Espero se encuentren bien"),
    NOTA_SIN_FORMATO("Nota de texto sin formato"),
    NOTA_CON_FORMATO("Nota de texto enriquecido"),
    LISTA_TAREAS ("Lista de tareas"),
    NEGRITA("Bold (Ctrl+B)"),
    ITALIC("Italic (Ctrl+I)"),
    UNDERLINE("Underline (Ctrl+U)"),
    STRIKETHROUGH("Strikethrough (Ctrl+Shift+X)"),
    DEFAULT("N/A");

    private final  String constante;

    Constantes(String constante){
        this.constante =constante;
    }
     public String getConstante(){return constante; }

    public String getCantidadCaracteres() {return String.valueOf(constante.length());
    }
}

