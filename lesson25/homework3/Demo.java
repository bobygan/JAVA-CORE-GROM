package lesson25.homework3;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws Exception {


        GeneralDAO<Integer> IntegerDAO = new GeneralDAO<>();
         GeneralDAO<String> StringDAO = new GeneralDAO<>();
        //   GeneralDAO<Tool> ToolDAO = new GeneralDAO<>();
        //    GeneralDAO<TestClass> TestDAO = new GeneralDAO<>();


        IntegerDAO.save(new Integer(34));
        System.out.println(Arrays.deepToString(IntegerDAO.getAll()));

        StringDAO.save(new String("ANDRII"));
        System.out.println(Arrays.deepToString(StringDAO.getAll()));

    }
}


