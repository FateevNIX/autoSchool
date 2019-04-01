import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

import welcome.com.*;
import figur.*;

public class Main{
    public static void main(String [] args) throws IOException, InterruptedException {
        /*System.out.println("Hello world");     //  Создать простой Java-проект (консольное приложение), которое при запуске выводит в консоль “Hello, world!”.
        printHelloName(); //Добавить метод printHelloName(), который будет запрашивать у пользователя ввести имя, считывать введенное имя с консоли и выводить на экран приветствие “Hello, %name%”.



        TypeConversion conversion = new TypeConversion();
        conversion.divideNumbers(36, 10); //1 В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на экран результат деления q на w с остатком. Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке
        conversion.sumOfDigits(123); // В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
        conversion.numberRounding(1.4); // В переменной n хранится вещественное число с ненулевой дробной частью. Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.

        int a = 2; // Даны три переменные a, b и c. Изменить значения этих переменных так, чтобы в a хранилось значение a+b, в b хранилась разность старых значений c−a, а в c хранилось сумма старых значений a+b+c. Например, a=0, b=2, c=5, тогда новые значения a=2, b=5 и c=7.
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



       ReferenceTypes checkString = new ReferenceTypes();
       checkString.firstMiddleAndLastSymbols("Приветъ"); //Дана строка. Вывести первый, последний и средний (если он есть) символы.
       checkString.sentenceBeforeDotAndNumberOfSpaces("Это мое предложение.Оно такое же как все другие предложения.Но это мое."); //Напишите программу, которая выводит часть строки до первой встреченной точки, включая точку. Также предусмотрите вывод количества пробелов.

        Scanner scanString = new Scanner(System.in); //Найти в строке указанную подстроку и заменить ее на новую. Строку, ее подстроку для замены и новую подстроку вводит пользователь.
        System.out.println("Please enter your sentence: ");
        String myString = scanString.nextLine();
        Scanner scanSubstringToBeReplaced = new Scanner(System.in);
        System.out.println("Please enter substring which you want to replace: ");
        String mySubstringToBeReplaced = scanSubstringToBeReplaced.nextLine();
        Scanner scanNewSubstring = new Scanner(System.in);
        System.out.println("Please enter your new substring: ");
        String myNewSubstring = scanNewSubstring.nextLine();
        checkString.replaceSubstringInString(myString, mySubstringToBeReplaced, myNewSubstring); //

        Scanner scanStringWithSpacesOnly = new Scanner(System.in); //Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.
        System.out.println("Please enter your sentence where words separated only by spaces: ");
        String myStringWithSpacesOnly = scanStringWithSpacesOnly.nextLine();
        checkString.findLongestWordInSentence(myStringWithSpacesOnly);



        Arrays arrays = new Arrays();
        int[] newArray = arrays.initializeArray();
        arrays.max(newArray); // Максимальное среди массива на 20 чисел
        arrays.stringArrayInReverseOrder(); //Массив из строчек в обратном порядке
        arrays.createTwoArrays(); // создать два массива, поместить значения длины строк одного массива в другой, вывести второй на экран
        arrays.intArrayInReverseOrder();//Массив из чисел в обратном порядке
        arrays.splitArrayInTwo(); //Один большой массив разбить на два маленьких



        ConditionalStatementsAndCycles condition = new ConditionalStatementsAndCycles();
        condition.smallestOfTwo(); //Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
        condition.biggestOfFour(); //Ввести с клавиатуры четыре числа, и вывести максимальное из них.
        condition.threeNumbersDesc();//Ввести с клавиатуры три числа, и вывести их в порядке убывания.
        condition.checkNames();// Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
        condition.nameAndAge(); //5 Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще» И 6 Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно»
        condition.guessTheNumber(); //7 За семь попыток угадать число. При каждой попытке вам будет выводиться сообщение - "Мало" или "Много". Если угадаете, уложившись в семь попыток, то выводится сообщение "Угадал :)" и программа завершает работу. Если по истечении 7 попыток число не угадывается, то выводится сообщение "Не угадал :(" и завершается работа.

        condition.countdown(); // 8. Вывести на экран числа от 1 до 10, используя цикл while. 9 Вывести на экран числа от 10 до 1, используя цикл while.
        condition.stringsRepeating(); // 10 Ввести с клавиатуры строку и число N. Вывести на экран строку N раз, используя цикл while.
        condition.squareOfS(); // 11 Вывести на экран квадрат из 10х10 букв S используя цикл while. Буквы в каждой строке не разделять.
        condition.multiplicationTable(); // 12 Вывести на экран таблицу умножения 10х10 используя цикл while. Числа разделить пробелом.

        condition.onlyEven(); // 13 Используя цикл for вывести на экран чётные числа от 1 до 100 включительно. Через пробел либо с новой строки.
        condition.squaresOfEight(); // // 14 Ввести с клавиатуры два числа m и n. Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
        condition.rightTriangle(); // 15 Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
        condition.twoLinesOfEigths(); // 16 Используя цикл for вывести на экран: - горизонтальную линию из 10 восьмёрок - вертикальную линию из 10 восьмёрок.
        condition.nameWhichLovesYou(); // 17 Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]
        condition.reverseCountdown(); //Написать программу, которая ведёт обратный отсчёт с 30 до 0, и в конце выводит на экран текст «Бум!». Программа должна уменьшать число 10 раз в секунду.
            }*/

        List<Figures> list = new ArrayList<>(); //В функции main должны быть рализованы следующие пункты:
        int a = 0;
        int b = 0;
        int c = 0;
        int i = 0;
        int n = 0;
        Random random = new Random();
        while (i < 10) { //- создания массива рандомных фигур размером в 10 элементов.
            int randomFigure = random.nextInt(3);
            if (randomFigure == 0) {
                Circle circle = new Circle();
                circle.setName("Круг" + a);
                circle.findSquare();
                list.add(circle);
                a++;
            } else if (randomFigure == 1) {
                Triangle triangle = new Triangle();
                triangle.setName("Треугольник" + b);
                triangle.findSquare();
                list.add(triangle);
                b++;
            } else {
                Square square = new Square();
                square.setName("Квадрат" + c);
                square.findSquare();
                list.add(square);
                c++;
            }
            i++;
        }
        list.sort(Comparator.comparing(Figures::getSquare)); //- сортировка фигур по площади (ASC/DESC - не важно)
            for (; n < 10; n++) {
                System.out.println(list.get(n).getName() + " S = "  + list.get(n).getSquare() ); //- вывести отсортированный массив на консоли в виде : Имя, S=площадь
            }

    }
        public static void printHelloName() {//Добавить метод printHelloName(), который будет запрашивать у пользователя ввести имя, считывать введенное имя с консоли и выводить на экран приветствие “Hello, %name%”.
                Scanner scan = new Scanner(System.in);
                System.out.println("Please enter your name: ");
                String s = scan.next();
                System.out.println("Hello, " + s);


            }

        }
