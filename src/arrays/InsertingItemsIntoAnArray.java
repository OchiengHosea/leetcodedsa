package arrays;

import java.util.Arrays;

public class InsertingItemsIntoAnArray {
    // given an array of integers, you are required to duplicate all occurrences of 0
    // maintain the size of the array
    // do not overwrite array values
    // operation should be in-place and method should not return anything
    // i.e when given [1,0,2,3,0,4,5,0] it should yield [1,0,0,2,3,0,0,4]
    public static void duplicateZeros(int[] arr) {
        for (int item : arr)
            System.out.print(String.format("%d, ", item));
        System.out.println("");
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] == 0) {
                int[] subset = new int[arr.length - i - 1];
                // fill the subset
                System.out.print(String.format("i %d ln %d ", i, subset.length));

                int step = 0;
                while (step < subset.length){
                    subset[step] = arr[i+step];
                    step++;
                }

                for (int k = 0; k < subset.length; k++){
                    arr[k+i+1] = subset[k];
                }
                i++;
            }
        }


        // print to show
        for (int item : arr)
            System.out.print(String.format("%d, ", item));
    }
}
