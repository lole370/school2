package assoziation;

import org.jetbrains.annotations.NotNull;

public class Notebook {

    private int sNr;

    private Tasche tasche;

    public Notebook(@NotNull Tasche tasche) {
        this.tasche = tasche;
    }

    public int getsNr() {
        return sNr;
    }

    public Tasche getTasche() {
        return tasche;
    }

    public void setsNr(int sNr) {
        this.sNr = sNr;
    }

    public void setTasche(@NotNull Tasche tasche) {
        this.tasche = tasche;
    }
}
