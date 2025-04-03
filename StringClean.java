import java.util.*;

public class StringClass{
    public static String stringClassRecursive(String sentence){
        return stringClassRecursiveHelper(sentence, sentence.length()-1);
    }
    public static String stringClassRecursiveHelper(String sentence, int end){
        Set<Character> result = new TreeSet<>();

        // String result;
        if (sentence.length() == 1){
            result.add(sentence.charAt(0));
        }
        else{
            result = stringClassRecursiveHelper(sentence, end - 1);
            result = result.add(result);
        }
        String word="";
        Iterator<Character> iter = result.iterator();
        while(iter.hasNext()){
            Character ch = iter.next();
            word = word + ch;
        }
        return word;
    }

    public static void main(String[] args) {
        String[] testCases = {"yyzzza", "abbbcdd", "Hello", "", "a", "aa", "aabbaa"};

        for (String test : testCases) {
            String result = stringClassRecursive(test);
            System.out.println("stringClassRecursive(\"" + test + "\") → \"" + result + "\"");
        }
    }
}
