package generics.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import static com.sun.javafx.fxml.expression.Expression.add;

public class ArrayListCollections {

    public void fiveStringsInArray() { //5 различных строчек в списке
        List<String> list = new ArrayList<String>();
        list.add("Пара");
        list.add("Строк");
        list.add("Для");
        list.add("Выполнения");
        list.add("Задания");
        System.out.println("Размер списка = " + list.size());

        for (String text : list) {
            System.out.println(text);
        }
    }

    public void longestStringInArray() throws IOException { //8. Самая длинная строка
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        List<String> list = new ArrayList<String>();
        int i = 0;
        while (i < 5) {
            String s = reader.readLine();
            list.add(s);
            i++;
        }
        int longest = 0;
        String word = "";
        for (String text : list) {
            if (text.length() > longest) {
                longest = text.length();
                word = text;
            }
        }
        System.out.println("Самая длинная строка: " + word);
        String anotherWord = "";
        for (String text : list) {
            if (text.length() == longest && !(text.equals(word))) {
                anotherWord = text;
                System.out.println("Еще одна самая длинная строка: " + anotherWord);
            }
        }
    }

    public void shortestStringInArray() throws IOException { //9. Самая короткая строка
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        List<String> list = new ArrayList<String>();
        int i = 0;
        while (i < 5) {
            String s = reader.readLine();
            list.add(s);
            i++;
        }
        int shortest = 100;
        String word = "";
        for (String text : list) {
            if (text.length() < shortest) {
                shortest = text.length();
                word = text;
            }
        }
        System.out.println("Самая короткая строка: " + word);
        String anotherWord = "";
        for (String text : list) {
            if (text.length() == shortest && !(text.equals(word))) {
                anotherWord = text;
                System.out.println("Еще одна самая короткая строка: " + anotherWord);
            }
        }
    }

    public void addStringInToBeginingOfList() throws IOException { //10. 10 строчек в начало списка
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        List<String> list = new ArrayList<String>();
        int i = 0;
        while (i < 10) {
            String s = reader.readLine();
            list.add(0, s);
            i++;
        }
        for (String text : list) {
            System.out.println(text);
        }
    }

    public void removeLastStringAndAddItToBegining() throws IOException { //11. Удали последнюю строку и вставь её в начало
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        List<String> list = new ArrayList<String>();
        int i = 0;
        while (i < 5) {
            String s = reader.readLine();
            list.add(s);
            i++;
        }
        i = 0;
        String lastToFirst = "";
        while (i < 13) {
            lastToFirst = list.get(4);
            list.remove(4);
            list.add(0, lastToFirst);
            i++;
        }
        for (String text : list) {
            System.out.println(text);
        }
    }
}
