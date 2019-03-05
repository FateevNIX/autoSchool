package welcome.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class ConditionalStatementsAndCycles {
    public void smallestOfTwo() throws IOException { //Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        int[] list = new int[2];
        System.out.println("Please enter two numbers: ");
        for (int i = 0; i < list.length; i++) {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }
        if (list[0] < list[1]) {
            System.out.println("Minimal number is: " + list[0]);
        } else if (list[0] > list[1]) {
            System.out.println("Minimal number is: " + list[1]);
        } else {

            System.out.println("Numbers are equal.");
        }
    }

    public void biggestOfFour() throws IOException { //Ввести с клавиатуры четыре числа, и вывести максимальное из них.
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        int[] list = new int[4];
        System.out.println("Please enter four numbers: ");
        for (int i = 0; i < list.length; i++) {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }
        if (list[0] > list[1] && list[0] > list[2] && list[0] > list[3]){
            System.out.println("Biggest number is: " + list[0]);
        }
        else if(list[1] > list[0] && list[1] > list[2] && list[0] > list[3]){
            System.out.println("Biggest number is: " + list[1]);
        }
        else if(list[2] > list[0] && list[2] > list[1] && list[2] > list[3]){
            System.out.println("Biggest number is: " + list[2]);
        }
        else if(list[3] > list[0] && list[3] > list[1] && list[3] > list[2]){
            System.out.println("Biggest number is: " + list[3]);
        }
        else {
            System.out.println("There are several biggest numbers");
        }
    }

    public void threeNumbersDesc() throws IOException { //Ввести с клавиатуры три числа, и вывести их в порядке убывания.
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        int[] list = new int[3];
        System.out.println("Please enter three numbers: ");
        for (int i = 0; i < list.length; i++) {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }
        if (list[0] >= list[1] && list[0] >= list[2]){
            System.out.println(list[0]);
            if(list[1] >= list[2]){
                System.out.println(list[1]);
                System.out.println(list[2]);
            }
            else{
                System.out.println(list[2]);
                System.out.println(list[1]);
            }
        }
        else if (list[1] >= list[0] && list[1] >= list[2]){
            System.out.println(list[1]);
            if(list[0] >= list[2]){
                System.out.println(list[0]);
                System.out.println(list[2]);
            }
            else{
                System.out.println(list[2]);
                System.out.println(list[0]);
            }
        }
        else if (list[2] >= list[0] && list[2] >= list[1]){
            System.out.println(list[2]);
            if(list[0] >= list[1]){
                System.out.println(list[0]);
                System.out.println(list[1]);
            }
            else{
                System.out.println(list[1]);
                System.out.println(list[0]);
            }
        }
    }
    public void checkNames(){
        Scanner first = new Scanner(System.in);
        System.out.println("Please enter first name: ");
        String firstName = first.nextLine();
        Scanner second = new Scanner(System.in);
        System.out.println("Please enter second name: ");
        String secondName = second.nextLine();
        if(firstName.toUpperCase().equals(secondName.toUpperCase()) ){
            System.out.println("Имена идентичны.");
        }
        else if(firstName.length() == secondName.length()){
            System.out.println("Длины имен равны");
        }
        else{
            System.out.println("В этих именах ничего похожего.");
        }
    }
}
