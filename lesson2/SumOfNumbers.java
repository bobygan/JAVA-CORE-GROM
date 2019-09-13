package lesson2;

public class SumOfNumbers {


    public static void main(String[] args) {
    long i=0;
    long sum = 0;
        while (i<=10000000){
            sum=sum+i;
            i++;


        }
        System.out.println(sum);
    }
}