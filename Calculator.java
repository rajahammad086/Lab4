import java.util.Scanner;

// This program will evaluate simple expressions such as 17 + 3 and
// 3.14159 * 4.7. The expressions are to be typed in by the user. The input
// always consists of a number, followed by an operator, followed by another
// number. The operators that are allowed are +, -, *, and /. Your program
// should should read an expression, print its value, read another expression,
// print its value, and so on. The program should end when the user enters 0
// as the first number on the line.

public class Calculator {

    public static void main ( String[] args ) {

        Scanner scanner = new Scanner(System.in);

        // repeat until the user enters 0 as the first number on the line

        //   read an expression - number, operator, number
        double number1, number2;  // the two numbers
        char op;  // the operator
        System.out.print("enter an expression like 5 + 5, and make sure to give spaces in between ");
        number1 = scanner.nextDouble();
        // scanner.next() reads the next String and .charAt(0) gets the first
        // character of that string (scanner.nextLine() reads the rest of the
        // line - that's not quite what we want here because the second number
        // will also be on the line)
        op = scanner.next().charAt(0);
        number2 = scanner.nextDouble();

        //   evaluate expression - depends on the operator (making a choice - at
        //   most one alternative of two or more)
        double value; // the expression's value
        while (number1 != 0){
        if ( op == '+' ) {
            // operator is +
            // evaluate + expression
            value = number1+number2;
            System.out.println("the value is: "+value);//   print the value
        } else if ( op == '-' ) {
            // evaluate - expression
            value = number1-number2;
            System.out.println("the value is: "+value);//   print the value
        } else if ( op == '*' ) {
            // evaluate * expression
            value = number1*number2;
            System.out.println("the value is: "+value);//   print the value
        } else if ( op == '/' ) {
            // evaluate / expression
            value = number1/number2;
            System.out.println("the value is: "+value);//   print the value
        } else {
            System.out.println("invalid operator "+op);
            value = Double.NaN;
        }
        System.out.print("enter an expression: ");
        number1 = scanner.nextDouble();
        // scanner.next() reads the next String and .charAt(0) gets the first
        // character of that string (scanner.nextLine() reads the rest of the
        // line - that's not quite what we want here because the second number
        // will also be on the line)
        op = scanner.next().charAt(0);
        number2 = scanner.nextDouble();

        }
        
        

    }

}
