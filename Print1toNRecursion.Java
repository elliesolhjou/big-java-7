public class Print1toNRecursion{
    public static String print1toN(int n){
        String result;
        if (n == 1){
            result = "1";
        }
        else{
            result = print1toN(n-1);
            result = result + ", "+ n;
        }
        return result;
    }
    public static void main(String[] args){
        String test = print1toN(3);
        System.out.print(test);
    }
}