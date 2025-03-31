public class Recursrion{
    public static String printNto1(int n){
        String result;
        if (n==1){
            result = "1";
        }
        else{
            result = printNto1(n-1);
            result = n + ", " + result;

        }
        return result;
    }
        public static void main(String[] args){
            String test = printNto1(3);
            System.out.println(test);
        }
    
}