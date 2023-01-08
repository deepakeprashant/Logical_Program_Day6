import java.util.Scanner;

public class Main {
    public static final int FIBONACCI_SERIES = 1;

    public static void main(String[] args) {
        System.out.println("WELCOME TO LOGICAL PROGRAM");
        Scanner scan = new Scanner(System.in);
        LogicalProgram logicalProgram = new LogicalProgram();
        System.out.println("1] FIBONACCI SERIES PROGRAM");
        int choice = scan.nextInt();
        switch (choice) {
            case FIBONACCI_SERIES:
                logicalProgram.fibonacci_seris();
                break;
            default:
                System.out.println("Thank You !");
        }
    }
}
