import welcome.com.Hello;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String s = scan.next();
        Hello user = new Hello();
        user.setupName(s);
        user.welcome();
        System.out.println("Hello, world!");
        user.byeBay();
    }
}
