package lesson22.homework2;

import lesson20.task2.exсeptions.BadRequestException;
import lesson20.task2.exсeptions.InternalServerException;
import lesson20.task2.exсeptions.LimitExceeded;

import java.util.Calendar;
import java.util.Date;

public class TransactionDAO {
    private static Transaction transactions[] = new Transaction[10];
    private static Utils utils = new Utils();


    public static Transaction save(Transaction transaction) throws Exception {

        validate(transaction);

        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] == null) {
                transactions[i] = transaction;
                return transactions[i];
            }
        }
        throw new InternalServerException("");
    }

    public static Transaction[] transactionList() {
        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                count++;
            }
        }

        Transaction[] result = new Transaction[count];
        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                result[index] = transaction;
                index++;
            }
        }
        return result;
    }

    public static Transaction[] transactionList(String city) {
        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null && transaction.getCity().equals(city)) {
                count++;
            }
        }
        Transaction[] result = new Transaction[count];
        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null && transaction.getCity().equals(city)) {
                result[index] = transaction;
                index++;
            }
        }
        return result;

    }


    public static Transaction[] transactionList(int amount) {
        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null && transaction.getAmount() == amount) {
                count++;
            }
        }
        Transaction[] result = new Transaction[count];
        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null && transaction.getAmount() == amount) {
                result[index] = transaction;
                index++;
            }
        }
        return result;
    }


    private static boolean validate(Transaction transaction) throws BadRequestException, InternalServerException {

        if (transaction.getAmount() > utils.getLimitSimpleTransactionAmount())
            throw new LimitExceeded("Transaction limit exceed " + transaction.getId() + " cant be saved");

        int sum = 0;
        int count = 0;
        for (Transaction tr : getTransactionPerDay(transaction.getDateCreated())) {
            sum += tr.getAmount();
            count++;
        }

        if (sum + transaction.getAmount() > utils.getLimitTransactionsPerDayAmount()) {
            throw new LimitExceeded("Transaction limit pre day exceed " + transaction.getId() + " cant be saved");
        }

        if (count + 1 > utils.getLimitTransactionsPerDayCount()) {
            throw new LimitExceeded("Transaction limit pre day count exceed " + transaction.getId() + " cant be saved");
        }

        if (cityCheck(transaction)) {
            throw new BadRequestException("Transaction do not support this city " + transaction.getId() + " cant be saved");
        }

        if (freeSpaceCheck()) {
            throw new InternalServerException("Not enough space Transaction " + transaction.getId() + " cant be saved");
        }
        return true;
    }


    private static boolean cityCheck(Transaction transaction) {
        for (String cities : utils.getCities()) {
            if (cities.equals(transaction.getCity())) {
                return false;
            }
        }
        return true;
    }

    private static boolean freeSpaceCheck() {
        for (Transaction transaction : transactions) {
            if (transaction == null) {
                return false;
            }
        }
        return true;
    }


    private static Transaction[] getTransactionPerDay(Date dateOfCurTransaction) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateOfCurTransaction);

        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                calendar.setTime(transaction.getDateCreated());
                int trMonth = calendar.get(Calendar.MONTH);
                int trDay = calendar.get(Calendar.DAY_OF_MONTH);
                if (trMonth == month && trDay == day)
                    count++;
            }
        }

        Transaction[] result = new Transaction[count];
        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                calendar.setTime(transaction.getDateCreated());
                int trMonth = calendar.get(Calendar.MONTH);
                int trDay = calendar.get(Calendar.DAY_OF_MONTH);
                if (trMonth == month && trDay == day) {
                    result[index] = transaction;
                    index++;
                }
            }
        }
        return result;
    }


}