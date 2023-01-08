import java.util.Scanner;

public class Main {
    public static final int FIBONACCI_SERIES = 1;
    public static final int PERFECT_NUMBER = 2;
    public static final int PRIME_NUMBER = 3;
    public static final int REVERSE_NUMBER = 4;
    public static final int COUPON_NUMBER = 5;
    public static final int STOPWATCH_PROGRAM = 6;
    public static final int EXIT = 7;

    public static void main(String[] args) {
        System.out.println("WELCOME TO LOGICAL PROGRAM");
        Scanner scan = new Scanner(System.in);
        LogicalProgram logicalProgram = new LogicalProgram();
        while (true) {
            System.out.println("\n1] FIBONACCI SERIES PROGRAM");
            System.out.println("2] PERFECT NUMBER PROGRAM");
            System.out.println("3] PRIME NUMBER PROGRAM");
            System.out.println("4] REVERSE NUMBER PROGRAM");
            System.out.println("5] COUPON NUMBER PROGRAM");
            System.out.println("6] STOPWATCH PROGRAM");
            System.out.println("7] EXIT PROGRAM");
            switch (scan.nextInt()) {
                case FIBONACCI_SERIES:
                    logicalProgram.fibonacciSeris();
                    break;
                case PERFECT_NUMBER:
                    logicalProgram.perfectProgram();
                    break;
                case PRIME_NUMBER:
                    logicalProgram.primeNumber();
                    break;
                case REVERSE_NUMBER:
                    logicalProgram.reverseNumber();
                    break;
                case COUPON_NUMBER:
                    logicalProgram.couponNumber();
                    break;
                case STOPWATCH_PROGRAM:
                    logicalProgram.stopwatchProgram();
                    break;
                case EXIT:
                    System.exit(0);
                default:
                    System.out.println("Thank You !");
            }
        }
    }
}
