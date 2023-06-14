package searchery;

public class Physiobehandlung extends Behandlung{

    public Physiobehandlung(String kvNummer, String beschreibung, double kostensatz) {
        super(kvNummer, beschreibung, kostensatz);
    }

    public Physiobehandlung() {
    }

    @Override
    public double getKosten() {
        return getKostensatz() * 1.5;
    }
}
