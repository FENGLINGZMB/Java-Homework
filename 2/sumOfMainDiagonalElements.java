import java.util.Scanner;

public class sumOfMainDiagonalElements {
    public static void main(String[] args){
        System.out.print("Enter a 4-by-4 matrix row by row:\n");
        Scanner input = new Scanner(System.in);
        double[][] numbers = new double[4][4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++)
                numbers[i][j] = input.nextDouble();
        }
        System.out.print("Sum of the elements in the major diagonal is: "+sumMajorDiagonal (numbers));
    }

    public static double sumMajorDiagonal (double[][] m){
        double sum = 0;
        for(int i = 0; i < m.length; i++)
            sum += m[i][i];
        return sum;
    }
}
