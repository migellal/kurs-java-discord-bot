package pl.michalgellert.basic;

public class Methods {

    public static void main(String[] args) {
        printName("Basia");
        printName("Krzysiek");
        printName("Kuba");
        int count1 = countA(new char[]{'a','A','z','B','a'});
        int count2 = countA(new char[]{'z','B','x'});
        int count3 = countA(new char[]{' '});
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        printNameAndAge("Michał", 30);
        printNameAndAge("Krystian", 1);
        printNameAndAge("Jagoda", 3);
    }

    private static void printName(String name) {
        System.out.println("Masz na imię: " + name);
    }

    private static int countA(char[] chars) {
        int count = 0;
        for (char c : chars) {
            if(c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }

    private static void printNameAndAge(String name, int age) {
        String str = "Masz na imię " + name + " i masz ";
        if(age == 1) {
            str += "jeden rok";
        } else if (age<4) {
            str += age + " lata";
        } else {
            str += age + " lat";
        }
        System.out.println(str);
    }
}
