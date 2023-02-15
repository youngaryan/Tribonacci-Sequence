/**
 * tribonacci
 */
public class tribonacci {


    public double[] tribonacci(double[] s, int n) {
        double[] signature = new double[]{s[0], s[1], s[2]};
        if (n < 3) {
            double[] result = new double[n];
            System.arraycopy(signature, 0, result, 0, n);
            return result;
        }
        double[] result = new double[n];
        System.arraycopy(signature, 0, result, 0, 3);
        for (int i = 3; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2] + result[i - 3];
        }
        return result;
    }
}