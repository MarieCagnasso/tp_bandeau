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

    public abstract void doIt();
}
