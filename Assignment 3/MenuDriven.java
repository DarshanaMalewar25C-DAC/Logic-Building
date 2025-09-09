import java.util.Scanner;
class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Grade");
            System.out.println("2. Leap Year");
            System.out.println("3. Day of Week");
            System.out.println("4. Default Values");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();
                    if (marks >= 90) System.out.println("Grade: A");
                    else if (marks >= 75) 
						System.out.println("Grade: B");
                    else if (marks >= 60)
						System.out.println("Grade: C");
                    else if (marks >= 40) 
						System.out.println("Grade: D");
                    else 
						System.out.println("Grade: F");
                    break;

                case 2:
                    System.out.print("Enter year: ");
                    int year = sc.nextInt();
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                        System.out.println("Leap Year");
                    else
                        System.out.println("Not a Leap Year");
                    break;

                case 3:
                    System.out.print("Enter day number (1-7): ");
                    int day = sc.nextInt();
                    String[] days = {"Invalid", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
                    System.out.println((day >= 1 && day <= 7) ? days[day] : "Invalid day");
                    break;

                case 4:
                    System.out.println("Default values:");
                    System.out.println("int: 0, float: 0.0, boolean: false, char: '\\u0000', String: null");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
