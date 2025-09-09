/*
1
1*3
1*3*5
1*3*5*7
1*3*5*7*9
*/

public class OddNumberPattern1to9 {
	public static void main(String[] args) {    
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(2*j+1);
                if (j < i-1 ) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }          
    }   
}