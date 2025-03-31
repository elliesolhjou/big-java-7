import java.util.Stack;

public class BalancedParan {
    public static void main(String[] args){
        System.out.println(helper("{[}]"));          // Brackets opened and closed in wrong order
        System.out.println(helper("{[(])}"));        // Nested mismatch
        System.out.println(helper("((()")) ;         // One missing closing parenthesis
        System.out.println(helper("({)}"));          // Order breaks nesting logic
        System.out.println(helper("()[]{")) ;        // One bracket left unclosed
        System.out.println(helper("(((([]))))]"));   // Extra closing bracket at end
        System.out.println(helper("(([[{{}}]]))}")); // One extra closing curly
        System.out.println(helper("([{})"));         // Mixed, wrong closure
        System.out.println(helper("{[(()]})"));      // One misplaced closing
        System.out.println(helper("([)]"));          // Classic interleaved wrong order
        System.out.println(helper("(((((((((())))))))))"));  // Deep nesting
        System.out.println(helper("(){[()]}"));              // Mixed correct
        System.out.println(helper("((([]))){}"));            // Nested + flat


    }
    public static boolean helper(String text){

        Stack<Character> openParanStack = new Stack<>();
        if (text.length() %2 !=0){return false;}
        for (int i = 0; i < text.length(); i++ ){
            char pointer = text.charAt(i);
            if (pointer == '{' || pointer == '[' || pointer == '('){
                openParanStack.push(pointer);
            }
            else{
                if (openParanStack.size() == 0){
                    return false;
                }
                char top = openParanStack.pop();
                if (((pointer == ')' && top != '(') || (pointer == '}' && top != '{' ) || ( pointer == ']' && top != '['))){
                    return false;
                }
            
            }
        }
        if (openParanStack.size() != 0){
            return false;
        }
        return true;
    }

}