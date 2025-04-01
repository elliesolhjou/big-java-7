/**
 * 
Returns the length of the longest string in an array of strings. 
Hint: use a helper method to do recursion on an array and call it from longestString.
The parameters for the new method will be the current index along with the array itself.

longestString(["here", "are", "some", "words"]) → 5
longestString(["hello"]) → 5
longestString([]) → 0
 */

import java.lang.Math;

public class LongestString{
    public static int lengthCounter(String[] words){
        return lengthCounterHelper(words, 0, words.length - 1);
    }
    public static int lengthCounterHelper(String[] words, int start, int end){
        int result;
        if (words.length == 0){
            result = 0;
        }
        else if (end == start){
            result = words[end].length();
        }
        else{
            result = lengthCounterHelper(words, 0, end - 1);
            result = Math.max(result, words[end].length());
        }
        return result;
    }
    public static void main(String[] args){
        String[] test1 = {"hello", "world", "java"};              // max length = 5
        String[] test2 = {"a", "ab", "abc", "abcd"};              // max length = 4
        String[] test3 = {"longest", "short", "tiny"};            // max length = 7
        String[] test4 = {};                                      // empty array = 0
        String[] test5 = {"same", "size", "word"};                // all length = 4
        String[] test6 = {"oneveryverylongword", "short", "tiny"}; // max length = 19
        String[] test7 = {"", "", ""};                            // all empty = 0
        String[] test8 = {"a"};                                   // single element = 1
        String[] test9 = {"mix", "", "superlongwordhere"};        // max length = 17

        System.out.println(lengthCounter(test1));  // 5
        System.out.println(lengthCounter(test2));  // 4
        System.out.println(lengthCounter(test3));  // 7
        System.out.println(lengthCounter(test4));  // 0
        System.out.println(lengthCounter(test5));  // 4
        System.out.println(lengthCounter(test6));  // 19
        System.out.println(lengthCounter(test7));  // 0
        System.out.println(lengthCounter(test8));  // 1
        System.out.println(lengthCounter(test9));  // 17
    }
    
}