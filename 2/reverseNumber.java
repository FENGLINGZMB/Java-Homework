import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        reverse(number);
    }

    public static void reverse(int number){
        int numberReversed = 0;
        while (number!=0){
            numberReversed=numberReversed*10+number%10;
            number /= 10;
        }
        System.out.println("Reversed number is: "+numberReversed);
    }
}
