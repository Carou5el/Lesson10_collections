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

        Task1();


    }

    private static void Task2() {
        Scanner scanner = new Scanner(System.in);
        String userCommand = null;
        PhoneBook phoneBook = new PhoneBook();

        do {
            System.out.printf("Input a command: a(dd), g(et), s(how), q(uit): ");
            userCommand = scanner.nextLine();

            switch (userCommand)    {
                case "a":
                    System.out.printf("Input a user name: ");
                    String name = scanner.nextLine();
                    System.out.printf("Input a user phone number: ");
                    Integer number = scanner.nextInt();

                    phoneBook.add(name, number);

                    break;
                case "g":
                    System.out.printf("Input a user name for search: ");
                    String nameForSearch = scanner.nextLine();
                    phoneBook.get(nameForSearch);
                    break;
                case "s":
                    phoneBook.show();
                    break;
                case "q":
                    return;
            }

        } while(true);


    }

    private static void Task1() {
        // Для выяснения повторяющихся элементов использую Map.
        Map<String, Integer> map = new HashMap<>();

        // Заполнение коллекции ключ-значение.
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), Collections.frequency(list, list.get(i)));
        }

        System.out.printf("Уникальные значения.\n");

        Iterator iterator = map.keySet().iterator();

        while(iterator.hasNext()) {

            String key = (String) iterator.next();
            Integer value = (Integer) map.get(key);

            if(value > 1)    {
                continue;
            }

            System.out.printf("[%d, %s]\n", value, key);
        }

        System.out.printf("Количество вхождений каждого слова.\n");

        Iterator iterator1 = map.keySet().iterator();

        while(iterator1.hasNext())  {

            String key = (String) iterator1.next();
            Integer value = (Integer) map.get(key);

            System.out.printf("[%s, %d]\n", key, value);
        }
    }
}
