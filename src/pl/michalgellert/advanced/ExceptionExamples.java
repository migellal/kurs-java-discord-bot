package pl.michalgellert.advanced;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExamples {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            System.out.println(5 / i);
        } catch (InputMismatchException e) {
            System.err.println("Doszło do zdarzenia niespodziewanego i coś zepsuło się");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.err.println("Nie dzieli się przez zero");
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally zawsze działa");
        }

        throw new ArrayIndexOutOfBoundsException("Tablica się nie teguje");
    }
}
