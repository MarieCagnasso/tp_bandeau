package annimation;

import bandeau.Bandeau;

import java.awt.*;

public class TapingText extends Effet{

    public TapingText(int rep, Bandeau b, String msg, Font font){
        super(rep,b,msg,font);
    }

    @Override
    public void doIt() {
        bandeau.setMessage("");

        for (int i = 0; i<message.length();i++){
            bandeau.setMessage(bandeau.getMessage()+message.charAt(i));
            bandeau.sleep(250);
        }

    }
}
