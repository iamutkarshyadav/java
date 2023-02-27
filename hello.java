// make a calculator java program

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = myObj.nextInt();
        System.out.println("Enter second number");
        int num2 = myObj.nextInt();
        System.out.println("Enter an operator (+, -, *, /)");
        char op = myObj.next().charAt(0);
        int result = 0;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Error! operator is not correct");
                return;
        }
        System.out.println("Result is: " + result);
    }
}

