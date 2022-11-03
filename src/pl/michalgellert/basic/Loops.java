package pl.michalgellert.basic;

public class Loops {

    public static void main(String[] args) {
        int numbers[] = new int[]{3,6,2,9,3,0,5,3,8,5};
        for (int i = 0; i<5; i++) {
            System.out.println("Nie zgadzam się po raz: " + i);
        }
        for (int i = 0; i<numbers.length; i++) {
            System.out.println("index: " + i + " value: " + numbers[i]);
        }
        for (int number : numbers) {
            System.out.println(number);
        }

        boolean b = true;
        int index = 0;
        while(b) {
            System.out.println("while: " + numbers[index]);
            b = numbers[index] != 0;
            index++;
        }

        do {
            System.out.println("do while");
        } while(1>2);

        String[][] fields = {{"a1", "a2", "a3"},{"b1","b2","b3"},{"c1","c2","c3"}};

        for (int i = 0; i< fields.length; i++) {
            System.out.println("tab: " + i);
            for (int j = 0; j < fields[i].length; j++) {
                System.out.println("val: " + fields[i][j]);
            }
        }
    }
}
