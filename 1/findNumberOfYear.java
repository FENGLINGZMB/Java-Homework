import java.util.Scanner;

public class findNumberOfYear {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes=input.nextInt();
        int days=minutes/60/24;
        int years=days/365;
        days=days%365;
        System.out.printf("%d minutes is approximately %d years and %d days",minutes,years,days);
    }
}
