public class Triple7{
    public static boolean hasTriple7(int[] nums){
        return hasTriple7Helper(nums, 0, 1, 2);
    }
    public static boolean hasTriple7Helper(int[] nums, int first, int second, int third){
        boolean result = false;
        if (third >= nums.length){
            return false;
        }
        else{
            result = hasTriple7Helper(nums, first + 1, second + 1, third + 1);
            if (nums[first]== nums[second] && nums[first]== nums[third] && nums[first] == 7){
                return true;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] test1 = {7, 88, 32, 7, 32};
        int[] test2 = {7, 7, 2, 7};
        int[] test3 = {7, 7};
        int[] test4 = {7, 7, 7};
        int[] test5 = {4, 7, 2, 7, 7, 7};
        int[] test6 = {2, 20, 7, 7, 7, 2, 2, 4, 5, 6};
        int[] test7 = {};                              // empty array
        int[] test8 = {1, 2, 3, 4, 5};                 // no 7s at all
        int[] test9 = {7, 7, 7, 7, 7};                 // many 7s, more than 3
        int[] test10 = {7, 7, 8, 7};                   // not three in a row
        int[] test11 = {7, 7, 7, 1, 7, 7, 7};          // multiple groups of 3
        int[] test12 = {1, 2, 7, 7, 7};                // 3 at end
        int[] test13 = {7, 7, 7, 7, 1, 2, 3};          // 3+ at beginning
        int[] test14 = {1, 2, 3, 7, 7, 7};             // 3 at end of longer array
        int[] test15 = {7, 1, 7, 1, 7};                // non-adjacent 7s

        System.out.println(hasTriple7(test1));  // false
        System.out.println(hasTriple7(test2));  // false
        System.out.println(hasTriple7(test3));  // false
        System.out.println(hasTriple7(test4));  // true
        System.out.println(hasTriple7(test5));  // true
        System.out.println(hasTriple7(test6));  // true

        System.out.println(hasTriple7(test7));  // false
        System.out.println(hasTriple7(test8));  // false
        System.out.println(hasTriple7(test9));  // true
        System.out.println(hasTriple7(test10)); // false
        System.out.println(hasTriple7(test11)); // true
        System.out.println(hasTriple7(test12)); // true
        System.out.println(hasTriple7(test13)); // true
        System.out.println(hasTriple7(test14)); // true
        System.out.println(hasTriple7(test15)); // false
        
    }
    
}