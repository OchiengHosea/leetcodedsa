package arrays;

public class InplaceArrayOperations {
    public static int[] replaceElements(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int j = i + 1;
            if(j > arr.length-1){
                arr[arr.length-1] = -1;
            } else {
                int max = arr[j];
                while(j <= arr.length-1){
                    if(arr[j] > max) max = arr[j];
                    j++;
                }
                arr[i] = max;
            }
        }

        return arr;
    }
}
