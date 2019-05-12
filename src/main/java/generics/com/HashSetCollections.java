package generics.com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSetCollections {

    public void hashSetWithPlants() {
        Set<String> set = new HashSet<String>(); //Создать коллекцию HashSet с типом элементов String.

        set.add("арбуз"); //Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("жень-шень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        //получение итератора для множества

        for (String text : set) { //Вывести содержимое коллекции на экран, каждый элемент с новой строки.
            System.out.println(text);
        }

    }

    public void hashMapTenPairs() {
        Map<String, String> map = new HashMap<String, String>(); //Создать коллекцию HashMap<String, String>, занести туда 10 пар строк: арбуз – ягода, банан – трава, вишня – ягода,
        // груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        for (Map.Entry<String, String> pair : map.entrySet()) { //Вывести содержимое коллекции на экран, каждый элемент с новой строки.
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }


    }

    public static class Cat { //Есть класс Cat, с полем имя (name, String).
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {

            return name != null ? name.toUpperCase() : null;
        }
    }

    public static HashMap<String, Cat> addCatsToMap(String[] cats) {
        HashMap<String, Cat> addCats = new HashMap<String, Cat>(); //Создать коллекцию HashMap<String, Cat>.
        for (String s : cats) { //Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
            addCats.put(s, new Cat(s));
        }
        return addCats;
    }

    public void hashMapCats() { //Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
        String[] cats = new String[]{"Пушок", "Снежок", "Дружок", "Пирожок", "Дымок", "Барсик", "Мурзик", "Борис", "Чешир", "Котзилла"};
        Map<String, Cat> set = addCatsToMap(cats);
        for (Map.Entry<String, Cat> pair : set.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }

    }
    public void hashMapObject(){ //Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("Sim", 5);
        map.put("Clon", true);
        map.put("Fate", false);
        map.put("Baby", null);
        map.put("Keyboard", "Cat");
        map.put("Eat", 44);
        map.put("Food", 345);
        map.put("Relax", "643");
        map.put("Fast", 111111111111L);
        map.put("Slow", (double)123);

        for (Map.Entry<String, Object> pair : map.entrySet()) //Вывести содержимое коллекции на экран, каждый элемент с новой строки.
        {
            String key = pair.getKey();
            Object value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
    }
