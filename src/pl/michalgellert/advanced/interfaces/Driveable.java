package pl.michalgellert.advanced.interfaces;

public interface Driveable {

    void drive();

    default void stop() {
        System.out.println("stop!");
    }
}
