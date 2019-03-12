import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;
import welcome.com.*;

public class Main{
    public static void main(String [] args) throws IOException, InterruptedException {
   //     System.out.println("Hello world");     //  this part is for module 2.2 primitive types
   //     printHelloName();

       /* TypeConversion conversion = new TypeConversion();
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
        System.out.println("c = a + b + c = " + c);*/

       /*ReferenceTypes checkString = new ReferenceTypes();
       checkString.firstMiddleAndLastSymbols("Приветъ");
       checkString.sentenceBeforeDotAndNumberOfSpaces("Это мое предложение.Оно такое же как все другие предложения.Но это мое.");

        Scanner scanString = new Scanner(System.in);
        System.out.println("Please enter your sentence: ");
        String myString = scanString.nextLine();
        Scanner scanSubstringToBeReplaced = new Scanner(System.in);
        System.out.println("Please enter substring which you want to replace: ");
        String mySubstringToBeReplaced = scanSubstringToBeReplaced.nextLine();
        Scanner scanNewSubstring = new Scanner(System.in);
        System.out.println("Please enter your new substring: ");
        String myNewSubstring = scanNewSubstring.nextLine();
        checkString.replaceSubstringInString(myString, mySubstringToBeReplaced, myNewSubstring);

        Scanner scanStringWithSpacesOnly = new Scanner(System.in);
        System.out.println("Please enter your sentence where words separated only by spaces: ");
        String myStringWithSpacesOnly = scanStringWithSpacesOnly.nextLine();
        checkString.findLongestWordInSentence(myStringWithSpacesOnly);*/

        /*Arrays arrays = new Arrays();
        int[] newArray = arrays.initializeArray();
        arrays.max(newArray);
        arrays.stringArrayInReverseOrder();
        arrays.createTwoArrays();
        arrays.intArrayInReverseOrder();
        arrays.splitArrayInTwo();*/

        ConditionalStatementsAndCycles condition = new ConditionalStatementsAndCycles();
      //  condition.smallestOfTwo(); //Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
      //  condition.biggestOfFour(); //Ввести с клавиатуры четыре числа, и вывести максимальное из них.
       // condition.threeNumbersDesc();//Ввести с клавиатуры три числа, и вывести их в порядке убывания.
       // condition.checkNames();// Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
       // condition.nameAndAge();
       // condition.guessTheNumber();

       // condition.countdown(); // 8. Вывести на экран числа от 1 до 10, используя цикл while. 9 Вывести на экран числа от 10 до 1, используя цикл while.
       // condition.stringsRepeating(); // 10 Ввести с клавиатуры строку и число N. Вывести на экран строку N раз, используя цикл while.
       // condition.squareOfS(); // 11 Вывести на экран квадрат из 10х10 букв S используя цикл while. Буквы в каждой строке не разделять.
        condition.multiplicationTable(); // 12 Вывести на экран таблицу умножения 10х10 используя цикл while. Числа разделить пробелом.

      //  condition.onlyEven(); // 13 Используя цикл for вывести на экран чётные числа от 1 до 100 включительно. Через пробел либо с новой строки.
       // condition.squaresOfEight(); // // 14 Ввести с клавиатуры два числа m и n. Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
       // condition.rightTriangle(); // 15 Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
       // condition.twoLinesOfEigths(); // 16 Используя цикл for вывести на экран: - горизонтальную линию из 10 восьмёрок - вертикальную линию из 10 восьмёрок.
       // condition.nameWhichLovesYou(); // 17 Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]
       // condition.reverseCountdown(); //Написать программу, которая ведёт обратный отсчёт с 30 до 0, и в конце выводит на экран текст «Бум!». Программа должна уменьшать число 10 раз в секунду.
            }




    public static void printHelloName(){
        Scanner scan = new Scanner(System.in);
            System.out.println("Please enter your name: ");
        String s = scan.next();
            System.out.println("Hello, " + s);


}
}