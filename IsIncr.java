import java.lang.Math;

public class IsIncr{
    public static boolean isIncr(int[] nums){
        return isIncrHelper(nums, 0, 1);
    }
    public static boolean isIncrHelper(int[] nums, int prev, int next){
        boolean result = false;
        if (next >= nums.length){
            return true;
        }
        else{
            result = isIncrHelper(nums, prev+1, next+1);
            if(nums[prev] >= nums[next]){
                return false;
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] test1 = {1, 3, 6, 8, 0};
        int[] test2 = {1, -1, 6, 8, 0};
        int[] test3 = {1, 3, 6, 8, 10};
        int[] test4 = {};

        System.out.println(isIncr(test1));
        System.out.println(isIncr(test2));
        System.out.println(isIncr(test3));
        System.out.println(isIncr(test4));
        int[] test = {5, 6, 7, 4, 8};
        System.out.println(isIncr(test)); 
    }
}