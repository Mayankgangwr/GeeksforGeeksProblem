import java.util.Scanner;

public class Killingspree {

    /*
     * GeeksforGeeks Problem
     * There are Infinite People Standing in a row, indexed from 1.
     * A person having index 'i' has strength of (i*i).
     * You have Strength 'P'. You need to tell what is the maximum number of People
     * You can Kill With your Strength P.
     * You can only Kill a person with strength 'X' if P >= 'X' and after killing
     * him, Your Strength decreases by 'X'.
     */
    static long killinSpree(long n) {
        long c = 0;
        long sum = 0;
        long i = 1;
        while (i >= 1) {
            sum = sum + (i * i);
            if (sum <= n) {
                i++;
                c++;
            } else {
                return c;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(killinSpree(n));
    }

}
