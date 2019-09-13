package lesson10.homework;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Customer customer= new Customer("Dima","Киев","Мужской");
        Date date=new Date();

        ElectronicsOrder electronicsOrder=new ElectronicsOrder("Плата",date,"Киев","Киев",340,customer,12);
        electronicsOrder.getGuaranteeMonths();
        electronicsOrder.validateOrder();
        electronicsOrder.calculatePrice();


        FurnitureOrder furnitureOrder= new FurnitureOrder("Зеркало",date,"Киев","Киев",60000,customer,"FF");
        furnitureOrder.getFurnitureCode();
        furnitureOrder.validateOrder();
        furnitureOrder.calculatePrice();

        //Проверка методов
        Customer customercheck= new Customer("Dima","Киев","Мужской");
        System.out.println(customercheck.getName());
        System.out.println( customercheck.getCity());
        System.out.println( customercheck.getGender());


        ElectronicsOrder electronicsOrdercheck=new ElectronicsOrder(null,date,"Киев","Киев",340,customer,12);
        electronicsOrdercheck.getGuaranteeMonths();
        electronicsOrdercheck.validateOrder();
        electronicsOrdercheck.calculatePrice();




    }

}
