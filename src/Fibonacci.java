public class Fibonacci {

    public static int fibonacci(int N) throws Exception {
        int numberA = 0;
        int numberB = 1;

        if (N < 0) {
            throw new RuntimeException("Favor digitar valor maior que zero");
        } else if (N == 0) {
            return 0;
        } else {
            for (int i = 1; i < N; i++) {
                int fibo = numberA + numberB;
                numberA = numberB;
                numberB = fibo;
            }
            return numberB;
        }
    }

    public static int recFibonacci(int N) {
        if (N < 0) {
            throw new RuntimeException("Favor digitar valor maior que zero");
        } else if (N <= 1) {
            return N;
        }
        return recFibonacci(N - 1) + recFibonacci(N - 2);
    }
}
