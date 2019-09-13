package lesson17;

import java.util.Arrays;

public class Solution {

    public int countWords(String input) {
        if (input == null)
            return 0;
        String[] words = input.split(" ");
        int res = 0;
        for (String temp : words) {
            if (validateWord(temp)) {
                res++;
            }
        }
        return res;
    }

    public boolean validateWord(String string) {
        if (string.isEmpty() || string == null)
            return false;

        char[] c = string.toCharArray();

        for (char temp : c) {
            if (!Character.isLetter(temp) && !Character.isDigit(temp))
                return false;
        }
        return true;
    }


    public String maxWord(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        String[] words = input.split(" ");
        String max = "";
        int count = 0;
        for (String temp : words) {
            if (temp.length() > max.length() && validateWord(temp)) {
                max = temp;
                count++;
            }
        }
        return count==0?null:max;
    }

    public String minWord(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        String[] words = input.split(" ");
        String min = "";
        int s = input.length();
        int count = 0;
        for (String temp : words) {
            if ((temp.length() <= s) && (validateWord(temp))) {
                s = temp.length();
                min = temp;
                count++;
            }
        }
        return count==0?null:min;
    }

    public String mostCountedWord(String input) {
        if (input == null) {
            return null;
        }
        String[] words = input.split(" ");

        int[] res = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            for (int j = i; j < words.length; j++) {
                if (words[i].equals(words[j]) && validateWord(words[j]))
                    res[i]++;
            }
        }

        int MaxRes = 0, count = 0;

        for (int i = 0; i < words.length; i++) {
            if (res[i] > MaxRes) {
                MaxRes = res[i];
                count = i;
            }
        }
        return MaxRes > 1 ? words[count] : null;
    }

    public boolean validate(String address) {

        if (!address.startsWith("http://") && !address.startsWith("https://")) {
            return false;
        }
        if (!address.endsWith(".com") && !address.endsWith(".org") && !address.endsWith(".net")) {
            return false;
        }

        address = isValid(address, new String[]{"http://", "https://", ".com", ".org", ".net"});
        address = address != null && address.startsWith("www.") ? address.replaceFirst("www.", "") : address;
        if (!(validateWord(address))) {
            return false;
        }
        return true;
    }

    private String isValid(String address, String[] parts) {
        for (String temp : parts) {
            if (address.contains(temp)) {
                address = address.replaceFirst(temp, "");
            }
        }
        return address;
    }
}

