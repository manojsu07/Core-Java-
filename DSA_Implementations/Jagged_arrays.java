import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Jagged_arrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int row = scn.nextInt();

        int[][] arr = new int[row][];

        for (int i = 0; i < row; i++) {
            System.out.println("Enter the number of coloumns in row: " + i);
            int col = scn.nextInt();
            arr[i] = new int[col];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the value for " + i + "th row , " + j + "th col : ");
                int val = scn.nextInt();
                arr[i][j] = val;
            }
        }

        System.out.println("The values are : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}