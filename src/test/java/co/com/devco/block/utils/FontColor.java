package co.com.devco.block.utils;

public enum FontColor {
    REMOVE_COLOR(1),
    BLACK(2),
    DIM_GREY(3),
    GREY(4),
    LIGHT_GREY(5),
    WHITE(6),
    RED(7),
    ORANGE(8),
    YELLOW(9),
    LIGHT_GREEN(10),
    GREEN(11),
    AQUAMARINE(12),
    TURQUOISE(13),
    LIGHT_BLUE(14),
    BLUE(15),
    PURPLE(16);

    private final  Integer fontColor;

    FontColor(Integer fontColor){
        this.fontColor =fontColor;
    }
     public Integer getFontColor(){return fontColor; }


}

