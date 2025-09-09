import java.util.Scanner;
class CalculateSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }  
        System.out.println("The sum of numbers from 1 to " + num + " is: " + sum);
        scanner.close();
    }
}
