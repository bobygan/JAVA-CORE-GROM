package lesson5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FirstArrey {
    public static void main(String[] args) {
        int a;
        a=10;

        int [] firstArray=new int [3];
        firstArray [0]=11;
        firstArray [1]=200;
        firstArray [2]=-10;
       // Sys.out.println(firstArray[0]);
       // Sys.out.println(firstArray[1]);
        //Sys.out.println(firstArray[2]);

        for (int i=0;i<firstArray.length;i++){
            System.out.println(firstArray[i]);
        }
        System.out.println(Arrays.toString(firstArray));

        int []secondArrey={1,10,15,20,-50};
        System.out.println(Arrays.toString(secondArrey));

        for (int element:secondArrey) {
            System.out.println(element);

        }
    }
}
