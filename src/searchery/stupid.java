package searchery;

public class stupid {

    public static void main(String[] args) {
        Praxis p = new Praxis();
        p.addBehandlung(new Physiobehandlung("A12345", "Chirogymnastik", 12.87));
        p.addBehandlung(new Physiobehandlung("A12345", "Wärmeanwendung", 4.23));
        p.addBehandlung(new Standardbehandlung("A12345", "Arthrose", 45.12));
        p.addBehandlung(new Standardbehandlung("A12345", "Ultraschall", 26.80));

        System.out.println(p.ermittleKosten());
    }

}
