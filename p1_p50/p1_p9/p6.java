package p1_p50;

/**
 * Find the difference between the sum of the squares of the first one hundred natural numbers
 * and the square of the sum.
 */
public class p6 {

    public static void main(String[] args) {
        int num1 = 0, num2 = 0, sum = 0;
        for (int i = 1; i <= 100; i++) {
            num1 += i * i;
            sum += i;
        }
        num2 = sum * sum;
        System.out.println(num2 - num1);
    }

}
