import java.util.ArrayList;
import java.util.Collections;

public class VerifyPrime {
    public static void main(String[] args) {
        System.out.println(new VerifyPrime().isPrimeBuggy(7));
    }

    public int isPrime(int a) {

        if (a == 1)
            return 0;
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return 0;
            }
        }

        return 1;


    }

    public int isPrimeBuggy(int A) {
        if (A == 1)
            return 0;
        int upperLimit = (int) (Math.sqrt(A));
        for (int i = 2; i <= upperLimit; i++) {
            if (i < A && A % i == 0) return 0;
        }
        return 1;
    }

}
