package figur;

import java.util.Random;

public class Triangle extends Figures {
   private Random random = new Random();
   private int baseLength  = random.nextInt(10) + 1;
   private int height  = random.nextInt(10) + 1;
   private double S;
   private String name;


    public void findSquare() {
        this.S = 0.5 * baseLength * height;
    }
    public double getSquare(){
        return S;
    }
    }

