package annimation;

import bandeau.Bandeau;

import java.awt.*;

public class Zoom extends Effet{

    public Zoom (int rep, Bandeau b, String msg,Font font){
        super(rep,b,msg,font);
    }

    @Override
    public void doIt(){
        bandeau.setMessage(message);
        for (int c = 0; c<repetition; c++){
            bandeau.setFont(font);
            for (int i = 5; i < 60 ; i+=5) {
                bandeau.setFont(new Font(font.getName(),font.getStyle(),font.getSize()+i));
                bandeau.sleep(100);
            }

        }
    }
}
