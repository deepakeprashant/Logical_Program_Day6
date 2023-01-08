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
            System.out.print(firstValue+", ");
            int temp = firstValue+secondValue;
            firstValue = secondValue;
            secondValue =temp;
        }

    }

    public void perfectProgram() {
        program = "Perfect Number";
        int number = userInterface(program);
        int i =1,result=0;
        System.out.print(number+" = ");
        while (i<=number/2){
            if (number%i==0){
                result +=i;
                System.out.print(i+" + ");
            }
            i++;
        }
        if (number==result){
            System.out.println("\n"+number+" is Perfect Number");
            return;
        }
        System.out.println("\n"+number+" is Not Perfect Number");
    }
}
