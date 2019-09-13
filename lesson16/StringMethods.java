package lesson16;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String test = "someStringExample";
        System.out.println(test.isEmpty());
        System.out.println("".isEmpty());


        System.out.println(test.length());

        System.out.println(test.charAt(2));


        System.out.println(test.replace("met", "T"));
        System.out.println(test.replaceAll("met", "T"));


        System.out.println(test);
        System.out.println(test.contains("me"));


        System.out.println(test);
        String phrase = "Hello there guys";
        System.out.println(Arrays.toString(phrase.split(" ")));
        System.out.println(" test ".trim());

        System.out.println(phrase.substring(5));
        System.out.println(phrase.substring(5,10).trim());
        System.out.println(phrase);


        System.out.println(test.toUpperCase());
        System.out.println(test.toLowerCase());


        test.getBytes();
        test.equals("eee");
        test.intern();


    }
}
