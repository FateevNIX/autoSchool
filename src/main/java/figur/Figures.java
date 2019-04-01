package figur;


public abstract class Figures {
private String name;
private double S;

    public double getSquare(){
        return S;
    }

    public void setName(String name){
    this.name = name;
}
    public String getName(){
        return name;
    }

    public abstract void findSquare();


}

