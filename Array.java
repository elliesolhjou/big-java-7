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
        
        //removing an element from partially filled array
        // removing intValues[4]
        int size = intValues.length;
        int removeTargetPosition = 4;
        System.out.println(Arrays.toString(intValues));
        for (int i= removeTargetPosition; i<size-1; i++){
            intValues[i] = intValues[i+1];
        }
        intValues[size-1] = 0;
        size--;
        System.out.println(Arrays.toString(intValues));

        // inserting an element in fixed -size array
        // since we can't change size of array
        // use a variable curent size to show where we last modified array
        // length by putting zero as element in array
        System.out.println(intValues.length);
        System.out.println(size);
        int newElement = 4321;
        if (size < intValues.length){
            size++;
            int changeTarget = 6;
            for (int i=size-1;i>changeTarget; i-- ){
                intValues[i] = intValues[i-1];
            }
            intValues[changeTarget] = newElement;
        }
        System.out.println(Arrays.toString(intValues));
    }
}


