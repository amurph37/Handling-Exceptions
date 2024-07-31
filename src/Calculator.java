public class Calculator {

    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Parameter must be a non-negative number.");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public long binomialCoefficient(int n, int k) {
        if (n < 0 || k < 0 || k > n) {
            throw new IllegalArgumentException("Parameters must be non-negative, and subset size cannot exceed set size.");
        }
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    // Helper method to calculate factorial
    private long factorialHelper(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
