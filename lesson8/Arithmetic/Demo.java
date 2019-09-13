package lesson8.Arithmetic;

public class Demo {
    public static void main(String[] args) {
        int[] arrey = {-10, 0, 100, 110, 5, 10, -45, 0, 60, 10};

        Adder adder = new Adder();
        adder.add(3, 4);
        adder.check(arrey);
        System.out.println(adder.add(3, 4));
        System.out.println(adder.check(arrey));


    }
}
