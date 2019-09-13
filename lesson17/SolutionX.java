package lesson17;

import java.util.Arrays;

public class SolutionX {

    public int countWords(String input) {
        input=input.trim();
        int res = 0;
        char c = ' ';
        int Count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)==input.charAt(i+1)){

            }
        }
        //failCount = 0;
            for (int j = 0; j < input.length(); j++) {
                c = input.toLowerCase().charAt(j);
                if (!(c >= 97 && c <= 122))
                    Count++;
            }
        return  Count+1;
    }


    public String maxWord(String input) {
        if (input == null) {
            return "";
        }
        String[] words = input.split(" ");
        String max = words[0];


        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > max.length())
                max = words[i];
        }
        return max;
    }

    public String minWord(String input) {
        if (input == null) {
            return "";
        }
        String[] words = input.split(" ");
        String min = words[0];

        for (int i = 0; i < words.length; i++) {
            if ((!words[i].isEmpty()) && (words[i].length() < min.length()))
                min = words[i];
        }
        return min;
    }

    public String mostCountedWord(String input) {
        if (input == null) {
            return "";
        }
        String[] words = input.split(" ");
        int[] res = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 0; j < words.length; j++) {
                if (words[i].equals(words[j]))
                    res[i]++;
            }
        }
        System.out.println(Arrays.toString(res));

        int MaxRes = 0;
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (res[i] > MaxRes) {
                MaxRes = res[i];
                count = i;
            }
        }
        return MaxRes > 0 ? words[count] : null;
    }

    public boolean validate(String address) {

        int temp = address.length() - 4;

        if (!(address.substring(0, 7).contains("http://") || address.substring(0, 8).contains("https://"))) {
            return false;
        } else if (!(address.substring(temp).contains(".com") || address.substring(temp).contains(".org") || address.substring(temp).contains(".net"))) {
            System.out.println(address);
            return false;
        } else if (!validateName(address)) {
            return false;
        } else {
            return true;
        }

    }

    public boolean validateName(String address) {
        char c = ' ';
        int failCount = 0;
        for (int j = 7; j < address.length()-4; j++) {
            c = address.toLowerCase().charAt(j);
            if (!(c >= 97 && c <= 122))
                failCount++;
        }
        if (failCount == 0 || failCount == 1 && address.toLowerCase().charAt(8)==47 ) {
            return true;
        }
        else {
            return false;
        }
    }

}