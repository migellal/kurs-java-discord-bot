package pl.michalgellert.advanced.inheritance;

/*
Modifier        Class     Package   Subclass  World
public          Y         Y         Y         Y
protected       Y         Y         Y         N
no modifier     Y         Y         N         N
private         Y         N         N         N
 */

public abstract class InputField {
    public static final String FIELD_TYPE = "Input";
    private final int id;
    private String name;
    private String value;

    public InputField(int id) {
        this.id = id;
    }

    public abstract void printFieldInfo();

    public final void setName(String name) {
        this.name = name;
    }

    protected void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
