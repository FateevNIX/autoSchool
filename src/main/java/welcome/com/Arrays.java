package welcome.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Arrays {
    public static int[] initializeArray() throws IOException { //1. В методе initializeArray(): 1.1. Создайте массив на 20 чисел 1.2. Считайте с консоли 20 чисел и заполните ими массив
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        int[] list = new int[20];
        for (int i = 0; i < list.length; i++) {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }
        return list;
    }

    public void max(int[] array) { //Метод max(int[] array) должен находить максимальное число из элементов массива
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("Max number in array is: " + max);
    }

    public void stringArrayInReverseOrder() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        String[] list = new String[10]; //1. Создать массив на 10 строчек.
        for (int i = 0; i < list.length - 2; i++) { //2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
            String s = reader.readLine();
            list[i] = s;
        }
        int j = list.length - 1;
        while (list.length >= j) { //3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
            System.out.println(list[j]);
            j--;

        }
    }

    public void createTwoArrays() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        String[] list = new String[10]; //1. Создать массив на 10 строк.
        int[] secondList = new int[10]; //2. Создать массив на 10 чисел.
        for (int i = 0; i < list.length; i++) { //3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
            String s = reader.readLine();
            list[i] = s;
        }
        for (int i = 0; i < list.length; i++) { //4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
            secondList[i] = list[i].length();
            System.out.println(secondList[i]); //. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
        }


    }

    public void intArrayInReverseOrder() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        int[] list = new int[10]; //1. Создать массив на 10 чисел.
        for (int i = 0; i < list.length; i++) { //2. Ввести с клавиатуры 10 чисел и записать их в массив.
            String s = reader.readLine();
            list[list.length - 1 - i] = Integer.parseInt(s); //3. Расположить элементы массива в обратном порядке.
        }
        for (int i = 0; i < list.length; i++) { //4. Вывести результат на экран, каждое значение выводить с новой строки.
            System.out.println(list[i]);
        }
    }

    public void splitArrayInTwo() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        int[] list = new int[20]; //1. Создать массив на 20 чисел.
        for (int i = 0; i < list.length; i++) { //2. Ввести в него значения с клавиатуры.
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }
        int[] firstSmallArray = new int[10]; //3. Создать два массива на 10 чисел каждый
        int[] secondSmallArray = new int[10];
        for (int i = 0; i < list.length - 10; i++) { //4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький
            firstSmallArray[i] = list[i];
        }
        int j = 0;
        for (int i = 10; i < list.length; i++) { //4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький
            secondSmallArray[j] = list[i];
            j++;
        }
        for (int i = 0; i < secondSmallArray.length; i++) { //5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
            System.out.println(secondSmallArray[i]);
        }
    }

}