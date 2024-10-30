import java.util.ArrayList;

public class PrimeNumber {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> primeNumber(int N) throws Exception {
        if (N <= 1) {
            throw new RuntimeException("Favor digitar número maior que 1");
        }

        ArrayList<Integer> primeNumberList = new ArrayList<Integer>();
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                primeNumberList.add(i);
            }
        }
        return primeNumberList;
    }

    public static ArrayList<Integer> recPrimeNumber(int N) throws Exception {
        if (N <= 1) {
            throw new RuntimeException("Favor digitar número maior que 1");
        }

        ArrayList<Integer> primeNumberList = new ArrayList<Integer>();
        if (N == 2) {
            primeNumberList.add(N);
            return primeNumberList;
        }

        if (isPrime(N)) {
            primeNumberList = recPrimeNumber(N-1);
            primeNumberList.add(N);
            return primeNumberList;
        } else {
            return recPrimeNumber(N - 1);
        }
    }
}
