import java.util.Scanner;

public class compoundValue {
    public static double calculate(int month,double money){
        if(month==0)
            return 0;
        return (calculate(month-1,money)+money)*1.003125;
    }

    public static void main(String[] args){
        System.out.print("Enter the monthly saving amount: ");
        Scanner input =new Scanner(System.in);
        double money = input.nextDouble();
        System.out.println("After the first month, the account value is "+calculate(1,money));
        System.out.println("After the second month, the account value is "+calculate(2,money));
        System.out.println("After the third month, the account value is "+calculate(3,money));
        System.out.println("After the sixth month, the account value is "+calculate(6,money));
    }
}
