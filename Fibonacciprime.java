public class Fibonacciprime {
    static int fibonacciPrime(String N) {
        String arr[] = { "2", "3", "5", "13", "89", "233", "1597", "28657", "514229", "433494437", "2971215073",
                "99194853094755497", "1066340417491710595814572169", "19134702400093278081449423917",
                "475420437734698220747368027166749382927701417016557193662268716376935476241" };
        for (int i = 0; i < arr.length; i++)
            if (N.compareTo(arr[i]) == 0)
                return 1;

        return 0;
    }

    public static void main(String[] args) {
        String N = "5";
        System.out.println(fibonacciPrime(N));
    }
}
