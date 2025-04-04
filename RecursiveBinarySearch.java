public class RecursiveBinarySearch{
    public static int binarySearch(int[] vals, int target){
        return binarySearchR(vals, target, 0, vals.length-1);
    }



    public static int binarySearchR(int[] nums, int target, int low, int high){
        if (low > high){
            return -1;
        }
        int mid = (low+high) / 2;
        int result;
        if (nums[mid] < target ){
            result = binarySearchR(nums, target, mid + 1, high);
        }
        else if(nums[mid] > target){
            result = binarySearchR(nums, target, low, mid - 1);
        }
        else{
            result = mid;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] vals1 = {1, 3, 5, 7, 9};
        int[] vals2 = {2, 4, 6, 8, 10, 12};
        int[] vals3 = {11, 22, 33, 44, 55};
        int[] vals4 = {1};
        int[] vals5 = {};

        System.out.println("Test 1: " + binarySearch(vals1, 5));  // Expected: 2
        System.out.println("Test 2: " + binarySearch(vals2, 8));  // Expected: 3
        System.out.println("Test 3: " + binarySearch(vals3, 25)); // Expected: -1
        System.out.println("Test 4: " + binarySearch(vals4, 1));  // Expected: 0
        System.out.println("Test 5: " + binarySearch(vals5, 10)); // Expected: -1
    }

}