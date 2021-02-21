package kulkov.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

/**
 * Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
 * Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
 * Посчитать, сколько раз встречается каждое слово.
 */
public class CollectionExample {
    private final static String[] initialTestArray = {"cat", "dog", "cow", "bull", "horse", "bird",
            "swift", "panter", "lion", "giraffe", "owl"};
    private final static ArrayList<String> testArray = new ArrayList<String>(initialTestArray.length);

    public CollectionExample() {
        // Копирую в ArrayList данные из String[].
        testArray.addAll(Arrays.asList(initialTestArray));

        // Для подсчёта повторов отдельных элементов массива использую Collections.frequency().
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < testArray.size(); i++) {
            map.put(testArray.get(i), Collections.frequency(testArray, testArray.get(i)));
        }
    }
}
