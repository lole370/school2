package wbasp;

public class aufgabe {

    public static void main(String[] args) {
        System.out.println(pruefeKontrollnummer("SE713313185"));
    }

    public static boolean pruefeKontrollnummer(String code) {
        String result = "";
        result += positionImAlphabet(code.charAt(0));
        result += positionImAlphabet(code.charAt(1));
        result += code.substring(2);

        int checksum = 7 - (querSumme(result) % 9);
        return (code.charAt(code.length()-1) - '1') + 1 == checksum;
    }

    public static int positionImAlphabet(char c) {
        return ((int) c - 'A') + 1;
    }

    public static int querSumme(String s) {
        int result = 0;
        for(int i = 0; i < s.length(); i++) {
            result += (s.charAt(i) - '1') + 1;
        }
        return result;
    }

}
