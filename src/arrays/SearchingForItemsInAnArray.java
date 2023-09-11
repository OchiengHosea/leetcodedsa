package arrays;

public class SearchingForItemsInAnArray {
    /**
     * Given an array arr of integers, check if there exist two indices i and j such that :
     *
     * i != j
     * 0 <= i, j < arr.length
     * arr[i] == 2 * arr[j]
     */

    public static boolean checkIfExist(int[] arr) {
        int index = 0;
        while(index < arr.length){
            for(int i = 0; i < arr.length; i++){
                if(index != i && arr[index] == 2*arr[i] && i >= 0){
                    return true;
                }
            }
            index++;
        }
        return false;
    }
}
