import java.util.Scanner;

public class LogicalProgram {
    Scanner scan = new Scanner(System.in);
    String program;

    public int userInterface(String choice) {
        int number;
        System.out.println("Enter " + choice + " number");
        number = scan.nextInt();
        return number;
    }

    public void fibonacciSeris() {
        program = "Fibonacci ";
        int firstValue = 0;
        int secondValue = 1;
        int number = userInterface(program);
        System.out.print("FIBONACCI SERIES :- ");
        for (int i = 0; i < number; i++) {
            System.out.print(firstValue + ", ");
            int temp = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = temp;
        }

    }

    public void perfectProgram() {
        program = "Perfect Number";
        int number = userInterface(program);
        int i = 1, result = 0;
        System.out.print(number + " = ");
        while (i <= number / 2) {
            if (number % i == 0) {
                result += i;
                System.out.print(i + " + ");
            }
            i++;
        }
        if (number == result) {
            System.out.println("\n" + number + " is Perfect Number");
            return;
        }
        System.out.println("\n" + number + " is Not Perfect Number");
    }

    public void primeNumber() {
        program = "Prime Number";
        int primeNumber = 0;
        int number = userInterface(program);
        for (int i = 0; i < number / 2; i++) {
            if (number % 2 == 0) {
                primeNumber = 1;
                break;
            }
        }
        if (primeNumber == 0) {
            System.out.println(number+" is Prime Number");
            return;
        }
        System.out.println(number+"is not Prime Number");
    }

    public void reverseNumber() {
        program = "Upto 3 Digit Number";
        int number = userInterface(program);
        int reverseNumber =0;
        int originalNumber = number;
        while (number != 0) {
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number = number / 10;
        }
        System.out.println(originalNumber + " The reverse of the given number is: " + reverseNumber);
    }
}
