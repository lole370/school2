package hausaufgaben;

public class ha2 {
    public static void main(String[] args) {
        int[][] c = {
                {3, 7},
                {30, 80},
                {80, 320},
                {15, 276},
                {84, 298},
                {19, 29},
                {200, 200},
                {191, 919}
        };
        int[] distance = minDistance(c);
        System.out.printf("%d, %d", distance[0], distance[1]);
    }

    public static int[] minDistance(int[][] points) {
        double minDistance = Double.MAX_VALUE;
        int[] pos = new int[2];
        for(int i = 0; i < points.length - 1; i++) {
            for(int j = i+1; j < points.length; j++) {
                double distance = getDistance(points[i], points[j]);
                if( distance < minDistance) {
                    minDistance = distance;
                    pos[0] = i;
                    pos[1] = j;
                }
            }
        }
        return pos;
    }

    public static double getDistance(int[] a, int[] b) {
        return Math.sqrt(Math.pow(a[0] - b[0], 2) + Math.pow(a[1] - b[1], 2));
    }
}
