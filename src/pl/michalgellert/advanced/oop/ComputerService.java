package pl.michalgellert.advanced.oop;

public class ComputerService {

    private ComputerModel computerModel;

    public ComputerService(ComputerModel computerModel) {
        this.computerModel = computerModel;
    }

    public void printComputerInfo() {
        System.out.println("Ten komputer o nazwie " + computerModel.getName() +
                " posiada " + computerModel.getAmountOfRam() + " GB pamięci RAM.");
    }
}
