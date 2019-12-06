package lesson31;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static Map<Character, Integer> countSymbols(String text) throws Exception {

        if (text.isEmpty() || text == null) {
            throw new Exception ("text is not present");
        }
        Map<Character,Integer> mapTemp = new HashMap<>();
        char[] charsTemp = text.toCharArray();
        for (Character tempChar: charsTemp) {
            if (Character.isLetter(tempChar)){
                mapTemp.put(tempChar, mapTemp.get(tempChar) == null ? 1 : mapTemp.get(tempChar)+1);
            }

        }
        return mapTemp;
    }

    public static Map<String, Integer> words(String text)throws Exception{
        if (text.isEmpty() || text == null) {
            throw new Exception ("text is not present");
        }
        Map<String,Integer> mapTemp = new HashMap<>();
        String stringsTemp[] = text.split(" ");


        for (String temp: stringsTemp) {
            if (temp.length()>1) {
                mapTemp.put(temp, mapTemp.get(temp) == null ? 1 : mapTemp.get(temp) + 1);
            }
        }
        return mapTemp;


    }

}
