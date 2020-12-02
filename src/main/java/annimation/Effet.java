package annimation;

import bandeau.Bandeau;

import java.awt.*;

public abstract class Effet {

    protected int repetition;
    protected Bandeau bandeau;
    protected String message;
    protected Font font;

    public Effet(int r,Bandeau bandeau, String message, Font f){
        this.repetition = r;
        this.bandeau = bandeau;
        this.message = message;
        this.font = f;
    }

    public void modifySizeFont(int i){
        this.font = new Font(font.getName(),font.getStyle(),font.getSize()+i);
    }

    public abstract void doIt();
}
