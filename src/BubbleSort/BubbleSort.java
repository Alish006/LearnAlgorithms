package BubbleSort;
import java.util.Arrays;

public class BubbleSort {

    public static int[] BubbleSortAlgorithm(int[] array){
        // length of the array
        int n = array.length;

        // implementation. Time complexity: O(n^2) -> worst case
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                // checking
                if(array[j] > array[j + 1]){
                    // swapping
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // return an array
        return array;
    }


    public static void main(String[] args) {

        System.out.println("Bubble Sort Algorithm");

        int[] unSortedArray = new int[]{4, 76, 5, 8, 54, 6, 100, 32};

        System.out.println("Unsorted array: " + Arrays.toString(unSortedArray));

        int[] res = BubbleSortAlgorithm(unSortedArray);

        System.out.println("Sorted array: " + Arrays.toString(res));

    }

}
