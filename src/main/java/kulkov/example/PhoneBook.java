package kulkov.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {

    private Map<Integer, String> phoneBook = new HashMap<>();

    // Methods.
    public void add(String name, Integer number)   {

        phoneBook.put(number, name);
    }

    public void get(String nameForSearch)   {

        Iterator iterator = phoneBook.keySet().iterator();

        while(iterator.hasNext())   {

            Integer phoneNumber = (Integer) iterator.next();
            String phoneName = (String) phoneBook.get(phoneNumber);

            if(phoneName.equals(nameForSearch)) {
                System.out.printf("%s, %d\n", phoneName, phoneNumber);
            }
        }

    }

    public void show()  {

        Iterator iterator = phoneBook.keySet().iterator();

        while(iterator.hasNext())   {

            Integer phoneNumber = (Integer) iterator.next();
            String phoneName = (String) phoneBook.get(phoneNumber);

            System.out.printf("%s\t%d\n", phoneName, phoneNumber);
        }

    }
}
