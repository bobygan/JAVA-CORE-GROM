package Lesson19;

public class ThrowExample {
    private static String[] array = {"test", "test1", null, "adidas"};

    public static void main(String[] args) {
        useOfTestMethod();


    }

    private static void test() {
        for (String element : array) {
            if (element == null)
                throw new RuntimeException("null id detected");
        }
        System.out.println("done");
    }

    private static void useOfTestMethod() {
        try {
            test();
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }

}
