import java.util.Random;

public class Test{
    public static void main (String[] args){
        //outer loop three times
        // inner loop four times
        for (int i=0; i<=2; i++){
            for (int j=0; j<=3; j++){
                System.out.print("[]");
                
            }
            System.out.println();
        }

        //workign on Random
        Random dice = new Random();
        System.out.println(dice.nextInt(54709745));
        System.out.println(dice.nextDouble());
    }
}

