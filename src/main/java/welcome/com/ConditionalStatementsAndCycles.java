package welcome.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Random;
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
        if (list[0] > list[1] && list[0] > list[2] && list[0] > list[3]) {
            System.out.println("Biggest number is: " + list[0]);
        } else if (list[1] > list[0] && list[1] > list[2] && list[0] > list[3]) {
            System.out.println("Biggest number is: " + list[1]);
        } else if (list[2] > list[0] && list[2] > list[1] && list[2] > list[3]) {
            System.out.println("Biggest number is: " + list[2]);
        } else if (list[3] > list[0] && list[3] > list[1] && list[3] > list[2]) {
            System.out.println("Biggest number is: " + list[3]);
        } else {
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
        if (list[0] >= list[1] && list[0] >= list[2]) {
            System.out.println(list[0]);
            if (list[1] >= list[2]) {
                System.out.println(list[1]);
                System.out.println(list[2]);
            } else {
                System.out.println(list[2]);
                System.out.println(list[1]);
            }
        } else if (list[1] >= list[0] && list[1] >= list[2]) {
            System.out.println(list[1]);
            if (list[0] >= list[2]) {
                System.out.println(list[0]);
                System.out.println(list[2]);
            } else {
                System.out.println(list[2]);
                System.out.println(list[0]);
            }
        } else if (list[2] >= list[0] && list[2] >= list[1]) {
            System.out.println(list[2]);
            if (list[0] >= list[1]) {
                System.out.println(list[0]);
                System.out.println(list[1]);
            } else {
                System.out.println(list[1]);
                System.out.println(list[0]);
            }
        }
    }

    public void checkNames() {
        Scanner first = new Scanner(System.in);
        System.out.println("Please enter first name: ");
        String firstName = first.nextLine();
        Scanner second = new Scanner(System.in);
        System.out.println("Please enter second name: ");
        String secondName = second.nextLine();
        if (firstName.toUpperCase().equals(secondName.toUpperCase())) {
            System.out.println("Имена идентичны.");
        } else if (firstName.length() == secondName.length()) {
            System.out.println("Длины имен равны");
        } else {
            System.out.println("В этих именах ничего похожего.");
        }
    }

    public void nameAndAge() { //5 Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще»  6 Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно»
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scan.nextLine();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        String ageString = scan2.nextLine();
        int age = Integer.parseInt(ageString);
        if (age < 18) {
            System.out.println("Подрасти еще");
        } else if (age > 20) {
            System.out.println("И 18 достаточно");
        } else {
            System.out.println("Возраст что надо");
        }
    }

    public void guessTheNumber() {
        Random random = new Random();
        int secret;
        secret = random.nextInt(20 + 1);
        int tries = 7;
        while (0 < tries) {
            System.out.println("Guess the number from 0 to 20. You got " + tries + " tries");
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            int guess = Integer.parseInt(str);
            if (guess == secret) {
                System.out.println("Угадал :)");
                break;
            } else if (guess < secret) {
                System.out.println("Мало");
                tries--;
                if (tries == 0) {
                    System.out.println("Не угадал :(");
                    break;
                }
            } else if (guess > secret) {
                System.out.println("Много");
                tries--;
                if (tries == 0) {
                    System.out.println("Не угадал :(");
                    break;
                }
            }

        }
    }

    public void countdown() {  //8 Вывести на экран числа от 1 до 10, используя цикл while. 9 Вывести на экран числа от 10 до 1, используя цикл while.
        int i = 1;
        int n = 10;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        while (n >= 1) {
            System.out.print(n + " ");
            n--;
        }
    }

    public void stringsRepeating() { //10 Ввести с клавиатуры строку и число N. Вывести на экран строку N раз, используя цикл while.
        Scanner str = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String word = str.nextLine();
        Scanner integer = new Scanner(System.in);
        System.out.println("Enter number of repeats: ");
        String number = integer.nextLine();
        int repeats = Integer.parseInt(number);
        int i = 0;
        while (i < repeats) {
            System.out.println(word);
            i++;
        }
    }


    public void squareOfS() { //11 Вывести на экран квадрат из 10х10 букв S используя цикл while. Буквы в каждой строке не разделять.
        String letter = "s";
        int n = 0;
        while (n < 10) {
            int i = 0;
            while (i < 10) {
                System.out.print(letter);
                i++;
            }
            System.out.println();
            n++;
        }
    }


    public void multiplicationTable() { // 12 Вывести на экран таблицу умножения 10х10 используя цикл while. Числа разделить пробелом.
        int multiplier = 1;
        int i = 0;
        while (i < 10) {
            int n = 1;
            while (n <= 10) {
                System.out.print(n * multiplier + " ");
                n++;
            }
            System.out.println();
            i++;
            multiplier++;
        }
    }

    public void onlyEven() { // 13 Используя цикл for вывести на экран чётные числа от 1 до 100 включительно. Через пробел либо с новой строки.
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }

    public void squaresOfEight() { // 14 Ввести с клавиатуры два числа m и n. Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
        Scanner integer = new Scanner(System.in);
        System.out.println("Enter width: ");
        String intWidth = integer.nextLine();
        int width = Integer.parseInt(intWidth);
        Scanner integer2 = new Scanner(System.in);
        System.out.println("Enter length:  ");
        String intLength = integer2.nextLine();
        int length = Integer.parseInt(intLength);
        String eight = "8";
        for (; width > 0; width--) {
            int i = length;
            for (; i > 0; i--){
                System.out.print(eight);
            }
            System.out.println();
        }
    }
    public void rightTriangle(){ // 15 Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
        String eight = "8";
        for (int i = 1; i <= 10; i++) {
            int n = i;
            for (; n > 0; n--){
                System.out.print(eight);
            }
            System.out.println();
        }
    }
    public void twoLinesOfEigths(){ // 16 Используя цикл for вывести на экран: - горизонтальную линию из 10 восьмёрок - вертикальную линию из 10 восьмёрок.
        String eight = "8";
        for (int i = 0; i < 10; i++) {
            System.out.print(eight);
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(eight);
        }
    }
    public void nameWhichLovesYou(){ // 17 Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = scan.nextLine();
        for (int i = 0; i < 10; i++){
            System.out.println(name + " любит меня.");
        }


    }
    public void reverseCountdown() throws InterruptedException {  //Написать программу, которая ведёт обратный отсчёт с 30 до 0, и в конце выводит на экран текст «Бум!». Программа должна уменьшать число 10 раз в секунду.
        for (int i = 30; i >= 0; i--){
            System.out.println(i);
            Thread.sleep(100);
        }
        System.out.println("БУМ!!!");

    }
    }
