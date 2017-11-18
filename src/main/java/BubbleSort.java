import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5,7,8,2,1,9,3};
        System.out.println(Arrays.toString(bubble(arr)));
    }

    public static int[] bubble(int[] arr) {
        Boolean isSorted = false;
        int unsorted = arr.length-1;
        while(!isSorted) {
            isSorted = true;
            for (int i=0; i < unsorted; i++){
                if (arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                    isSorted = false;
                }
            }
            unsorted --;
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
