public class IsPalindromeEfficient {
    public static void main(String[] args) {
        String sentence1 = "Madam, I'm Adam!";      
        System.out.println(sentence1);
        System.out.println("Palindrome: " + isPalindrome(sentence1));
        
        String sentence2 = "Sir, I'm Eve!";      
        System.out.println(sentence2);
        System.out.println("Palindrome: " + isPalindrome(sentence2));
    }

    public static boolean isPalindrome(String s){
        return isPalindrome(s, 0, s.length() - 1);
    }
    public static boolean isPalindrome(String text, int start, int end){
        int length = text.length();
        if (start >= end){
            return true;
        }
        else {
            char first = Character.toLowerCase(text.charAt(start));
            char last = Character.toLowerCase(text.charAt(end));

            if(Character.isLetter(first) && Character.isLetter(last)){
                if (first == last){
                    return isPalindrome(text, start + 1, end - 1 );
                }
                else { return false;}
            }
            else if (!Character.isLetter(last)){
                return isPalindrome(text, start, end - 1 );
            }
            else{
                return isPalindrome(text, start + 1, end);
            }



        }
    }
}
