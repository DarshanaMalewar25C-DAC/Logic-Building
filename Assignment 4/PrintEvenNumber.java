import java.util.Scanner;
class PrintEvenNumber{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
		int n = input.nextInt();
		for(int i=1; i<=n;i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
	}
}