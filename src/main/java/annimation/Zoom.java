package annimation;

import bandeau.Bandeau;

import java.awt.*;

public class Zoom extends Effet{

    public Zoom (int rep, Bandeau b, String msg,Font font){
        super(rep,b,msg,font);
    }

    public void doIt(){
        bandeau.setMessage(message);
        bandeau.setFont(font);
        Font fontinit = font;
        for (int c = 0; c<repetition; c++){
            for (int i = 5; i < 60 ; i+=5) {
                modifySizeFont(i);
                bandeau.setFont(font);
                bandeau.sleep(100);
            }

        }
    }
}
