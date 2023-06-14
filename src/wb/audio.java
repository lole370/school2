package wb;

import java.util.Arrays;

public class audio {

    public static void main(String[] args) {
        int[] signal= {1,5,4,5,7,6,8,6,5,4,5,4};
        int[] geglaettet = new int[signal.length];

        geglaettet[0] = (signal[0] + signal[1]) / 2;
        geglaettet[geglaettet.length-1] = (signal[geglaettet.length-1] + signal[geglaettet.length-2]) / 2;
        for(int i = 1; i < signal.length-1; i++)
            geglaettet[i] = (signal[i-1] +signal[i] + signal[i+1]) / 3;

        System.out.println("Signal:\t\t" + Arrays.toString(signal));
        System.out.println("Geglättet:\t" + Arrays.toString(geglaettet));


    }

}
