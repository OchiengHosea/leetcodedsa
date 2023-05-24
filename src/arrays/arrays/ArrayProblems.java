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

    public static int findMaxConsecutiveOnesSol(int[] nums) {
        int sum = 0;
        int max = 0;
        for (int num :
                nums) {
            sum += num;
            if (num == 0) sum = 0;
            else max = Math.max(max, sum);
        }
        return max;
    }
}
