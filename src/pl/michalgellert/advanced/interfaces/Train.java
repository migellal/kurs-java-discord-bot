package pl.michalgellert.advanced.interfaces;

public class Train implements Driveable{
    @Override
    public void drive() {
        System.out.println("Ciuch, ciuch");
    }

    @Override
    public void stop() {
        System.out.println("Hamowanie trwa długo...");
    }
}
