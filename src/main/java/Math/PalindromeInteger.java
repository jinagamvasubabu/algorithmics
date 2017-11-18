package Math;

import java.util.Objects;

public class PalindromeInteger {
    public static void main(String[] args) {
        System.out.println(new PalindromeInteger().isPalindrome(0));
    }

    public boolean isPalindrome(int a) {
        if (a < 0)
            return false;

        if (a == 0) {
            return true;
        }

        StringBuilder sum = new StringBuilder();
        int b =a;
        while (a > 0) {
            int rem = a%10;
            sum.append(rem);
            a = a/10;
        }


        return sum.toString().equalsIgnoreCase(""+b);
    }
}
