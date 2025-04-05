public class Num3s{
    public static int num3(int num){
        int result=0;
        if (num == 0){
            return 0;
        }
        result = num3(num / 10);
        if (num % 10 == 3){
            result ++;
        }
    return result;
    }
    public static void main(String[] args){
        System.out.println(num3(365672133));
        System.out.println(num3(33));
        System.out.println(num3(3));
        System.out.println(num3(2));
        System.out.println(num3(8345));
    }

}