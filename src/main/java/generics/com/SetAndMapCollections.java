package generics.com;


import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;

public class SetAndMapCollections {
    public void twentyWordsStartsWithL() { //12. Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
        String[] array = {"Линия", "Лень", "Любовь", "Ленин", "Лазанья", "Либидо", "Лайка", "Лейка", "Линейка", "Лазейка", "Ламбадо", "Ленинград", "Лицо", "Лань", "Лодка", "Ленка", "Линька", "Лампа", "Ладан", "Лацкан"};

        Set<String> set = new HashSet<String>();
        Collections.addAll(set, array);

        for (String text : set) {
            System.out.println(text);
        }
    }

    public void setWithTwentyNumbers() {//13. Создать множество чисел(Set<Integer>), занести туда 20 различных чисел. Удалить из множества все числа больше 10.
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Set<Integer> set = new HashSet<Integer>();
        Collections.addAll(set, array);
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number > 10) {
                iterator.remove();
            } else {
                System.out.println(number);
            }
        }
    }

    public void mapWithNames() {//14 и 17. Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя». Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
        Map<String, String> map = new HashMap<String, String>();
        map.put("Петров", "Петр");
        map.put("Иванов", "Иван");
        map.put("Андрющенко", "Андрей");
        map.put("Васильев", "Василий");
        map.put("Петров", "Иван");
        map.put("Сергеев", "Петр");
        map.put("Сидоров", "Петр");
        map.put("Кириллов", "Кирилл");
        map.put("Валерьев", "Валерий");
        map.put("Юрьев", "Юрий");
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) { //Поскольку если записывать в key одно и тоже значение, то оно будет только переписывать предыдущее такое же значение, то проверку провожу по имени
            String value = pair.getValue();
            if (value.equals("Петр")) {
                count++;
            }
        }
        System.out.println("Людей с именем Петр в списке: " + count);
    }

    public void birthdaysOfPeople() { //15. Создать словарь (Map<String, LocalDate>) и занести в него десять записей по принципу: «фамилия» - «дата рождения». Удалить из словаря всех людей, родившихся летом.
        Map<String, LocalDate> map = new HashMap<String, LocalDate>();
        map.put("Петров", LocalDate.of(1990, 6, 5));
        map.put("Иванов", LocalDate.of(1991, 2, 3));
        map.put("Андрющенко", LocalDate.of(1992, 3, 6));
        map.put("Васильев", LocalDate.of(1993, 4, 7));
        map.put("Сергеев", LocalDate.of(1994, 5, 22));
        map.put("Сидоров", LocalDate.of(1995, 6, 14));
        map.put("Кириллов", LocalDate.of(1996, 7, 16));
        map.put("Валерьев", LocalDate.of(1997, 8, 6));
        map.put("Киркоров", LocalDate.of(1998, 9, 8));
        map.put("Юрьев", LocalDate.of(1999, 10, 9));

        Iterator<Map.Entry<String, LocalDate>> iterator = map.entrySet().iterator();


        while (iterator.hasNext()) {
            Map.Entry<String, LocalDate> pair = iterator.next();
            int value = pair.getValue().getMonth().getValue();
            if (value >= 6 && value <= 8) {
                iterator.remove();
            } else {
                String key = pair.getKey();
                LocalDate date = pair.getValue();
                System.out.println("Этот человек родился не летом: " + key + " " + date);
            }
        }

    }

    public void removeEqualNames() { //16. Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя». Удалить людей, имеющих одинаковые имена.
        Map<String, String> map = new HashMap<String, String>();
        map.put("Сукачев", "Петр");
        map.put("Иванов", "Иван");
        map.put("Андрющенко", "Андрей");
        map.put("Васильев", "Василий");
        map.put("Петров", "Иван");
        map.put("Сергеев", "Петр");
        map.put("Сидоров", "Петр");
        map.put("Кириллов", "Кирилл");
        map.put("Валерьев", "Валерий");
        map.put("Юрьев", "Юрий");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        String[] namesToRemove = new String[5];
        int i = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String name = pair.getValue();
            int count = 0;
            for (Map.Entry<String, String> pair2 : map.entrySet()) { //находим повторяющиеся имена
                String value = pair2.getValue();
                if (value.equals(name)) {
                    count++;
                }
            }
            if (count >= 2) { //если имя повторяется, записываем в массив ключ
                String lastName = pair.getKey();
                namesToRemove[i] = lastName;
                i++;
            }
        }
        i = 0;
        while (namesToRemove.length > i) { //удаляем по ключу все повторяющиеся имена
            if (map.containsKey(namesToRemove[i])) {
                map.remove(namesToRemove[i]);
            }
            i++;
        }


    }
}