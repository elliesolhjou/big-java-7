public class DoubleDigit{
    public static int numDouble(int[] nums){
        return numDoubleHelper(nums, nums.length - 1);
    }
    public static int numDoubleHelper(int[] nums, int end){
        int count;
        if (end < 0){
            count= 0;
        }
        else{
            count = numDoubleHelper(nums, end - 1);
            if (nums[end]< 100 && nums[end] % 11 ==0){
                count++;
            }

        }
        return count;
    }
    public static void main(String[] args){
        int[] test1 = {1, 55, 8, 9};
        int[] test2 = {3,44,22,5};
        int[] test3 = {};
        int[] test4 = {388, 888, 84, 99};
        
        System.out.println("test1: " + numDouble(test1));
        System.out.println("test2: " + numDouble(test2));
        System.out.println("test3: " + numDouble(test3));
        System.out.println("test4: " + numDouble(test4));
    }
}