package Math;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(new PrimeNumbers().sieve(10000000));
    }

    public ArrayList<Integer> sieve(int a) {

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

        for(int i=0; i<primes.length; i++) {
            if (primes[i] == 1) {
                result.add(i);
            }
        }
        return result;
    }
}
