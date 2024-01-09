package co.com.devco.block.utils;

public enum FontFamily {
    DEFAULT(1),
    ARIAL(2),
    COURIER_NEW(3),
    GEORGIA(4),
    LUCIDA_SANS_UNICODE(5),
    TAHOMA(6),
    TIMES_NEW_ROMAN(7),
    TREBUCHET_MS(8),
    VERDANA(9);

    private final  Integer fontFamily;

    FontFamily(Integer fontFamily){
        this.fontFamily = fontFamily;
    }
     public Integer getFontFamily(){return fontFamily; }


}

