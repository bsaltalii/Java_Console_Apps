import java.util.Random;
import java.util.Scanner;

public class vize {
    public static void main(String[] args) {

        //Creating scanner class and taking row number
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of rows : ");
        int rowNum = scan.nextInt();
        //END

        //Creating matrix and filling
        String[][] matrix = new String[rowNum][rowNum];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j)
                    matrix[i][j] = "X";
                else if (j == (rowNum - i - 1))
                    matrix[i][j] = "X";
                else
                    matrix[i][j] = "";
            }
        }
        //END
        PrintMatrix(matrix);
    }
    //Creating PrintMatrix method
    public static void PrintMatrix(String[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    //END
}


