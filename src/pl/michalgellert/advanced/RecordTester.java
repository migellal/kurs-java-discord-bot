package pl.michalgellert.advanced;

import pl.michalgellert.advanced.records.Drink;

import java.util.Arrays;
import java.util.List;

public class RecordTester {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Water", "Orange");
        List<String> list2 = Arrays.asList("Water", "Orange");

        Drink drink1 = new Drink(100, list1);
        Drink drink2 = new Drink(100, list2);

        System.out.println(drink1.equals(drink2));
        System.out.println(drink1.size());
        System.out.println(drink1.ingredients());
        System.out.println(drink1);

        Drink water = new Drink(250);
        System.out.println(water.ingredients());
    }
}
