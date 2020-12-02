package annimation;

import bandeau.Bandeau;

import java.awt.*;

public class Main {

    public static void main(String[] args){
        Bandeau bandeau = new Bandeau();
        Scenario scenario = new Scenario(bandeau);

        scenario.AjouterEffet(new Zoom(1,bandeau,"Le zoom c'est génial !",new Font("Calligrapher", Font.BOLD, 10)));
        scenario.AjouterEffet(new Clignotant(100,bandeau,"Stroboscope",new Font("Monospaced", Font.BOLD, 10)));
        scenario.AjouterEffet(new Rotation(2,bandeau,"ça touuuuuuurne.",new Font("Calligrapher", Font.BOLD, 10)));

        scenario.playScenario();

    }
}
