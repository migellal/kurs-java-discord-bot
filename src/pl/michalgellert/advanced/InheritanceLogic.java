package pl.michalgellert.advanced;

import pl.michalgellert.advanced.inheritance.NumberInputField;
import pl.michalgellert.advanced.inheritance.TextInputField;

public class InheritanceLogic {
    public static void main(String[] args) {
        TextInputField textInputField = new TextInputField(0);
        textInputField.setName("pole tekstowe 1");
        textInputField.enterData("napis 1");
        NumberInputField numberInputField = new NumberInputField(1);
        numberInputField.setName("pole numeryczne 1");
        numberInputField.enterData(111);

        System.out.println(textInputField.getId());
        System.out.println(textInputField.getName());
        System.out.println(textInputField.getValue());
        System.out.println(numberInputField.getId());
        System.out.println(numberInputField.getName());
        System.out.println(numberInputField.getValue());
        System.out.println(numberInputField.isEven());
        textInputField.printFieldInfo();

//        InputField inputField = new InputField(5);
    }
}
