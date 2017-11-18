import java.util.Arrays;
import java.util.List;

public class FindDuplicate {
    public static void main(String[] args) {
        System.out.println(repeatedNumber(Arrays.asList(1, 3, 2, 4)));
    }

    public static int repeatedNumber(final List<Integer> a) {

        boolean arr[] = new boolean[a.size()];

        for (int i = 0; i < a.size(); i++) {
            int temp = a.get(i)-1;
            if (arr[temp]) {
                return temp+1;
            } else {
                arr[temp] = true;
            }
        }

        return -1;

    }
}
