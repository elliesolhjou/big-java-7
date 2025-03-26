/**
 * Write the static Java int method removeNegatives which takes a 
 * partially filled array (given by
an array of numbers, nums, and its current size, size)
 and removes the negative numbers in the
partially filled array, leaving the remaining numbers in 
the same relative order as before. The
return value of the function is the new size of the partially 
filled array. (Note: this method would
have no effect on nums.length)
Here are some examples (unused array locations are not shown):
nums before call size nums after call return value
[0, -4, -3, 7, 2, -9, 0, …] 7 [0, 7, 2, 0, …] 4
[2, 1, -5, -3, …] 4 [2, 1, …] 2
[-3, -3, …] 2 […] 0
[3, 2, 0, 10, …] 4 [3, 2, 0, 10, …] 4
[…] 0 […] 0
 */

import java.util.Arrays;

// PRE: size <= nums.length


public static int removeNegatives(int[] nums, int size) {
    
    for (int i =0; i< nums.length; i++){
        if (nums[i] < 0){
            for (int j = i; j< nums.length-1; j++){
                nums[j] = nums[j+1];
            }
        }   size --;
    } 
    return size;



}