package lesson3;

public class FindOdd {
    public static void main(String[] args) {
        int a=0;
        int s=0;
        while (a<1000)
        {
            if(!((a%2)==0)){
                System.out.println("Found");

             s+=a;
            }
          a++;

        }

        if ((s*5)>500) {
            System.out.println("Bigger");
        }
        else{
            System.out.println("Smaller");
        }
    }
}
