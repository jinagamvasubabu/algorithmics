import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddOneToNumber {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(0, 1, 9, 9);
        System.out.println(plusOne(input, input.size() - 1));
        System.out.println(plusOne(input));
    }


    public static List<Integer> plusOne(List<Integer> a, int index) {
        int sum = a.get(index) + 1;
        if (sum / 10 > 0) {
            int rem = sum % 10;
            a.set(index, rem);
            plusOne(a, index - 1);
        } else {
            a.set(index, sum);
        }
        return a;
    }


    public static List<Integer> plusOne(List<Integer> A) {
        int carry = 1;
        List<Integer> result = new ArrayList<>();
        for (int i = A.size()-1; i >= 0; i--) {
            int val = A.get(i) + carry;
            result.set(i, val % 10);
            carry = val / 10;
        }
        if (carry == 1) {
            result.set(0, 1);
        }

        if (result.get(0)==0) {
            result.remove(0);
        }
        return result;
    }
}
