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

        // Вывод количества вхождений слов.
        for (int i = 0; i < map.size(); i++) {
            System.out.printf("Key = %d\t", map.get(list.get(i)));
//            System.out.printf("Value = %s\n", map.);
        }
    }
}
