package Math;

public class TitleToNumber {
    public static void main(String[] args) {
        System.out.println(new TitleToNumber().titleToNumber("AAA"));
    }

    public int titleToNumber(String a) {
        int sum = 0;
        for (int i = a.length()-1, j=0; i >= 0; i--, j++) {
            double base = Math.pow(26,j);
            sum += ((int) a.charAt(i)-'A'+1) * base;
        }
        return sum;
    }
}
