public class IsPalindromRecursion{
    public static boolean isPali(String s){
        boolean result;
        int length = s.length();
        if (length <= 1){
            result = true;
        }
        else if (s.charAt(0) != s.charAt(length - 1)){
            result = false;
        }
        else{
            result = isPali(s.substring(1, length - 1));
        }
        return result;
    }
    public static void main(String[] args){
        boolean test1 = isPali("adam");
        boolean test2 = isPali("madam");
        System.out.println(test1);
        System.out.println(test2);
    }
}