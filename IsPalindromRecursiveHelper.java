public class IsPalindromRecursiveHelper{
    public static boolean isPalindrom(String word){
        return isPalindromHelper(word, 0, word.length()-1);
    }
    public static boolean isPalindromHelper(String word, int start, int end){
        boolean result;
        if (end - start <= 1){
            result = true;
        }
        else if (word.charAt(start) != word.charAt(end)){
            result = false;
        }
        else{
            result = isPalindromHelper(word, start + 1, end - 1);
        }
        return result;
    }
    public static void main(String[] args){
        boolean test1 = isPalindrom("adam");
        boolean test2 = isPalindrom("madam");
        System.out.println(test1);
        System.out.println(test2);
    }
}