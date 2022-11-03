package pl.michalgellert.advanced;

import pl.michalgellert.advanced.interfaces.Car;
import pl.michalgellert.advanced.interfaces.Driveable;
import pl.michalgellert.advanced.interfaces.Train;

public class InterfaceLogic {

    public static void main(String[] args) {
        Car car = new Car();
        Train train = new Train();
        Driveable bike = () -> System.out.println("Dzyń, dzyń");

        justDrive(car, train, bike);
    }

    public static void justDrive(Driveable... driveableArray) {
        for(Driveable driveable : driveableArray) {
            System.out.println(driveable.getClass());
            driveable.drive();
            driveable.stop();
        }
    }
}
