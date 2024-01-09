package co.com.devco.block.utils;

public enum NavBar {
    TITULO("Mi primera nota"),
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

    private final  String menu;

    NavBar(String menu){
        this.menu = menu;
    }
     public String getMenu(){return menu; }

}

