import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choose;
        System.out.println("\n\n\n***************MENU**************\n");
        System.out.println("1. Addition");// It gives sum
        System.out.println("2. Substraction");// It gives difference value
        System.out.println("3. Multiplication");// It gives Product
        System.out.println("4. Division");// It gives Quotient
        System.out.println("5. Modulus");// It gives us the reminder
        System.out.print("\n\nPlease Enter your choose: ");
        choose = scan.nextInt();

        System.out.print("Enter Operant1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter Operant2: ");
        int num2 = scan.nextInt();

        scan.close();
        int ans = 0;

        switch (choose) {
            case 1:
                ans = num1 + num2;
                System.out.println("Adding-- " + num1 + " + " + num2 + " : " + ans);
                break;

            case 2:
                ans = num1 - num2;
                System.out.println("Subtracting-- " + num1 + " - " + num2 + " : " + ans);
                break;

            case 3:
                ans = num1 * num2;
                System.out.println("Multipling-- " + num1 + " * " + num2 + " : " + ans);
                break;

            case 4:
                ans = num1 / num2;
                System.out.println("Diving-- " + num1 + " / " + num2 + " : " + ans);
                break;

            case 5:
                ans = num1 % num2;
                System.out.println("Mod-- " + num1 + " % " + num2 + " : " + ans);
                break;

            default:
                System.out.println("Your choose is invalid. Please! Enter valid choose.\n\n\n");
                break;
        }
    }
}