import java.util.Scanner;

public class printOneMatrix {
    public static void main(String[] args){
        System.out.print("Enter the n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printMatrix(n);
    }

    public static void printMatrix(int n){
        System.out.println("The matrix is:");
        for(int i = 0; i < n; i++){
            for (int j =0; j < n; j++){
                System.out.print((int)(Math.random()*2)+"\t");
            }
            System.out.print("\n\n");
        }
    }
}
