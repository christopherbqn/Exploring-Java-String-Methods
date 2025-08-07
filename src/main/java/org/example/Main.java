package org.example;

import java.sql.SQLOutput;


public class Main {

    public static void main(String[] args) {

        // EXERCISE 1
        System.out.println("--- 1️⃣ Exercise 1 ---");
        String greeting = "Hello, Cadets!";
        int length = greeting.length();
        System.out.println("The length of the string is: " + length);

        // EXERCISE 2
        System.out.println("\n--- 2️⃣ Exercise 2 ---");
        String message = "Keep learning!";
        char character = message.charAt(5);
        System.out.println("The character at index 5 is: " + character);

        // EXERCISE 3
        System.out.println("\n--- 3️⃣ Exercise 3 ---");
        String statement = "Java is powerful.";
        String part = statement.substring(5,7);
        System.out.println("The extracted substring is: " + part);

        // EXERCISE 4
        System.out.println("\n--- 4️⃣ Exercise 4 ---");
        String mixedCase = "This Is A Test";
        String upper = mixedCase.toUpperCase();
        String lower = mixedCase.toLowerCase();
        System.out.println("Uppercase: " + upper);

        // EXERCISE 5
        System.out.println("\n--- 5️⃣ Exercise 5---");
        String sentence = "The quick brown fox jumps over the lazy dog.";
        int indexOfFox = sentence.indexOf("fox");
        int indexOfZ = sentence.indexOf('z');
        int indexOfCat = sentence.indexOf("cat");

        System.out.println("Index of 'fox': " + indexOfFox);
        System.out.println("Index of 'z': " + indexOfZ);
        System.out.println("Index of 'cat': " + indexOfCat);

        // EXERCISE 6
        System.out.println("\n --- 6️⃣ Exercise 6 ---");
        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";

        boolean isEqual1 = str1.equals(str2);
        boolean isEqual2 = str1.equals(str3);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);

        System.out.println("\"Java\".equals(\"java\"): " + isEqual1);
        System.out.println("\"Java\".equals(\"Java\"): " + isEqual2);
        System.out.println("\"Java\".equalsIgnoreCase(\"java\"): " + isEqualIgnoreCase);

        // EXERCISE 7
        System.out.println("\n --- 7️⃣ Exercise 7 ---");
        String original = "I like cats. Cats are cute.";
        String replaced = original.replace("cats", "dogs");
        System.out.println("Original: " + original);
        System.out.println("Replaced: " + replaced);

        // EXERCISE 8
        System.out.println("\n --- 8️⃣ Exercise 8 ---");
        String padded = "   Lots of spaces   ";
        String trimmed = padded.trim();
        System.out.println("Padded string length: " + padded.length());
        System.out.println("Trimmed string: '" + trimmed + "'");
        System.out.println("Trimmed string length: " + trimmed.length());


    }

}