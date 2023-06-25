import arrays.InsertingItemsIntoAnArray;

public class Main {
    public static void main(String[] args) {
//        InsertingItemsIntoAnArray.duplicateZeros(new int[]{1,0,0,2,3,0,0,4,5,0,0});
        int[] arr1 = new int[] {1,2,3,0,0,0};
        int[] arr2 = new int[] {2,5,6};
        InsertingItemsIntoAnArray.mergeSortedArray(arr1, arr1.length, arr2, arr2.length);
        for (int n :
                arr1) {
            System.out.println(n);
        }
    }
}