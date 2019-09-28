package lesson25.homework2;


import lesson25.homework2.exсeptions.BadRequestException;
import lesson25.homework2.exсeptions.InternalServerException;


public class GeneralDAO  <T> {

    private T[] array = (T[]) new Object[10];

    public T[] getAll() {
        int count = 0;
        for (T el : array) {
            if (el != null) {
                count++;
            }
        }
        T result[] = (T[]) new Object[count];

        int index = 0;
        for (T el : array) {
            if (el != null) {
                result[index] = el;
                index++;
            }
        }
        return result;
    }

    public T save(T t) throws Exception {
        validate(t);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = t;
                return array[i];
            }
        }
        throw new InternalServerException("");
    }




    private boolean  validate(T t) throws BadRequestException, InternalServerException {

        if (t == null) {
            throw new BadRequestException("Cant save null");
        }

        //  if (CheckId (t)) {
        //    throw new BadRequestException("Object with id " + t.getId() +" already in the array");
        //}

        if (freeSpaceCheck()) {
            throw new InternalServerException("Not enough space " + "file" + " cant be saved");
        }
        return true;
    }


    //   private  boolean CheckId(T t ) {
    //    int i = 0;
    //  for (i=0; i< array.length;i++ ) {
    //    if (array[i].getId()==t.getId()) {
    //      return true;
    // }
    // }
    // return false;
    //}

    private boolean freeSpaceCheck() {
        for (T el : array) {
            if (el == null) {
                return false;
            }
        }
        return true;
    }

}
