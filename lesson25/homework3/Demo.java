package lesson25.homework3;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws Exception {


        GeneralDAO<Order> OrderDAO = new GeneralDAO<>();
        GeneralDAO<String> StrimgDAO = new GeneralDAO<>();
        GeneralDAO<Tool> ToolDAO = new GeneralDAO<>();
        GeneralDAO<TestClass> TestDAO = new GeneralDAO<>();


        OrderDAO.save(new Order(34));
        System.out.println(Arrays.deepToString(OrderDAO.getAll()));


    }

}


