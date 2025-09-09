
import java.util.*;
/*
1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
5*5*5*5*5
4*4*4*4
3*3*3
2*2
1
*/
public class NumberPattern {
    public static void printPattern(int n) {       
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
                if (j < i - 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
                if (j < i - 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {    
        printPattern(5);
	}
}