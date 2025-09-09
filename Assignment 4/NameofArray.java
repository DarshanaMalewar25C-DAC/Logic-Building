import java.util.Scanner;

public class NameofArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[4];

        System.out.print("Enter 4 names: ");  
        for (int i = 0; i < 4; i++) {
            names[i] = input.next(); 
        }

        for (String name : names) {
            System.out.println(name);
        }

        input.close();
    }
}
