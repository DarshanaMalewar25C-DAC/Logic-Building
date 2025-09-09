/*
Question 25: Count Vowels in a String 
Problem Statement: 
Write a Java program that asks the user for a string and counts the number of vowels (a, 
e, i, o, u) in the string. The program should then print the total number of vowels. 
Sample Input: 
Enter a string: programming 
Expected Output: 
The number of vowels in 'programming' is: 3
*/

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        input = input.toLowerCase();
        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("The number of vowels in '" + input + "' is: " + vowelCount);
        sc.close();
    }
}
