package kulkov.example;

import java.util.*;

/**
 *
 */
public class Main {

    // Статичный массив, выяснить наличие и количество повторяющихся элементов в нём.
    private static ArrayList<String> list = new ArrayList<>(
                        Arrays.asList("cat", "dog", "dog", "cow", "bull",
                                        "horse", "bird", "swift",
                                        "panter", "lion", "giraffe", "owl"));

    public static void main(String[] args) {

        // Для выяснения повторяющихся элементов использую Map.
        Map<String, Integer> map = new HashMap<>();

        // Заполнение коллекции ключ-значение.
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), Collections.frequency(list, list.get(i)));
        }

        System.out.printf("Уникальные значения.\n");
        // Вывод уникальных пар.
        Iterator iterator = map.keySet().iterator();
        while(iterator.hasNext()) {

            String key = (String) iterator.next();
            Integer value = (Integer) map.get(key);

            if(value > 1)    {
//                System.out.printf("Unique!\t[%d, %s]\n", value, key);
                continue;
            }
            System.out.printf("[%d, %s]\n", value, key);
        }

        System.out.printf("Количество вхождений каждого слова.\n");

        Iterator iterator1 = map.keySet().iterator();

        while (iterator.hasNext())  {
            String key = (String) iterator.next();
            Integer value = (Integer) map.get(key);

            System.out.printf("[%d, %s]\n", value, key);

        }



    }
}
