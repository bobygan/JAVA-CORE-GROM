package lesson5;

import java.util.Arrays;

public class unique02 {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 2};
        System.out.println(uniqueCount(array));
        System.out.println(Arrays.toString(array));
    }


    public static int uniqueCount(int[] array){

            int[] copy = new int[array.length];
            int res = 0;
            int countNum = 0;
            int count = 0;

            // обнуляем память
            for (int i = 0; i <copy.length ; i++) { copy[i] = 0; }

            for (int i = 0; i < array.length; i++) {


                if (copy[i]==0){
                    for (int j = 0; j < array.length; j++) {
                        if (array[i]==array[j]){  copy[j] = 1; count++; }
                    }
                }

                if (countNum<count){
                    countNum = count;
                    res++;
                }

            }
            return res;
        }
    }