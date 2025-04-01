/**
Using recursion (no loops) implement the method fastExpon 
which raises x to the nth power more efficiently than the version discussed in lecture. 
It will take advantage of the fact that
x^(n) = (x^(n/2))^2
to greatly reduce the number of of recursive calls and multiplications that will need to
 be done to compute the answer. (We're using ^ to indicate exponentiation in the above 
 formula.) You may assume x and n will both be non-negative.
HINT: for this to be fast, in any one activation of the method, only one recursive call
should be made. There may be multiple recursive calls in the code,
 but only one will get executed in any one activation.
fastExpon(3, 4) → 81
fastExpon(2, 3) → 8
fastExpon(2, 12) → 4096 
*/

public class FastExpon{
    public static int fastSolution(int base, int expon){
        int result;
        if (expon == 0){
            result = 1;
        }
        else {
            result = fastSolution(base, expon / 2);
            if (expon % 2 == 0 ){
                result = result * result;
            }
            else {
                result = result * result * base;
            }
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(fastSolution(3, 4));
        System.out.println(fastSolution(3, 5));
    }
}