import arrays.InsertingItemsIntoAnArray;
import arrays.arrays.ArrayProblems;
import arrays.arrays.DVD;

public class Main {
    public static void main(String[] args) {
        DVD[] dvdCollection = new DVD[15];
        DVD avengerDvd = new DVD("The Avengers", 2012, "Joss Whedon");
        DVD incredibleDVD = new DVD("The incredible", 2004, "Brad Bird");
        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew statnton");
        DVD lionKindDVD = new DVD("The Lion King", 2019, "John Favrou");

        // putting items into the DVD Collection
        dvdCollection[7] = avengerDvd;
        dvdCollection[3] = incredibleDVD;
        dvdCollection[9] = findingDoryDVD;
        dvdCollection[2] = lionKindDVD;

        // overwriting items from the array
        DVD starWarsDVD = new DVD("Star Wars", 1977, "George Lucas");
        dvdCollection[3] = starWarsDVD;
        // reading items from the array
        System.out.println(dvdCollection[7]);
        System.out.println(dvdCollection[10]);
        System.out.println(dvdCollection[3]);

        // writing items into an array with a loop
        int[] squareNumbers = new int[10];
        for (int i = 0; i < 10; i++) {
            int square = (i +1) * (i + 1);
            squareNumbers[i] = square;
        }

        // reading items from an array with a loop
        for (int i = 0; i < 10; i++) {
            System.out.println(squareNumbers[i]);
        }

        // iterating using for each
        for (int square :
                squareNumbers) {
            System.out.println(square);
        }

        // Array capacity - the number of items it can hold
        // Array length - the number of items currently in the array.

        // example of arrays
        int[] nums = {1,1,0,1,1,1};
        System.out.println("Finding maximum consecutive ones");
        System.out.println(ArrayProblems.findMaxConsecutiveOnesSol(nums));
        InsertingItemsIntoAnArray.duplicateZeros(new int[]{1,0,0,2,3,0,0,4,5,0,0});
    }
}