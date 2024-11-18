public class ExponentialFunction {
    public static double eToThe(double x, double EPSILON) {
        double sum = 1 + x;
        double xCopy = x;
        for (int n = 2; x > EPSILON; n++) {
            x = x * (xCopy/n);
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(eToThe(1,0.000001));
        System.out.println(eToThe(2,0.000001));
    }
}
