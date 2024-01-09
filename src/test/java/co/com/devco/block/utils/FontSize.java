package co.com.devco.block.utils;

public enum FontSize {
    TINY("Tiny"),
    SMALL("Small"),
    BIG("Big"),
    HUGE("Huge"),
    DEFAULT("Default");


    private final  String fontSize;

    FontSize(String fontSize){
        this.fontSize =fontSize;
    }
     public String getFontSize(){return fontSize; }

}

