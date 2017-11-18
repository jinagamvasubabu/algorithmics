import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.asList;

public class HotelBookingsPossible {
    public static void main(String[] args) {
        ArrayList<Integer> arrives = new ArrayList<>(asList(13, 14, 36, 19, 44, 1, 45, 4, 48, 23, 32, 16, 37, 44, 47, 28, 8, 47, 4, 31, 25, 48, 49, 12, 7, 8));
        ArrayList<Integer> departs = new ArrayList<>(asList(28, 27, 61, 34, 73, 18, 50, 5, 86, 28, 34, 32, 75, 45, 68, 65, 35, 91, 13, 76, 60, 90, 67, 22, 51, 53));
        System.out.println(new HotelBookingsPossible().hotel(arrives, departs, 23));
    }

    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        Collections.sort(arrive);
        Collections.sort(depart);

        int begin = arrive.get(0);
        int end = depart.get(depart.size() - 1);
        int booked = 0;

        int arrivalIndex = 0;
        int departureIndex = 0;

        for (int i = begin; i <= end; i++) {
            while (arrivalIndex < arrive.size() && arrive.get(arrivalIndex) == i) {
                booked++;
                arrivalIndex++;
            }

            while (departureIndex < depart.size() && depart.get(departureIndex) == i) {
                if (booked >= 1)
                    booked--;
                departureIndex++;
            }

            if (booked > K) {
                return false;
            }
        }
        return true;
    }
}


