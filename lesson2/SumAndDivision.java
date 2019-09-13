package lesson2;

public class SumAndDivision {
    public static void main(String[] args) {
        long i = 0;
        long sum = 0;
        while (i <= 1000) {
            sum = sum + i;
            i++;
        }
        long c1 = sum / 1234;
        long c2 = sum % 1234;

        while (c1 > c2) {
            System.out.println(true);
            break;
        }
        while (c2 > c1) {
            System.out.println(false);
            break;
        }
    }
}
