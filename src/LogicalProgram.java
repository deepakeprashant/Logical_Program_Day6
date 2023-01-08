import java.util.Scanner;

public class LogicalProgram {
    Scanner scan = new Scanner(System.in);
    String program;

    public void fibonacci_seris() {
        program = "Fibonacci ";
        int firstValue = 0;
        int secondValue = 1;
        int number = userInterface(program);
        System.out.print("FIBONACCI SERIES :- ");
        for (int i = 0; i < number; i++) {
            System.out.print(firstValue+", ");
            int temp = firstValue+secondValue;
            firstValue = secondValue;
            secondValue =temp;
        }

    }

    public int userInterface(String choice) {
        int number;
        System.out.println("Enter " + choice + " number");
        number = scan.nextInt();
        return number;
    }
}
