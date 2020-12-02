package annimation;

import bandeau.Bandeau;

import java.awt.*;

public class Clignotant extends Effet{

    public Clignotant (int rep, Bandeau b, String msg, Font font){
        super(rep,b,msg,font);
    }

    public void doIt(){
        Color couleur = bandeau.getForeground();
        Color couleurBg  = bandeau.getBackground();
        bandeau.setMessage(message);
        bandeau.setFont(font);


        for (int i = 0; i < repetition ; i++) {
            bandeau.sleep(100);
            bandeau.setForeground(couleurBg);
            bandeau.sleep(100);
            bandeau.setForeground(couleur);
        }
    }
}
