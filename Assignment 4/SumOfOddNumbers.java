import java.util.Scanner; 

public class SumOfOddNumbers {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in); 

        System.out.print("Enter a number: ");
        int n = inputScanner.nextInt(); 
        int sumOfOdds = 0; 
        
        for (int i = 1; i <= n; i++) {
            
            if (i%2!= 0) { 
                sumOfOdds += i; 
            }
        }

         
        System.out.println("The sum of odd numbers from 1 to " + n + " is: " + sumOfOdds); // Print the final result

        inputScanner.close(); 
    }
}