import java.lang.Math;

public class RecursiveMaxInt{
    public static int maxInt(int[] nums){

        return maxIntHelper(nums, 0, nums.length - 1);

    }
    public static int maxIntHelper(int[] nums, int start, int end){
        int result;
        if (nums.length == 0){
            result = 0;
        }
        else if (end - start == 0){
            result = nums[end];
        }
        else{
            result = maxIntHelper(nums, 0, end - 1);
            result = Math.max(result, nums[end]);
        }
        return result;
    }
    public static void main(String[] args){
        int[] test1 = {1, 4, 7, 2, 9};    // max is 9
        int[] test2 = {-5, -2, -11};      // max is -2
        int[] test3 = {42};               // max is 42
        int[] test4 = {};                 // max is Integer.MIN_VALUE (edge case)
        int[] test5 = {7, 7, 7, 7};       // max is 7

        System.out.println(maxInt(test1)); // 9
        System.out.println(maxInt(test2)); // -2
        System.out.println(maxInt(test3)); // 42
        System.out.println(maxInt(test4)); // -2147483648
        System.out.println(maxInt(test5)); // 7
    }

}