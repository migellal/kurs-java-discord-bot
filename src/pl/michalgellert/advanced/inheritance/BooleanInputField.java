package pl.michalgellert.advanced.inheritance;

public class BooleanInputField extends InputField implements EnterData<Boolean> {
    public BooleanInputField(int id) {
        super(id);
    }

    @Override
    public void enterData(Boolean aBoolean) {
        setValue("" + aBoolean);
    }

    @Override
    public void printFieldInfo() {
        System.out.println("Jestem wejściem logicznym");
    }
}
