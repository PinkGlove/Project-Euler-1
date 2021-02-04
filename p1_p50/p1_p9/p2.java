package p1_p50;

/**
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.
 */
public class p2 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 1000000; i++) {
            int num = fibNum(i);
            if (num <= 4000000) {
                if (num % 2 == 0) {
                    sum += num;
                }
            } else {
                break;
            }
        }
        System.out.println(sum);
    }

    public static int fibNum(int i) {
        int[] numbers = new int[i];
        if (i <= 2) {
            return i;
        } else {
            numbers[0] = 1;
            numbers[1] = 2;
            for (int j = 2; j < i; j++){
                numbers[j] = numbers[j-1] + numbers[j-2];
            }
        }
        return numbers[i-1];
    }

}
