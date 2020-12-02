package annimation;

import bandeau.Bandeau;

import java.util.ArrayList;

public class Scenario {

    private Bandeau bandeau;
    private ArrayList<Effet> effets;

    public Scenario(Bandeau bandeau){
        this.bandeau = bandeau;
        this.effets = new ArrayList();
    }

    public void AjouterEffet(Effet e){
        effets.add(e);
    }

    public void playScenario(){
        for (Effet effet : effets){
            effet.doIt();
            bandeau.sleep(1000);
        }
    }
}
