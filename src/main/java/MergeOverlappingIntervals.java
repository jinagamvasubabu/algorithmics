import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {

        ArrayList<Interval> intervals = new ArrayList<>();

        intervals.add(new Interval(1, 10));
        intervals.add(new Interval(2, 9));
        intervals.add(new Interval(8, 9));
        ArrayList<Interval> result = new MergeOverlappingIntervals().merge(intervals);
        System.out.println(Arrays.toString(result.toArray()));
    }

    private ArrayList<Interval> merge(ArrayList<Interval> intervals) {

        ArrayList<Interval> result = new ArrayList<Interval>();

        if (intervals == null || intervals.size() == 0)
            return result;

        intervals.sort((i1, i2) -> {
            if (i1.start != i2.start)
                return i1.start - i2.start;
            else
                return i1.end - i2.end;
        });

        Interval pre = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            Interval curr = intervals.get(i);
            if (curr.start > pre.end) {
                result.add(pre);
                pre = curr;
            } else {
                pre = new Interval(pre.start, Math.max(pre.end, curr.end));
            }
        }
        result.add(pre);

        return result;
    }


}

class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }
}




