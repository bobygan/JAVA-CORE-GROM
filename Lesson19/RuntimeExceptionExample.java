package Lesson19;

public class RuntimeExceptionExample {
    public static void main(String[] args) {

        try {
            arihmeticExeption(2);
            arihmeticExeption(0);
        } catch (ArithmeticException e){
            System.out.println("somethin wrong");
        }

        npe(new Object());
        npe(null);
    }



    private static void arihmeticExeption(int a){
        System.out.println(10/a);
    }

    private static void npe (Object object){
        if(object!=null){
        System.out.println(object.hashCode());
    }
        else {

        }
    }
}
