public class Sumofdigitsprime {
    static int digitPrime(int d) {
        // code here
        if (d % 9 == 0)
            return 0;
        if (isPrime(d % 9) == 0)
            return 0;
        return 1;
    }

    static int isPrime(int n) {

        if (n == 1 || n == 2)
            return n - 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        int d = 2012;
        System.out.println(digitPrime(d));
    }
}
