package p1_p50;

import static java.lang.Math.floor;
import static java.lang.Math.sqrt;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
public class p7 {

    public static void main(String[] args) {
        int number = 1, count = 0;
        while (true) {
            if (isPrime(number)) {
                count++;
            }
            if (count == 10001) {
                System.out.println(number);
                break;
            }
            number++;
        }
    }

    public static boolean isPrime(int num) {
/*       int i;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                break;
            }
        }
        return i == num;*/
        if (num == 1) {
            return false;
        } else if (num < 4) {
            return true;
        } else if (num % 2 == 0) {
            return false;
        } else if (num < 9) {
            return true;
        } else if (num % 3 == 0) {
            return false;
        } else {
            double floor = floor(sqrt(num));
            long compare = 5;
            while (compare <= floor) {
                if (num % compare == 0) {
                    return false;
                }
                if (num % (compare + 2) == 0) {
                    return false;
                }
                compare += 6;
            }
            return true;
        }
    }
}
