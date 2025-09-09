import java.util.Scanner;
 class AskForPositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        do {
            System.out.println(" Enter a positive number: ");
            num = sc.nextInt();
        } while (num<= 0); 
        System.out.println("You entered a positive number: " + num);

        sc.close();
    }
}
