package pl.michalgellert.advanced.oop;

import java.util.Objects;

public class ComputerModel {

    public ComputerModel() {
        amountOfRam = 4;
    }

    public ComputerModel(String name) {
        this();
        this.name = name;
    }
    private String name;
    private int amountOfRam;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAmountOfRam() {
        return amountOfRam;
    }

    public void setAmountOfRam(int amountOfRam) {
        this.amountOfRam = amountOfRam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerModel that = (ComputerModel) o;
        return amountOfRam == that.amountOfRam && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amountOfRam);
    }

    @Override
    public String toString() {
        return "ComputerModel name " + name + ", amount of ram memory: " + amountOfRam + " GB.";
    }
}
