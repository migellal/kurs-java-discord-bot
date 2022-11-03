package pl.michalgellert.basic;
// tu jest komentarz

/* tu komentarz
się zaczyna,
a tu się kończy
 */
/** to jest kawałek dokumentacji */
public class Variables {
    public static void main(String[] args) {
        System.out.println("To jest tekst");

        int age;
        age = 30;

        short height = 180;

        byte minByte = -128;
        byte maxByte = 127;
        short minShort = -32768;
        short maxShort = 32767;
        int minInt = -2147483648;
        int maxInt = 2147483647;

        long minLong = -9223372036854775808L;
        long maxLong = 9223372036854775807L;

//        byte b = 130;

        float f = 1.12345F;
        double d = 1.1234567890;

        boolean bool = true;
        char c = 'A';

        String str = "Jestem napisem!";

        System.out.println(str);
        System.out.println(str + " " + f);

        int a = 7;
        int sum = a + 2;
        System.out.println(sum);

        int subtract = sum - 4;
        int multiply = 2 * 5;
        double division = 2.1 / 0.5;
        int modulo = 21 % 5;

        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(division);
        System.out.println(modulo);

        int arr[] = new int[50];

        System.out.println(arr[25]);
        arr[25] = 7;
        System.out.println(arr[25]);

        String[] arr2 = new String[10];
//        System.out.println(arr2[10]);

        System.out.println(arr2[0]);

        char[] array = new char[]{'a','b','c'};
        System.out.println(array[1]);
        array[2] = 'z';
        System.out.println(array[2]);

        String s1 = "napis";
        var s2 = "napis";

        System.out.println(s1);
        System.out.println(s2);
    }
}
