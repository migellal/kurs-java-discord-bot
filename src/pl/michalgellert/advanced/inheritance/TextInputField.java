package pl.michalgellert.advanced.inheritance;

public final class TextInputField extends InputField implements EnterData<String>, Comparable<TextInputField>{
    public TextInputField(int id) {
        super(id);
    }

    @Override
    public void enterData(String value) {
        setValue(value);
    }

    @Override
    public void printFieldInfo() {
        System.out.println("Wejście tekstowe");
    }

//    @Override
//    public void setName(String name) {
//        super.setName(name);
//    }


    @Override
    public String toString() {
        return "TextInputField" + getId();
    }

    @Override
    public int compareTo(TextInputField o) {
        return Integer.compare(getId(), o.getId());
    }
}
