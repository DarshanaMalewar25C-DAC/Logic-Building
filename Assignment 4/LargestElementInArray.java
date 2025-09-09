import java.util.Arrays;
import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }
        int max = Arrays.stream(numbers).max().getAsInt();

        System.out.println("The largest element is: " + max);

        input.close();
    }
}
