package assoziation;

import java.util.ArrayList;

public class Kunde {
    private ArrayList<Maschine> gekaufteMaschinen = new ArrayList<>();

    public Kunde(Maschine gekaufteMaschine) {
        this.gekaufteMaschinen.add(gekaufteMaschine);
    }

    public ArrayList<Maschine> getGekaufteMaschinen() {
        return gekaufteMaschinen;
    }

    public void addGekaufteMaschine(Maschine maschine) {
        this.gekaufteMaschinen.add(maschine);
    }

    public void removeGekaufteMaschine(Maschine maschine) {
        this.gekaufteMaschinen.remove(maschine);
    }
}
