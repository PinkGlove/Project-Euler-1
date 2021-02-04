package p1_p50;

/**
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class p9 {

    public static void main(String[] args) {
        int b = 2;
        do {
            for (int a = 1; a < b; a++) {
                int c = 1000 - b - a;
                if (a * a + b * b == c * c) {
                    System.out.println("a: " + a);
                    System.out.println("b: " + b);
                    System.out.println("c: " + c);
                    System.out.println("product: " + a * b * c);
                    break;
                }
            }
            b++;
        } while (b < 1000);
    }

}
