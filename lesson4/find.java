package lesson4;

public class find {
    public static void main(String[] args) {
        System.out.println(findDivCount((short) 2, (short) 9, 2));
    }

    public static short findDivCount(short a, short b, int n) {
        short count = 0;

        for (short i = a; i <= b; i++) {
            if ((i % n) == 0) {
                count++;
            }
        }
        return count;
    }
}
