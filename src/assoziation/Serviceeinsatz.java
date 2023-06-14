package assoziation;

import org.jetbrains.annotations.NotNull;

public class Serviceeinsatz {

    private Mitarbeiter ausfuerenderMitarbeiter;
    private Kunde kunde;

    public Serviceeinsatz(@NotNull Mitarbeiter ausfuerenderMitarbeiter, @NotNull Kunde kunde) {
        this.ausfuerenderMitarbeiter = ausfuerenderMitarbeiter;
        this.kunde = kunde;
    }

    public Mitarbeiter getAusfuerenderMitarbeiter() {
        return ausfuerenderMitarbeiter;
    }

    public void setAusfuerenderMitarbeiter(@NotNull Mitarbeiter ausfuerenderMitarbeiter) {
        this.ausfuerenderMitarbeiter = ausfuerenderMitarbeiter;
        ausfuerenderMitarbeiter.addServiceeinsatz(this);
    }
}
