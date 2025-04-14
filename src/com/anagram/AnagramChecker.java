package com.anagram;

import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Prompt for first input
        System.out.println("Enter the first string: ");
        String name1 = s.nextLine();
        char s1[] = name1.toCharArray();
        
        // Sort the first string manually
        for (int i = 0; i < s1.length; i++) {
            for (int j = i + 1; j < s1.length; j++) {
                if (s1[i] > s1[j]) {
                    // Swap the characters
                    char temp = s1[i];
                    s1[i] = s1[j];
                    s1[j] = temp;
                }
            }
        }
        
        // Prompt for second input
        System.out.println("Enter the second string: ");
        String name2 = s.nextLine();
        char s2[] = name2.toCharArray();
        
        // Sort the second string manually
        for (int i = 0; i < s2.length; i++) {
            for (int j = i + 1; j < s2.length; j++) {
                if (s2[i] > s2[j]) {
                    // Swap the characters
                    char temp = s2[i];
                    s2[i] = s2[j];
                    s2[j] = temp;
                }
            }
        }
        
        // Compare both strings manually
        boolean isAnagram = true;
        if (s1.length != s2.length) {
            isAnagram = false;
        } else {
            for (int i = 0; i < s1.length; i++) {
                if (s1[i] != s2[i]) {
                    isAnagram = false;
                    break;
                }
            }
        }
        
        // Output the result
        if (isAnagram) {
            System.out.println("This is an anagram string");
        } else {
            System.out.println("This is not an anagram string");
        }
        
        s.close();
    }
}
