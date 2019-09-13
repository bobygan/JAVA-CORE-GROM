package lesson4;

public class method {

    public static void main(String[] args) {

        short a=3,b=7;

        System.out.println(findDivCount(a,b,2));
    }

    public  static  String concat(String a,String b,String c){
return a+b+c;
    }
    public static  int findDivCount(short a, short b, int n){
        int count=0;
        for(short i=a; i<=b; i++) {
            if (i % n == 0) {
                count++;
            }
        }
        return  count;
    }
}
