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

    public static void duplicateZerosSolution(int[] arr){
        // if in-place was not a requirement
        /*  s = 0
            d = 0
            for s in range(N):
                if source[s] = 0:
                    destination[d] = 0
                    d += 0
                    destination[d] = 0
                else:
                    destination[d] = source[s]
            d++

            Approach 1 - Two pass, O(1) space
            if we know the number of elements which would be discarded from the end of the array,
            we can copy the rest. The number would be equal to the number of extra zeros which
            would be added to the array. The extra zero would create space for itself by pushing out
            an element from the end of the array.

            Then we just start copying from the end. copying from the end ensures we dont loose any
            element twice, the last few extraneuos elements can be overwritten

            Algorithm.
            1. Find the number of zeros which would be duplicated. - lets call it possible_dups
                length - possible_dups = number of elements to be included in the final array

            2. Handle edge case for the zero present on the boundary of the leftover elements
            3. Iterate the array form the end and copy a non-zero element once and zero element twice

         */
        int possibleDups = 0;
        int length_ = arr.length - 1;

        for (int left = 0; left < length_ - possibleDups; left++){
            if (arr[left] == 0){
                if (left == length_ - possibleDups){
                    arr[length_] = 0;
                    length_ -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        // start backwards from the last element which would be part of the new array
        int last = length_ - possibleDups;

        for (int i = last; i >= 0; i--){
            if (arr[i] == 0){
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i+possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }

    }

    public static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}
