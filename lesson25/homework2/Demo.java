package lesson25.homework2;

import java.util.Arrays;
import java.util.Date;

import static lesson25.homework2.TransactionType.INCOME;
import static lesson25.homework2.TransactionType.OUTCOME;

public class Demo {
    public static void main(String[] args) throws Exception {

          Date date = new Date();
          Transaction transaction1 = new Transaction(12, "Kiev", 23, "wrwr", INCOME, date);
          Transaction transaction2 = new Transaction(13, "Kiev", 20, "wrwr", OUTCOME, date);
          Transaction transaction3 = new Transaction(14, "Kiev", 20000, "wrwr", INCOME, date);


       //   GeneralDAO <Transaction> TransactionDAO=new GeneralDAO<>();
      //   TransactionDAO.save(transaction1);
        //  TransactionDAO.save(transaction2);
       // TransactionDAO.save(transaction1);
       //  TransactionDAO.save(transaction3);
        // System.out.println(Arrays.deepToString(TransactionDAO.getAll()));

        GeneralDAO<Order> OrderDAO = new GeneralDAO<>();
        OrderDAO.save(new Order(34));
        OrderDAO.getAll();

        GeneralDAO<Transaction > StringDAO = new GeneralDAO<>(  );
    }


}

