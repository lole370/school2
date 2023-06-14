package assoziation;

import java.util.ArrayList;

public class Mitarbeiter {

    private String name;
    private Auto auto;
    private Mitarbeiter vorgesetzter;

    private ArrayList<Werkzeug> werkzeuge = new ArrayList<>();

    private ArrayList<Serviceeinsatz> serviceeinsaetze = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Mitarbeiter getVorgesetzter() {
        return vorgesetzter;
    }

    public void setVorgesetzter(Mitarbeiter vorgesetzter) {
        this.vorgesetzter = vorgesetzter;
    }

    public ArrayList<Werkzeug> getWerkzeuge() {
        return werkzeuge;
    }

    public void addWerkzeug(Werkzeug werkzeug) {
        this.werkzeuge.add(werkzeug);
    }

    public void removeWerkzeug(Werkzeug werkzeug) {
        this.werkzeuge.remove(werkzeug);
    }

    public ArrayList<Serviceeinsatz> getServiceeinsaetze() {
        return serviceeinsaetze;
    }

    public void addServiceeinsatz(Serviceeinsatz serviceeinsatz) {
        serviceeinsatz.setAusfuerenderMitarbeiter(this);
        this.serviceeinsaetze.add(serviceeinsatz);
    }

//    public void removeServiceeinsatz(Serviceeinsatz serviceeinsatz) {
//        //serviceeinsatz.setAusfuerenderMitarbeiter(null); //?
//        this.serviceeinsaetze.remove(serviceeinsatz);
//    }
}
