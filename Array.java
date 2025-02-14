//practicing partially filled arrays


// Using a for loop, fill the array a with
// 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2.
import java.util.Arrays;

public class Array{
    public static void main(String[] args){
        int[] filledArray = new int[18];
        for (int i=0; i<filledArray.length; i++){
            filledArray[i] = i % 3;
        }
        System.out.print(Arrays.toString(filledArray));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        // element seperator
        //32 | 54 | 67.5 | 29 | 35
        double[] values = {32, 54, 67.5, 29, 35};
        for (int i=0; i< values.length-1; i++){
            System.out.print(values[i]+" | ");
        }
        System.out.println(values[values.length-1]);
        

        //linear search array
        //search for the position of the first 
        //element in an array that is equal to 100
        int[] intValues = {23, 64, 13, 87, 99, 23, 100, 45, 76, 3,90};
        boolean found = false;
        int position = 0;
        int target = 100;
        
        for (int i = 0; i<intValues.length; i++){
            if (intValues[i] == target){
                position = i;
            }
        }
        System.out.println("positions is : "+ position);
        System.out.println(intValues.length);
        

    }
}


