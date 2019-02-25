import java.util.Scanner;
import welcome.com.TypeConversion;

public class Main{
    public static void main(String [] args){
   //     System.out.println("Hello world");     //  this part is for module 2.2 primitive types
   //     printHelloName();

        TypeConversion conversion = new TypeConversion();
        conversion.divideNumbers(36, 10);
        conversion.sumOfDigits(123);
        conversion.numberRounding(1.4);

        int a = 2;
        int b = 3;
        int c = 4;
        int x = a;
        int y = b;
        int z = c;
        a = x + y;
        b = z - x;
        c = x + y + z;
        System.out.println("a = a + b = " + a);
        System.out.println("b = c - a = " + b);
        System.out.println("c = a + b + c = " + c);
    }

    public static void printHelloName(){
        Scanner scan = new Scanner(System.in);
            System.out.println("Please enter your name: ");
        String s = scan.next();
            System.out.println("Hello, " + s);


}
}