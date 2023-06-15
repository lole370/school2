package wb;

import java.util.Arrays;

public class Pascal {

    public static void main(String[] args) {
        pascal(5);
    }

    public static void pascal(int size) {
        int[][] p = new int[size][];
        p[0] = new int[]{1};
        p[1] = new int[]{1,1};

        for(int i = 2; i <size; i++) {
            int[] line = new int[i+1];
            line[0] = 1;
            line[line.length-1] = 1;

            for(int j = 1; j < line.length-1;j++) {
                line[j] = p[i-1][j-1] + p[i-1][j];
            }

            p[i] = line;
        }

        for(int[] l : p)
            printCenteredLine(l, 6, 0);

    }

    public static void printCenteredLine(int[] arr, int size, int extra) {
        String line = "";
        for (int j = 0; j < (size - arr.length); j++) {
            line += " ";
        }
        for (int j = 0; j < arr.length; j++) {
            line += arr[j] + " ";
        }
        System.out.println(line);
    }

}
