/**
 * 
Consider a function similar to print1UpToN that we did in lecture, but that returns a string of those numbers space-separated instead. E.g. "1 2 3 4 5" (Why the change? Because we can only return values in codingbat, not print values.) We'll call this method string1UpToN. Here's a solution similar to what we did in class: <hr>

// PRE: n >= 1
public String string1UpToN(int n) {
   if (n == 1) {
      return "" + n;    // one way to convert an int to a string
   }
   else {
      return string1UpToN(n-1) + " " + n;
   }
}
Note that the last thing that happens in the recursive case is an append.
In contrast, a tail-recursive solution to such a problem would have the recursive call as the last thing that happens in the function (it could be inside an else). Some programmers find the tail-recursive style easier to understand and write to solve a problem like this, some prefer the other way. Tail-recursive solutions are also of interest because some compilers can optimize tail-recursive functions so they only take as much space to run as an iterative version.
Implement a tail-recursive version of string1UpToN. To help you out, we'll give you the interface and the call to the helper function that will do the actual recursion (copy the starter code here into the code area below):
//***************************************
public String string1UpToN(int n) {
    return RAppendUpTo("", 1, n);    // note: first argument is an empty string
}

// appends the string of numbers in the range [i, n]  to the end of strSoFar and returns it.
// the numbers appended will be space separated
private String RAppendUpTo(String strSoFar, int i, int n) { 
//***************************************
HINT: You are building up the answer in strSoFar on the way down as you do recursive calls, i.e., it will get bigger in each recursive call. The base case will pass back the string constructed this way (and it will get passed all the way back to string1UpToN.

string1UpToN(3) → "1 2 3"
string1UpToN(1) → "1"
string1UpToN(5) → "1 2 3 4 5"
 */

public class String1UptoN{
    public static String string1toN(int n){
        return RAppendUpTo("", 1, n);
    }
    private static String RAppendUpTo(String strSoFar, int i, int n) { 
        if(i == n){
            strSoFar += n;
        }
        else{
            strSoFar = RAppendUpTo(strSoFar, i, n-1);
            strSoFar = strSoFar + " " + n;
        }
        return strSoFar;
    }
    public static void main (String[] args){
        System.out.println(string1toN(3));
        System.out.println(string1toN(5));
        System.out.println(string1toN(4));
        System.out.println(string1toN(10));
    }

}