import java.util.Random;


public class DieSimulator{
    public static void main(String[] args){
        Die myDie = new Die(67);
        System.out.println(myDie.dieSize());
        System.out.println(myDie.throwDie());
    }
}