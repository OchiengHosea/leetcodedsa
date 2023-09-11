import arrays.DeletingItemsFromArray;
import arrays.InsertingItemsIntoAnArray;
import arrays.SearchingForItemsInAnArray;

public class Main {
    public static void main(String[] args) {
//        InsertingItemsIntoAnArray.duplicateZeros(new int[]{1,0,0,2,3,0,0,4,5,0,0});
        int[] arr1 = new int[] {1,2,3,0,0,0};
        int[] arr2 = new int[] {2,5,6};
//        InsertingItemsIntoAnArray.mergeSortedArray(arr1, arr1.length, arr2, arr2.length);
        int[] arr = new int[] {0,1,2,2,3,0,4,2};
        System.out.println(DeletingItemsFromArray.removeElement(arr, 2));

        System.out.println(SearchingForItemsInAnArray.checkIfExist(arr));
    }
}