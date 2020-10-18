import java.util.Scanner;

public class BMI {
    private double pounds;
    private double kilograms;
    private double inches;
    private double meters;
    private double BMI;

    public BMI(double pounds,double inches){
        this.pounds=pounds;
        this.inches=inches;
        kilograms=pounds*0.45359237;
        meters=inches*0.0254;
        BMI=kilograms/meters/meters;
    }

    public double getBMI(){
        return BMI;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double pounds=input.nextDouble();
        System.out.print("Enter height in inches: ");
        double inches=input.nextDouble();
        BMI BMI =new BMI(pounds,inches);
        System.out.printf("BMI is %.4f",BMI.getBMI());
    }
}
