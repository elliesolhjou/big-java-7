// 

public class IsPalindrom{
    public static boolean isPali(String word){
        return isPaliHelper(word, 0, word.length() - 1);
    }

    public static boolean isPaliHelper(String word, int start, int end){
        boolean result= false;
        if (end <= start ){
            return true;
        }
        else if (word.charAt(start) != word.charAt(end)){
            return false;
        }
        else{
            result = isPaliHelper(word, start + 1, end -1);

        }
        return result;
    }
    public static void main(String[] args){
        String test1 = "MadaM";
        String test2 = "sdkfj";
        String test3 = "tenet";
        String test4 = "Ellie";

        System.out.println(isPali(test1));
        System.out.println(isPali(test2));
        System.out.println(isPali(test3));
        System.out.println(isPali(test4));
    }
}