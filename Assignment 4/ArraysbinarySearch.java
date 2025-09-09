/*Problem Statement: 
Write a Java program that asks the user to input 5 integers, stores them in an array, and then finds the 
index of a specific number (input by the user) using the Arrays.binarySearch() method. If the number is 
found, print the index, otherwise print "Not Found". 
Sample Input: 
Enter 5 integers: 5 10 15 20 25 
Enter the number to search: 15 
Expected Output: 
The number 15 is found at index 2 
*/
import java.util.Scanner;
import java.util.Arrays;

public class ArraysbinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num); 
        System.out.print("Enter the number to search: ");
        int searchNum = sc.nextInt();
        int index = Arrays.binarySearch(num, searchNum);
        if (index >= 0) {
            System.out.println("The number " + searchNum + " is found at index " + index);
        } else {
            System.out.println("Not Found");
        }
    }
}
