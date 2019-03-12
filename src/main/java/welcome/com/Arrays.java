package welcome.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Arrays {
    public static int[] initializeArray() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        int[] list = new int[20];
        for (int i = 0; i < list.length; i++) {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }
        return list;
    }

    public void max(int[] array) {
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
        String[] list = new String[10];
        for (int i = 0; i < list.length - 2; i++) {
            String s = reader.readLine();
            list[i] = s;
        }
        int j = list.length - 1;
        while (list.length >= j) {
            System.out.println(list[j]);
            j--;

        }
    }

    public void createTwoArrays() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        String[] list = new String[10];
        int[] secondList = new int[10];
        for (int i = 0; i < list.length; i++) {
            String s = reader.readLine();
            list[i] = s;
        }
        for (int i = 0; i < list.length; i++) {
            secondList[i] = list[i].length();
            System.out.println(secondList[i]);
        }


    }

    public void intArrayInReverseOrder() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            String s = reader.readLine();
            list[list.length - 1 - i] = Integer.parseInt(s);
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public void splitArrayInTwo() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        int[] list = new int[20];
        for (int i = 0; i < list.length; i++) {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }
        int[] firstSmallArray = new int[10];
        int[] secondSmallArray = new int[10];
        for (int i = 0; i < list.length - 10; i++) {
            firstSmallArray[i] = list[i];
        }
        int j = 0;
        for (int i = 10; i < list.length; i++) {
            secondSmallArray[j] = list[i];
            j++;
        }
        for (int i = 0; i < secondSmallArray.length; i++) {
            System.out.println(secondSmallArray[i]);
        }
    }

}