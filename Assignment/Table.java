import java.util.Scanner;

public class Table {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the n value to Print the table of n: ");
        int n = scan.nextInt();
        scan.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

}