package lesson5;

import java.util.Arrays;

public class unique {
    public static void main(String[] args) {
        int[] array = { 1,2,3,4,4};
      System.out.println(uniqueCount(array));
        System.out.println(Arrays.toString(array));
    }


    public static int uniqueCount(int[] array){
        array=Ascending(array); //упорядочил массив по возростанию
              if  (array[0] == array[ array.length - 1]){
                  return 1;
              }
       int prev=array[0],count=1;
            for (int i=1;i<array.length;i++) {

                if (array[i] != prev){
                  prev=array[i];
                  count++;
                }
            }
        return count;
    }

    public static int[] Ascending(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }
}
