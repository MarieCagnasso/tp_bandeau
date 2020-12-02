package annimation;

import bandeau.Bandeau;

import java.awt.*;

public class Main {

    public static void main(String[] args){
        Bandeau bandeau = new Bandeau();
        Scenario scenario = new Scenario(bandeau);

        scenario.AjouterEffet(new TapingText(1,bandeau,"Voici ma super annimation !",new Font("Calligrapher", Font.BOLD, 25)));
        scenario.AjouterEffet(new Zoom(2,bandeau,"Le zoom c'est génial !",new Font("Calligrapher", Font.BOLD, 10)));
        scenario.AjouterEffet(new Clignotant(10,bandeau,"Stroboscope",new Font("Monospaced", Font.BOLD, 10)));
        scenario.AjouterEffet(new Rotation(1,bandeau,"ça touuuuuuurne.",new Font("Calligrapher", Font.BOLD, 10)));

        scenario.playScenario();

    }
}
