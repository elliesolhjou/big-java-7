import java.util.Random;

public class Die{
    // instance var
    private int sides;
    private Random generator;

    //constructor
    public Die(){
        sides = 6;
        generator = new Random();
    }
    public Die (int numOfSides){
        sides = numOfSides;
        generator = new Random();
    }
    //method to give rand numbers between one and sides count+1
    public int throw(){
        return 1+generator.nextInt(sides);
    }
}