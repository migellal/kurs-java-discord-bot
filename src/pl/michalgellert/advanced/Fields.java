package pl.michalgellert.advanced;

import pl.michalgellert.advanced.oop.ComputerModel;
import pl.michalgellert.advanced.oop.ComputerService;
import pl.michalgellert.advanced.util.StringUtil;

public class Fields {

    public static void main(String[] args) {
        ComputerModel computerModel1 = new ComputerModel();
        System.out.println(computerModel1);
        computerModel1.setName("Blaszak");
        computerModel1.setAmountOfRam(32);
        System.out.println(computerModel1.getName());
        System.out.println(computerModel1.getAmountOfRam());

        ComputerModel computerModel2 = new ComputerModel();
        computerModel2.setName("Fujitsu");
        System.out.println(computerModel2.getName());
        System.out.println(computerModel2.getAmountOfRam());

        ComputerModel computerModel3 = new ComputerModel("Huawei");
        System.out.println(computerModel3.getName());
        System.out.println(computerModel3.getAmountOfRam());

        ComputerService computerService = new ComputerService(computerModel1);
        computerService.printComputerInfo();

//        StringUtil stringUtil = new StringUtil();

        String result = StringUtil.concatenateChars(new char[]{'z','a','g','a','d','k','a'});
        System.out.println(result);

        Integer i = 4;
        Double d = 4.5;

    }
}
