package lesson22.homework2;

import java.util.Arrays;
import java.util.Date;

import static lesson22.homework2.TransactionType.INCOME;
import static lesson22.homework2.TransactionType.OUTCOME;


public class Demo {
    public static void main(String[] args) {

        Date date = new Date();
        Transaction transaction1 = new Transaction(12, "Kiev", 23, "wrwr", INCOME, date);
        Transaction transaction2 = new Transaction(13, "Kiev", 20, "wrwr", OUTCOME, date);
        Transaction transaction3 = new Transaction(14, "Kiev", 20000, "wrwr", INCOME, date);


        //  TransactionDAO transactionDAO = new TransactionDAO();
        Controller controller = new Controller();
        try {
            TransactionDAO.save(transaction1);
            TransactionDAO.save(transaction2);
            TransactionDAO.save(transaction3);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //  catch(InternalServerException e){
        //     System.out.println(e.getMessage());
        // }


        System.out.println(Arrays.deepToString(TransactionDAO.transactionList()));
        System.out.println(Arrays.deepToString(TransactionDAO.transactionList(23)));
        System.out.println(Arrays.deepToString(TransactionDAO.transactionList("Kiev")));
    }
}
