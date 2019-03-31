import java.lang.reflect.Array;
import java.util.Arrays;

public class FindLargestAndSmallestInt {
    public static void main(String[]args){
        int numberRange[] = {-10, 24, 50, -88, 356};

        //set starting index value of 0
        int largest = numberRange[0];
        int smallest = numberRange[0];

        //for loop to iterate
        // index loop from 1 as 0 location is stored

        for (int i =1; i<numberRange.length; i++){
            if(numberRange[i]>largest){
                largest = numberRange[i];
            }
            else if (numberRange[i]<smallest){
                smallest = numberRange[i];
            }
        }
    System.out.println("Given array is"  + Arrays.toString(numberRange));
    System.out.println("Largest number is " + largest);
    System.out.println("Smallest number is " + smallest);

    }
}
