package searchery;

public abstract class Behandlung {

    private String kvNummer;
    private String beschreibung;
    private double kostensatz;

    public Behandlung(String kvNummer, String beschreibung, double kostensatz) {
        this.kvNummer = kvNummer;
        this.beschreibung = beschreibung;
        this.kostensatz = kostensatz;
    }

    public Behandlung() {

    }

    public abstract double getKosten();

    public String getKvNummer() {
        return kvNummer;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public double getKostensatz() {
        return kostensatz;
    }
}
