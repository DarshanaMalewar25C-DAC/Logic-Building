import java.util.Scanner;
class PrintTheNumber{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int n = input.nextInt(); 

        
        for (int i = 1; i <= n; i++) {
            System.out.print(i+ " ");
        }

        input.close(); 
    }
}