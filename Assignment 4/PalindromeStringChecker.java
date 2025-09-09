/*
Question 26: Check if a String is a Palindrome 
Problem Statement: 
Write a Java program that asks the user for a string and checks whether the string is a 
palindrome. A palindrome is a string that reads the same backward as forward (ignoring 
spaces and punctuation). 
Sample Input: 
Enter a string: madam 
Expected Output: 
The string 'madam' is a palindrome.
*/

import java.util.Scanner;

public class PalindromeStringChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        if (cleaned.equals(reversed)) {
            System.out.println("The string '" + input + "' is a palindrome.");
        } else {
            System.out.println("The string '" + input + "' is not a palindrome.");
        }
        sc.close();
    }
}
