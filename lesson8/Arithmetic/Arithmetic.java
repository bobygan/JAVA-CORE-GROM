package lesson8.Arithmetic;

public class Arithmetic {

    boolean check(int[] array) {
        long S;
        int max = -2147483647;
        int min = 2147483647;

        for (int i = array.length - 1; i >=0; i--) {

            if (array[i] >= max) {
                max = array[i];
            }
            if (array[i] <= min) {
                min = array[i];
            }
        }
        S = max+min;
        return ( S > 100) ? true : false;
    }
}









