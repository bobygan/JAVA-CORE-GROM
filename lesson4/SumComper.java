package lesson4;

public class SumComper {
    public static void main(String[] args) {
        System.out.println(compareSums(6,10,2,4));

    }
    public static boolean compareSums(int a, int b, int c, int d){

        return (sum(a,b)>sum(c,d))? true:false;
    }
    public static long sum(int from, int to){
        long s=0;
     for (int i=from; i<=to;i++){
      s+=i;
    }
     return s;
}
}
