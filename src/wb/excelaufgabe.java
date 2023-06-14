package wb;

import static java.lang.Math.abs;

public class excelaufgabe {

    public static void main(String[] args) {
        System.out.println(decrypt(encrypt("CHECKER", "HSSHSSH"), "HSSHSSH"));
    }

    public static String encrypt(String textString, String keyString) {
        char[] text = textString.toCharArray();
        char[] key = keyString.toCharArray();

        String result = "";

        for(int i = 0; i < text.length; i++)
            result += (char) (((text[i] + key[i]) % 26) + 65);

        return result;
    }

    public static String decrypt(String codeString, String keyString) {
        char[] code = codeString.toCharArray();
        char[] key = keyString.toCharArray();

        String text = "";

        for(int i = 0; i < code.length; i++) {
            int absDiff = abs(code[i] - key[i]);
            int textChar = 0;
            if(key[i] > code[i]) {
                textChar = 90 - absDiff + 1;
            } else {
                textChar = 65 + absDiff;
            }
            text += (char) textChar;
        }

        return text;
    }

}
