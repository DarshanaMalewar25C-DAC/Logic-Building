/*Write a Java program that asks the user to input 5 integers, stores them in an array, and then checks 
whether a specific number (input by the user) is present in the array using the Arrays.asList() method. If 
the number is found, print "Found", otherwise print "Not Found". 
Sample Input: 
Enter 5 integers: 10 20 30 40 50 
Enter the number to search: 30 
Expected Output: 
Found*/
import java.util.Scanner;
import java.util.Arrays;

public class SearchArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] num = new Integer[5]; 

        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int searchNum = sc.nextInt();

        if (Arrays.asList(num).contains(searchNum)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
