import java.util.*;

public class ReversedString{
    public static void printReversedSentence(Scanner in){
        String reversedString="";
        Stack<String> stringStack = new Stack<>();

        while(in.hasNext()){
            String word = in.next();
            if (word.charAt(word.length() - 1) == '.'){
                String newWord = word.substring(0, word.length() - 1);
                stringStack.push(newWord);
            }
            else{
                stringStack.push(word);
            }
        }
        reversedString =  reversedString + stringStack.pop();
        while(!stringStack.isEmpty()){
            reversedString = reversedString + " " + stringStack.pop();
        }
        reversedString = reversedString + ".";
        System.out.println(reversedString);
    }
    public static void main(String[] args) {
        String test1 = "its fleece was white as snow.";
        String test2 = "ahem.";
        String test3 = "mary had a little lamb.";
        String test4 = "the end.";

        System.out.print("Output 1: ");
        printReversedSentence(new Scanner(test1)); // Expected: snow as white was fleece its.

        System.out.print("Output 2: ");
        printReversedSentence(new Scanner(test2)); // Expected: ahem.

        System.out.print("Output 3: ");
        printReversedSentence(new Scanner(test3)); // Expected: lamb little a had mary.

        System.out.print("Output 4: ");
        printReversedSentence(new Scanner(test4)); // Expected: end the.
    }
}