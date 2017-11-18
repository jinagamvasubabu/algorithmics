package Math;

public class GCD {
    public static void main(String[] args) {
        System.out.println(new GCD().gcd(4, 6));
    }

    public int gcd(int a, int b) {
        int dividend = (a > b) ? a : b;
        int divisor = (a < b) ? a : b;
        int remainder = divisor;

        while (remainder > 0) {
            remainder = (dividend) % divisor;
            dividend = divisor;
            divisor = remainder;
        }

        return dividend;
    }
}
