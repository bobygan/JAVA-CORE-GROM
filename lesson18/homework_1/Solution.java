package lesson18.homework_1;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(stringToInt("3 hkj 5 11 hbnbj ewdw eww11")));



    }

    public static int[] stringToInt(String input) {
        if (input == null) {
            return null;
        }
        String[] words = input.split(" ");

        int[] res = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            try {
                res[i] = Integer.parseInt(words[i]);
            } catch (Exception e) {
                System.out.println("not a number");
            }
        }
        return res;
    }
}
