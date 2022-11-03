package pl.michalgellert.advanced;

import pl.michalgellert.advanced.inheritance.BooleanInputField;
import pl.michalgellert.advanced.inheritance.TextInputField;

import java.util.*;

public class CollectionExamples {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("napis1");
        list.add("napis2");
        list.add("napis3");

        list.remove(1);

        System.out.println(list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);

        System.out.println(set);

        for(String str: list) {
            System.out.println(str);
        }

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "pierwszy");
        map.put(2, "drugi");
        System.out.println(map);

        pl.michalgellert.advanced.mycollection.HashMap myHashMap = new pl.michalgellert.advanced.mycollection.HashMap();

        BooleanInputField booleanInputField = new BooleanInputField(1);
        booleanInputField.enterData(true);

        List<TextInputField> fields = new ArrayList<>();
        fields.add(new TextInputField(2));
        fields.add(new TextInputField(1));
        fields.add(new TextInputField(3));
        System.out.println(fields);

        Collections.sort(fields);
        System.out.println(fields);

        list.add("napis3");
        list.add("napis4");

        List<String> result1 = new ArrayList<>();
        for (String str : list) {
            if (str.startsWith("n") && str.endsWith("3")) {
                result1.add(str);
            }
        }
        System.out.println(result1);

        List<String> result2 = list.stream()
                .filter(s -> s.startsWith("n"))
                .filter(s -> s.endsWith("3"))
                .toList();

        System.out.println(result2);

        List<String> result3 = list.stream()
                .map(String::toUpperCase)
                .toList();

        Optional<String> optional = list.stream()
                .filter(s -> s.startsWith("t"))
                .findAny();

        optional.ifPresent(System.out::println);

    }
}
