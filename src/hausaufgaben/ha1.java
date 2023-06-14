package hausaufgaben;

public class ha1 {

    public static void main(String[] args) {
        minDistance(new int[] {33,8,1,6,43,54});
    }

    public static void minDistance(int[] numbers) {
        int[] result = new int[] {0, 0, Integer.MAX_VALUE};

        for (int i = 0; i < numbers.length - 1; i++) {
            int distance = Math.abs(numbers[i] - numbers[i+1]);
            if(distance < result[2]) {
                result[2] = distance;
                result[0] = i;
                result[1] = i+1;
            }
        }

        System.out.println("Minimale Distanz: " + result[2]);
        System.out.printf("Indizes der Nachbarn: %d, %d\n", result[0], result[1]);
        System.out.printf("Nachbarn: %d, %d", numbers[result[0]], numbers[result[1]]);
    }

}
