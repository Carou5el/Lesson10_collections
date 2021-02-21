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

        System.out.printf("%s, %n", phoneBook.);
        Iterator iterator = phoneBook.values().iterator();
        while(iterator.hasNext())   {
            String usernameFromBD = (String) iterator.next();
            Integer phoneNumberFromBD = (Integer) phoneBook.
            if(usernameFromBD == nameForSearch) {
                System.out.printf("%s, %d\n", usernameFromBD, );
            }
        }

    }

    public void show()  {

        Iterator iterator = phoneBook.keySet().iterator();

        while(iterator.hasNext())   {

            Integer phoneNumber = (Integer) iterator.next();
            String phoneName = (String) phoneBook.get(phoneNumber);

            System.out.printf("%d\t%s\n", phoneNumber, phoneName);
        }

    }
}
