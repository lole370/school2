package searchery;

import java.util.ArrayList;

public class Praxis {

    private ArrayList<Patient> patienten = new ArrayList<>();
    private ArrayList<Behandlung> behandlungen = new ArrayList<>();

    public ArrayList<Patient> getPatient(String name) {
        ArrayList<Patient> result = new ArrayList<>();
        for(Patient p : this.patienten) {
            if(p.getName().equals(name))
                result.add(p);
        }
        return result;
    }

    public ArrayList<Behandlung> getBehandlungen(String kvNummer) {
        ArrayList<Behandlung> result = new ArrayList<>();
        for(Behandlung b : this.behandlungen) {
            if(b.getKvNummer().equals(kvNummer))
                result.add(b);
        }
        return result;
    }

    public int anzahlBehandlungen(String kvNummer) {
        return getBehandlungen(kvNummer).size();
    }

    public String zeigePatienten(int anzBehandlungen) {
        String result = "";
        for(Patient p : this.patienten) {
            if(anzahlBehandlungen(p.getKvNummer()) > anzBehandlungen)
                result += p.getName() + "; ";
        }
        return result.substring(0, result.length()-2);
    }

    public void addBehandlung(Behandlung b) {
        this.behandlungen.add(b);
    }

    public double ermittleKosten() { //For a good time, call: 06227 765295 <3 :*
        double kosten = 0;
        for(Behandlung b : this.behandlungen) {
            kosten += b.getKosten();
        }
        return kosten;
    }
}

