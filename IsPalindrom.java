public class IsPalindrom {
    public static void main(String[] args) {
        String sentence1 = "Madam, I'm Adam!";      
        System.out.println(sentence1);
        System.out.println("Palindrome: " + isPalindrome(sentence1));
        
        String sentence2 = "Sir, I'm Eve!";      
        System.out.println(sentence2);
        System.out.println("Palindrome: " + isPalindrome(sentence2));
    }

    public static boolean isPalindrome(String s) {
        int length = s.length();
        
        // Base case
        if (length <= 1) {
            return true;
        }

        char first = Character.toLowerCase(s.charAt(0));
        char last = Character.toLowerCase(s.charAt(length - 1));

        if (Character.isLetter(first) && Character.isLetter(last)) {
            if (first == last) {
                String smallerString = s.substring(1, length - 1);
                return isPalindrome(smallerString);
            } else {
                return false;
            }
        } else if (!Character.isLetter(first)) {
            String shorter = s.substring(1, length);
            return isPalindrome(shorter);
        } else {
            String shorter = s.substring(0, length - 1);
            return isPalindrome(shorter);
        }
    }
}
