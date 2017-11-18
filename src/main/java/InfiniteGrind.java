import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class InfiniteGrind {
    public static void main(String[] args) {
        System.out.println(coverPoints(asList(3,5), asList(10,7)));

    }


    public static  int coverPoints(List<Integer> X, List<Integer> Y) {
        int numSteps = 0;
        for(int i = 1; i < X.size(); i++){
            numSteps += Math.max( Math.abs(X.get(i) - X.get(i-1)), Math.abs(Y.get(i) - Y.get(i-1)) );
        }
        return numSteps;
    }


}
