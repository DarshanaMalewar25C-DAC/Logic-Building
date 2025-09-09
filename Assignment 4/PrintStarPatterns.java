/*
******
*    *
*    *
*    *
*    *
******
*/

public class PrintStarPatterns {
	 	public static void main(String[] args) {
        int rows = 6;
        int cols = 6;

        for (int i = 1; i <= rows; i++) {
            if (i == 1 || i == rows) {
               
                for (int j = 1; j <= cols; j++) {
                    System.out.print("*");
                }
            } else {
                
                System.out.print("*");
                for (int j = 1; j <= cols - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}