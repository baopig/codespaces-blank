public class PiApproximator {
    public static double approximatePi() {
        int hit = 0;
        int total = 0;
        for (int i = 0; i<=2000000000; i++) {
            double x = 2 * Math.random() - 1;
            double y = 2 * Math.random() - 1;
            if (Math.sqrt((x*x)+(y*y)) <= 1) {
                hit++;
                total++;
            }
            else {
                total++; 
            }
        }
        return (hit/(double)total) * 4;
    }

    public static void main(String[] args) {
        System.out.println(approximatePi());
    }
}
