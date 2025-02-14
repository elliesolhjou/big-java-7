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
    public int throwDie(){
        int randNum = generator.nextInt(sides);
        return 1+randNum;
    }

    public int dieSize(){
        return sides;
    }
}