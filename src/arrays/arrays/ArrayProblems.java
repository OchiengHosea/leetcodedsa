package arrays.arrays;

public class ArrayProblems {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int latestCounter = 0;
        for (int num :
                nums) {
            if (num == 1){
                counter++;
            } else {
                if (counter != 0) latestCounter = counter;
                counter = 0;
            }
        }
        if (latestCounter > counter) return latestCounter;
        return counter;
    }
}
