/*
Question 27: String Literal and Object Creation 
Problem Statement: 
Write a Java program that creates two string variables using string literals with the same 
content. Then, print whether both variables point to the same object. 
Code Example: 
String str1 = "hello"; 
String str2 = "hello"; 
Expected Output: 
Both variables point to the same object: true
*/

public class StringLiteral {
    public static void main(String[] args) {       
        String str1 = "hello";
        String str2 = "hello";
        boolean sameObject = (str1 == str2);
        System.out.println("Both variables point to the same object: " + sameObject);
    }
}
