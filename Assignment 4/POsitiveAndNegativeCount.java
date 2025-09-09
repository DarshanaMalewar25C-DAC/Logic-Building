import java.util.Scanner;
class POsitiveAndNegativeCount{
/*
Write a Java program that asks the user to input 6 integers, stores them in an array, and then counts how 
many positive and negative numbers are present in the array. 
Sample Input: 
Enter 6 integers: -5 3 7 -2 0 8 
Expected Output: 
Positive numbers: 3 
Negative numbers: 2 
*/
     public static void main(String args[]){
		 Scanner sc = new Scanner(System.in);
		 int[] num = new int[6];
		 int positiveCount = 0;
		 int negativeCount = 0;
		 System.out.print("Enter 6 integers: ");
		 for(int i=0;i<6;i++){
			 num[i]= sc.nextInt();
		 }
		 for(int n : num){
			 if(n>0){
				 positiveCount++;
			 }
			 else if (n<0){
				 negativeCount++;
			 }
		 }
		 System.out.println("Positive numbers: " + positiveCount);
         System.out.println("Negative numbers: " + negativeCount);
	 }
}
		 
				 
		 