import java.util.Scanner;

class MathOperations {
    // Static method for addition
    static void addition(int a, int b) {
        int ans = a + b;
        System.out.println("The result of Addition is: " + ans);
    }

    // Static method for subtraction
    static void subtraction(int a, int b) {
        int ans = a - b;
        System.out.println("The result of Subtraction is: " + ans);
    }

    // Static method for multiplication
    static void multiplication(int a, int b) {
        int ans = a * b;
        System.out.println("The result of Multiplication is: " + ans);
    }

    // Static method for division
    static void division(int a, int b) {
        int ans = a / b;
        System.out.println("The result of Division is: " + ans);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String op = scan.nextLine();
        int a = scan.nextInt();
        int b = scan.nextInt();

        switch (op) {
            case "Addition":
                MathOperations.addition(a, b);
                break;

            case "Subtraction":
                MathOperations.subtraction(a, b);
                break;

            case "Multiplication":
                MathOperations.multiplication(a, b);
                break;

            case "Division":
                MathOperations.division(a, b);
                break;

            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
