package SelectionSort;

import java.util.Arrays;


public class SelectionSort {

    public static int[] selectionSortAlgorithm(int[] arr){

        // length of the array
        int n = arr.length;

        // implementation. Time complexity: O(n^2) -> worst case
        for (int i = 0; i < n - 1; i++){
            int curMin = i;

            for (int j = i + 1; j < n; j++){
                if (arr[j] < arr[curMin]) {
                    curMin = j;
                }
            }

            // swapping the current minimum with the current item
            if (curMin != i){
                int temp = arr[i];
                arr[i] = arr[curMin];
                arr[curMin] = temp;
            }
        }

        // return an array
        return arr;
    }


    public static void main(String[] args) {

        System.out.println("Selection Sort Algorithm");

        int[] unSortedArray = new int[]{4, 76, 5, 8, 54, 6, 100, 32};

        System.out.println("Unsorted array: " + Arrays.toString(unSortedArray));

        int[] res = selectionSortAlgorithm(unSortedArray);

        System.out.println("Sorted array: " + Arrays.toString(res));
    }

}
