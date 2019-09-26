package lesson25;

import lesson22.homework2.Transaction;
import lesson25.exсeptions.BadRequestException;
import lesson25.exсeptions.InternalServerException;
import lesson25.exсeptions.LimitExceeded;


import java.util.Calendar;
import java.util.Date;

public class GeneralDAO <T>{

    private void print(Order order) {
        System.out.println("order is= " + order.toString());
    }

    public <T extends IdEntity> void validate(T t) throws Exception {
        if (t.getId() < 0) {
            throw new Exception("id can`t be negative");
        }
    }

   // public <K> void validate(K k) {
     //   if (k.equals(100)) {
       //     System.out.println("true");
       // } else {
        ///    System.out.println("false");
       // }

    //}

   // private static Transaction array[] = new Transaction[10];


    private  T[] array = (T[]) new Object[10];

    public   T[] getAll( ) {
            int count = 0;
            for (T el: array) {
                if (el != null) {
                    count++;
                }
            }
                T result[] =(T[]) new Object[count];

            int index = 0;
            for (T el : array) {
                if (el != null) {
                    result[index] = el;
                    index++;
                }
            }
            return result;
        }



    public  T save(T t) throws Exception {

        validate(t);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = t;
                return array[i];
            }
        }
        throw new InternalServerException("");
    }




    private  boolean validate(T t) throws BadRequestException, InternalServerException {

        if (t == null) {
            throw new BadRequestException("Cant save null");
        }

        if (CheckId(t)) {
            throw new BadRequestException("Transaction do not support this city " + transaction.getId() + " cant be saved");
        }

        if (freeSpaceCheck()) {
            throw new InternalServerException("Not enough space " + "file" + " cant be saved");
        }
        return true;
    }




    private  boolean freeSpaceCheck() {
        for (T el :array ) {
            if (el == null) {
                return false;
            }
        }
        return true;
    }




}
