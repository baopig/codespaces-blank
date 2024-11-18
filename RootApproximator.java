public class RootApproximator {
    public static double approximateRoot(double a, double MAXEPSILON) {
        double x = 1;
        while (Math.abs((a/x)-x) > MAXEPSILON) {
            x = Math.abs((x+(a/x))/2);
            System.out.println(x);
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(approximateRoot(115, 0.0001));
    }
}
