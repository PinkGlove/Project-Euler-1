package p1_p50;

/**
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class p4 {

    public static void main(String[] args) {
        int current, max = 0;
        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                current = i * j;
                if (current >= max && isPalindrome(current)) {
                    max = current;
                }
            }
        }
        System.out.println(max);
    }

    public static boolean isPalindrome(int i) {
        if (i / 10000 >= 10) {
            return (i / 100000 == i % 10) && (i / 10000 % 10 == i / 10 % 10) && (i / 1000 % 10 == i / 100 % 10);
        } else {
            return (i / 10000 == i % 10) && (i / 1000 % 10 == i / 10 % 10);
        }
    }

}
