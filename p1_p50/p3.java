package p1_p50;

/**
 * What is the largest prime factor of the number 600851475143 ?
 */
public class p3 {

    public static void main(String[] args) {
        long num = 600851475143L;
        for (int i = 2; i < num; i++){
            if (num % i == 0) {
                System.out.println(i);
                num = num / i;
            }
        }
        System.out.println(num);
    }

}
