package pl.michalgellert.advanced.inheritance;

public class NumberInputField extends InputField implements EnterData<Integer>{
    private int nativeInput;

    public NumberInputField(int id) {
        super(id);
    }

    @Override
    public void printFieldInfo() {
        System.out.println("Wejście numeryczne");
    }

    @Override
    public void enterData(Integer number) {
        this.nativeInput = number;
        setValue(""+number);
    }

    public boolean isEven() {
        return nativeInput%2==0;
    }
}
