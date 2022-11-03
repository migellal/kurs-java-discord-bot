package pl.michalgellert.advanced;

import pl.michalgellert.advanced.oop.ComputerModel;

public class ObjectLogic {
    public static void main(String[] args) {
        ComputerModel computerModel1 = new ComputerModel("Apple");
        ComputerModel computerModel2 = new ComputerModel("Apple");

        if(computerModel1 == computerModel2) {
            System.out.println("Te same komputery");
        }
        if(computerModel1.equals(computerModel2)) {
            System.out.println("Takie same komputery");
        }

        System.out.println(computerModel1);
    }
}
