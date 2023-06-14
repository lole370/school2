package wb;

public class aspaufgabe {

    public static void main(String[] args) {
        String[] t1 = {"Mueller|Josef|FR_1112|Freiburg"};
        String[] t2 = {"Maier|Fritz|ST_1114|Vaihingen"};
        String[] t3 = {"Heinzel|Maria|ST_5525|Bad Cannstatt"};
        String[] t4 = {"Herrman|Georg|FR_2536|Merzhausen"};
        String[] t5 = {"Schneider|Wolfgang|Heidelberg|HE_20011"};
        String[] t6 = {"Bartels|Martina|Sandhausen|HE_15436"};
        String[] t7 = {"Beck|Hans|Neckarsteinach|HE_5436"};
        System.out.println(personalNumberFirst(t1, 2)[0]);
        System.out.println(personalNumberFirst(t2, 2)[0]);
        System.out.println(personalNumberFirst(t3, 2)[0]);
        System.out.println(personalNumberFirst(t4, 2)[0]);
        System.out.println(personalNumberFirst(t5, 3)[0]);
        System.out.println(personalNumberFirst(t6, 3)[0]);
        System.out.println(personalNumberFirst(t7, 3)[0]);
    }


    public static String[] personalNumberFirst(String[] aPersonaldatenSatz, int iPosTrenner) {
        String[] daten = aPersonaldatenSatz[0].split("\\|");
        String newDaten = daten[iPosTrenner]+"|";

        for(int i = 0; i < daten.length; i++) {
            if(i != iPosTrenner)
                newDaten = newDaten + daten[i] + "|";
        }

        return new String[]{newDaten.substring(0,newDaten.length()-1)};

    }

}
