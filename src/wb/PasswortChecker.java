package wb;

public class PasswortChecker {

    public static void main(String[] args) {
        System.out.println(checkPassword("1Passw0rt$".toCharArray()));
        System.out.println(generatePW("Wenn es regnet, dann wird es nass ."));
    }

    public static boolean checkPassword(char[] pw) {
        if(pw.length < 8)
            return false;
        int letterCount = 0;
        int numberCount = 0;
        int upperCount = 0;
        int lowerCount = 0;
        int specialCount = 0;

        for(char c : pw) {
            if(Character.isAlphabetic(c))
                letterCount++;
            if(Character.isDigit(c))
                numberCount++;
            if(Character.isUpperCase(c)) {
                upperCount++;
            } else {
                lowerCount++;
            }
            if(!Character.isLetterOrDigit(c))
                specialCount++;
        }

        if(specialCount == 1) {
            if(!Character.isLetterOrDigit(pw[0]) || !Character.isLetterOrDigit(pw[pw.length-1]))
                return false;
        }

        if(specialCount == 2) {
            if(!Character.isLetterOrDigit(pw[0]) && !Character.isLetterOrDigit(pw[pw.length-1]))
                return false;
        }

        return (letterCount >= 2) && (numberCount >= 2) && (upperCount >= 1) && (lowerCount >= 1) && (specialCount >= 1);


    }

    public static String generatePW(String sentence) {
        String [] s = sentence.split(" ");
        String pw = "";
        boolean upper = true;
        for(String w : s) {
            char newChar = w.charAt(w.length()-1);
            if(upper && Character.isAlphabetic(newChar)) {
                newChar = Character.toUpperCase(newChar);
                upper = false;
            } else if (!upper && Character.isAlphabetic(newChar)) {
                newChar = Character.toLowerCase(newChar);
                upper = true;
            }
            pw = pw + newChar;
        }
        return pw;
    }

}
