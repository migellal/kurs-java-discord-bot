package pl.michalgellert.basic;

import java.util.Scanner;

public class ConditionalStatements {

    public static void main(String[] args) {
        String str = null;
        if(str == null) {
            System.out.println("Napis bez wątpienia jest nullem");
        }
        if(str!=null) {
            System.out.println("Napis głosi: " + str);
        }

        boolean f = !true;
        boolean a = str != null;
        System.out.println(f);
        System.out.println(a);

        if(str == null && f) {
            System.out.println("and");
        }
        if(str == null || f) {
            System.out.println("or1");
        }
        if(f || str == null) {
            System.out.println("or2");
        }

        if(f) {
            System.out.println("f jest prawdą");
        } else {
            System.out.println("f jest fałszywa");
        }

        if(f) {
            System.out.println("f jest prawdą");
        }
        else if(str == null) {
            System.out.println("str to null, a f nie obchodzi mnie tu");
        }
        else if(true) {
            System.out.println("true");
        }
        else {
            System.out.println("f jest fałszywa");
        }

        int t = 0;
        if(t == 0) {
            System.out.println("zero");
        }
        else if(t == 1) {
            System.out.println("jeden");
        }
        else if(t == 2) {
            System.out.println("dwa");
        }
        else {
            System.out.println("albo nie wiem");
        }

        switch (t) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("jeden");
                break;
            case 2:
                System.out.println("dwa");
                break;
            default:
                System.out.println("no to nie wiem");
        }

        Scanner scanner = new Scanner(System.in);
        int selected = scanner.nextInt();
        System.out.println(selected);

        switch (selected) {
            case 0 -> System.out.println("zero");
            case 1 -> System.out.println("jeden");
            case 2 -> System.out.println("dwa");
            default -> System.out.println("no to nie wiem");
        }

        boolean even = switch (selected) {
            case 0 -> {
                System.out.println("zero");
                yield true;
            }
            case 1 -> {
                System.out.println("jeden");
                yield false;
            }
            case 2 -> {
                System.out.println("dwa");
                yield true;
            }
            default -> {
                System.out.println("no to nie wiem");
                yield selected % 2 == 0;
            }
        };
        System.out.println(even);
        System.out.println("Liczba " + selected + " jest " + (even ? "parzysta" : "nieparzysta"));
    }
}
