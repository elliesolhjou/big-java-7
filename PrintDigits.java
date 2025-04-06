public class PrintDigits{
    public static void PrintD(int num){
        System.out.println(printDHelper(num));
    }
    public static String printDHelper(int num){
        String result="";
        if (num < 10){
            result = result + num;
        }
        else{
            result = printDHelper(num / 10);
            result = result + "," + (num % 10);
        }
        return result;
    }
    public static void main(String[] args){
        int test1 = 100;
        int test2 = 1234;
        int test3 = 0;
        int test4 = 5;

        PrintD(test1);
        PrintD(test2);
        PrintD(test3);
        PrintD(test4);
        // System.out.println(PrintD(test2));
        // System.out.println(PrintD(test3));
        // System.out.println(PrintD(test4));
    }
}