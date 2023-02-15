/**
 * tribonacci
 */
public class tribonacci {


    public double[] tribonacci(double[] s, int n) {
        if (n < 1) {
            return new double[0];
        }
        double[] result = new double[n];
        result[0] = s[0];
        result[1] = s[1];
        result[2] = s[2];

        for (int i = 0; i < n - 3; i++) {
            result[i+3] = result[i] + result[i+1] + result[i+2]; 
        }
        return result;
    }
}