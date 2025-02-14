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
    }
}