package figur;

import java.util.Random;

public class Circle extends Figures {
    private Random random = new Random();
    private double S;
    private int r = random.nextInt(5) + 1;
    private String name;


    public void findSquare() {
        this.S = 3.14 * r * r;
        }
    public double getSquare(){
        return S;
    }

    }

