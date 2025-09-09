/*Question 24: Reverse a String 
Problem Statement: 
Write a Java program that asks the user for a string and then prints the reverse of that 
string. 
Sample Input: 
Enter a string: hello 
Expected Output: 
Reversed string: olleh
*/

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a string: ");
        String input = sc.nextLine();        

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);

        sc.close(); 
    }
}
