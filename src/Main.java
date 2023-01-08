import java.util.Scanner;

public class Main {
    public static final int FIBONACCI_SERIES = 1;
    public static final int PERFECT_NUMBER = 2;
    public static final int EXIT = 3;

    public static void main(String[] args) {
        System.out.println("WELCOME TO LOGICAL PROGRAM");
        Scanner scan = new Scanner(System.in);
        LogicalProgram logicalProgram = new LogicalProgram();
        while (true) {
            System.out.println("\n1] FIBONACCI SERIES PROGRAM");
            System.out.println("2] PERFECT NUMBER PROGRAM");
            System.out.println("3] EXIT PROGRAM");
            switch (scan.nextInt()) {
                case FIBONACCI_SERIES:
                    logicalProgram.fibonacciSeris();
                    break;
                case PERFECT_NUMBER:
                    logicalProgram.perfectProgram();
                    break;
                case EXIT:
                    System.exit(0);
                default:
                    System.out.println("Thank You !");
            }
        }
    }
}
