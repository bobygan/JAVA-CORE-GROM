package lesson18.homework_2;

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
        boolean error = false;
        for (int i = 0; i < words.length; i++) {
            error = false;
            for (int j = 0; j < words[i].length(); j++) {

                if (!Character.isDigit(words[i].charAt(j))) {
                    error = true;
                    break;
                }
            }
            if (error == false) {
                res[i] = Integer.parseInt(words[i]);
            } else {
                res[i] = 0;
            }
        }
        return res;
    }
}
