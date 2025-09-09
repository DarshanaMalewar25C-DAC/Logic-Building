import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        System.out.print("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("The sum of all numbers is: " + sum);
        input.close();
    }
}