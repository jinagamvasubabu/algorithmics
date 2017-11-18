package Math;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeSum {
    public static void main(String[] args) {
        System.out.println(new PrimeSum().primesum(10));
    }

    public ArrayList<Integer> primesum(int a) {
        ArrayList<Integer> primes = sieve(a);
        ArrayList<Integer> result = new ArrayList<>();

        //generate list of all primes
        for (int i = 2; i <= a; i++) {
            if (primes.contains(i)) {
                if (primes.contains(a - i)) {
                    result.add(i);
                    result.add(a - i);
                    return result;
                }
            }
        }
        return result;
    }


    private ArrayList<Integer> sieve(int a) {

        ArrayList<Integer> result = new ArrayList<>();
        int primes[] = new int[a + 1];

        Arrays.fill(primes, 1);
        primes[0] = 0;
        primes[1] = 0;

        for (int i = 2; i <= Math.sqrt(a); i++) {
            for (int j = 2; i * j <= a; j++) {
                primes[i * j] = 0;
            }
        }

        for (int i = 0; i < primes.length; i++) {
            if (primes[i] == 1) {
                result.add(i);
            }
        }
        return result;
    }


}
