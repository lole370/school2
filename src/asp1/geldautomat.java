package asp1;

public class geldautomat {

    public static void main(String[] args) {
        System.out.println(scheineBerechnen(5782565));
    }

    public static String scheineBerechnen(int amount) {
        if(amount <= 0 || amount%5 != 0) {
            return "Nicht möglich";
        }
        String result = "";
        int[] scheine = {500,200,100,50,20,10,5};

        for(int schein : scheine) {
            int count = amount / schein;
            if(count != 0) {
                amount = amount - count*schein;
                result = result + count+"*"+schein+" ";
            }
        }

        return result;
    }
}


