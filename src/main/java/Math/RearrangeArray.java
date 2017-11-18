package Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.asList;

public class RearrangeArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>() {{
           add(4);
           add(0);
           add(2);
           add(1);
           add(3);
        }};
        new RearrangeArray().arrange(list);
    }

    public void arrange(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++)
            a.set(i, a.get(i)+(a.get(a.get(i))%a.size())*a.size());

        for (int i = 0; i < a.size(); i++)
            a.set(i, (a.get(i)/a.size()));

    }
}
