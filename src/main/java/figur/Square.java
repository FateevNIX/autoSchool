package figur;

import java.util.Random;

public class Square extends Figures {
    private Random random = new Random();
    private int side = random.nextInt(10) + 1;
    private String name;
    private double S;

    public void findSquare(){
       this.S = side * side;
    }
    public double getSquare(){
        return S;
    }

}
