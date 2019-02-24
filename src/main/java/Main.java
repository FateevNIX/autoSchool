import java.util.Scanner;

public class Main{
   // public static void main(String [] args){
   //     System.out.println("Hello world");
   //     printHelloName();
   // }

    public static void printHelloName(){
        Scanner scan = new Scanner(System.in);
            System.out.println("Please enter your name: ");
        String s = scan.next();
            System.out.println("Hello, " + s);


}
}