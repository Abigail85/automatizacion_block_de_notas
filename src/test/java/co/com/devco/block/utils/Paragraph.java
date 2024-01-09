package co.com.devco.block.utils;

public enum Paragraph {
    HEADING_1(1),
    HEADING_2(2),
    HEADING_3(3),
    DEFAULT(0);

    private final  Integer paragraph;

    Paragraph(Integer paragraph){
        this.paragraph = paragraph;
    }
     public Integer paragraph(){return paragraph; }


}

