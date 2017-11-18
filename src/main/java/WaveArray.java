import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WaveArray {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,2,1,4));
        System.out.println(new WaveArray().wave(input));
    }

    public ArrayList<Integer> wave(ArrayList<Integer> a) {
        Collections.sort(a);

        for(int i=0; i<a.size()-1; i+=2) {
            swap(a, i, i+1);
        }

        return a;
    }

    private  void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
