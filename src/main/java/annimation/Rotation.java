package annimation;

import bandeau.Bandeau;

import java.awt.*;

public class Rotation extends Effet{

    public Rotation (int rep, Bandeau b, String msg, Font font){
        super(rep,b,msg,font);
    }

    @Override
    public void doIt(){
        bandeau.setMessage(message);
        bandeau.setFont(font);
        for (int c = 0; c<repetition; c++) {
            for (int i = 0; i <= 100; i++) {
                bandeau.setRotation(2 * Math.PI * i / 100);
                bandeau.sleep(100);
            }
        }
    }
}
