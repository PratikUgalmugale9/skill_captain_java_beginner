import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        System.out.println("FOR loop to print numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " ");
        }
        System.out.println(); 
        System.out.println("\nWHILE loop to print even numbers between 1 and 20:");
        int j = 2; 
        while (j <= 20) {
            System.out.println(j + " ");
            j += 2; 
        }
        System.out.println(); 
        
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        int predefinedNumber = 9; 
        do {
            System.out.print("\nEnter a number between 1 and 10: ");
            userNumber = scanner.nextInt();
            if (userNumber >= 1 && userNumber <= 10) {
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        } while (true);
        System.out.println("You entered: " + userNumber);
        scanner.close();
    }
}
