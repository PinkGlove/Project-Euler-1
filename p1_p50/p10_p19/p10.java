package p1_p50;

import java.util.Arrays;

/**
 * Find the sum of all the primes below two million.
 */
public class p10 {

    public static void main(String[] args) {
        p10 calculate = new p10();
        System.out.println(calculate.naiveSieveOfEratosthenes(2000000));
    }

    public long naiveSieveOfEratosthenes(int num) {
        boolean[] bool = new boolean[num];
        Arrays.fill(bool, true);
        long sum = 0;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (bool[i]) {
                for (int j = i * i; j < num; j += i) {
                    bool[j] = false;
                }
            }
        }
        for (int i = 2; i < bool.length; i++) {
            if (bool[i]) {
                sum += i;
            }
        }
        return sum;
    }

}
