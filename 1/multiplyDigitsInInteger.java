import java.util.Scanner;

public class multiplyDigitsInInteger {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int integer=input.nextInt();
        while (integer>1000||integer<0){
            System.out.print("Invalid number\nEnter a number between 1 and 1000: ");
            integer=input.nextInt();
        }
        int multiply=1;
        if(integer==1000)
            multiply=0;
        else if(integer>=100)
            multiply=(integer%10)*((integer/10)%10)*((integer/100)%10);
        else if(integer>=10)
            multiply=(integer%10)*((integer/10)%10);
        else
            multiply=integer;
        System.out.printf("The multiplication of all digits in %d is %d",integer,multiply);
    }
}
