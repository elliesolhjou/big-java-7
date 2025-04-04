public class FindLast{
    public static int findLast(int[]nums, int target){
        return findLastHelper(nums, target, nums.length-1);
    }
    public static int findLastHelper(int[] nums, int target, int end){
        int result;
        if (end < 0){
            result = -1;
        }
        else{
            result = findLastHelper(nums, target, end - 1);
            if (nums[end] == target){
                System.out.println("end index at :" + end);
                result = end;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums = { 1, 4, 6, 8, 0, 8};
        System.out.println(findLast(nums, 8));
        // Test cases with expected output
        System.out.println(findLast(new int[]{10, 100, 10, 13, 7}, 10));    // Expected: 2
        System.out.println(findLast(new int[]{10, 100, 8, 9}, 32));         // Expected: -1
        System.out.println(findLast(new int[]{10, 100, 8, 9}, 10));         // Expected: 0
        System.out.println(findLast(new int[]{9, 9, 9, 9}, 9));             // Expected: 3
        System.out.println(findLast(new int[]{}, 9));                       // Expected: -1


    }
}