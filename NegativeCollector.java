import java.util.LinkedList;
import java.util.List;

public class NegativeCollector {

    public static void main(String[] args) {
        int[] test1 = {};
        int[] test2 = {3, 2, 1};
        int[] test3 = {-7};
        int[] test4 = {-7, 3, -12, -8, 4};
        int[] test5 = {-5, -3, -12, -8, -4};

        System.out.println("Test 1: " + negativesIn(test1)); // []
        System.out.println("Test 2: " + negativesIn(test2)); // []
        System.out.println("Test 3: " + negativesIn(test3)); // [-7]
        System.out.println("Test 4: " + negativesIn(test4)); // [-7, -12, -7] (in reverse order)
        System.out.println("Test 5: " + negativesIn(test5)); // [-7, -12, -7] (in reverse order)
    }

    public static LinkedList<Integer> negativesIn(int[] nums) {
        return negativesInHelper(nums, nums.length - 1);
    }

    public static LinkedList<Integer> negativesInHelper(int[] nums, int end) {
        List<Integer> result;

        if (nums.length == 0 || end < 0) {
            result = new LinkedList<Integer>();
        } else {
            result = negativesInHelper(nums, end - 1);
            if (nums[end] < 0) {
                result.add(nums[end]); // adds to the end of the list
            }
        }

        return (LinkedList<Integer>) result;
    }
}
