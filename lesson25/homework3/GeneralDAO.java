package lesson25.homework3;

public  class GeneralDAO  <T> {

    private  T[] array = (T[]) new Object[10];

    public T[] getAll() {
        return array;
    }

    public T save(T t)  throws Exception {
        validate(t);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = t;
                return array[i];
            }
        }
        throw new Exception("");
    }

  private boolean  validate(T t) throws Exception {

        if (t == null) {
            throw new Exception("Cant save null");
        }

        if (freeSpaceCheck()) {
             throw new Exception("Not enough space " + "file" + " cant be saved");
        }
        return true;
    }

    private boolean freeSpaceCheck() {
        for (T el : array) {
            if (el == null) {
                return false;
            }
        }
        return true;
    }

}
