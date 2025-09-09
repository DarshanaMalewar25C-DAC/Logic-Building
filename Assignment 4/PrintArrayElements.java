import java.util.Scanner; 

public class PrintArrayElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5]; 
        System.out.print("Enter 5 integers: "); 
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }       
        for (int number : numbers) {
            System.out.print(number + " "); 
        }
        input.close(); 
    }
}