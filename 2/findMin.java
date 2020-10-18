import java.util.Scanner;

public class findMin {
    public static void main(String[] args){
        System.out.print("Enter ten numbers: ");
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        for(int i = 0; i < 10; i++)
            numbers[i] = input.nextDouble();
        System.out.print("The index of the smallest element is: "+indexOfSmallestElement(numbers));
    }

    public static int indexOfSmallestElement(double[] array){
        double min=array[0];
        int index=0;
        for(int i = 1; i < 10; i++){
            if(array[i]<min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
