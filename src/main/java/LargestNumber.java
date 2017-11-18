import java.util.*;

public class LargestNumber implements Comparator<String> {

    public static void main(String[] args) {
        System.out.println(new LargestNumber().largestNumber(Arrays.asList(3, 30, 34, 5, 9, 40)));
    }

    public String largestNumber(final List<Integer> A) {
        List<String> B = new ArrayList<String>();
        for (Integer number : A) {
            String x = number.toString();
            B.add(x);
        }
        B.sort(this);
        StringBuilder ans = new StringBuilder();
        int sum = 0;
        for (int i = B.size() - 1; i >= 0; i--) {
            ans.append(B.get(i));
            sum += Integer.parseInt(B.get(i));
        }
        return sum == 0 ? "0" : ans.toString();
    }

    @Override
    public int compare(String a, String b) {
        String fe = a + b;
        String se = b + a;
        return (fe.compareTo(se));
    }
}
