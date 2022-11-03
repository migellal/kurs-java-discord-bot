package pl.michalgellert.basic;

import pl.michalgellert.advanced.util.StringUtil;

public class FunWithString {
    public static void main(String[] args) {
        String str = "Ala ma kota";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.startsWith("a"));
        System.out.println(str.endsWith("a"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.charAt(1));
        String[] strings = str.split(" ");
        char[] chars = str.toCharArray();
        System.out.println(str.substring(3, 6));
        System.out.println(str.contains("ala"));
        System.out.println(str.equals("ala ma kota"));
        System.out.println(str.equalsIgnoreCase("ala ma kota"));

        String string = StringUtil.concatenateChars(new char[1000000]);
        System.out.println(string);
    }
}
