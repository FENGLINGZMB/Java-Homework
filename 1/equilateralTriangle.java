import java.util.Scanner;

public class equilateralTriangle {
    private double length;
    private double height;
    private double area;
    private double volume;
    final double parameter=Math.sqrt(3)/4;
    public  equilateralTriangle(double length,double height){
        this.length=length;
        this.height=height;
        area=length*length*parameter;
        volume=area*height;
    }

    public void printResult(){
        System.out.printf("The area is %.2f\nThe volume of the Triangular is %.2f",area,volume);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of the sides and height of the Equilateral triangle: ");
        equilateralTriangle equilateralTriangle=new equilateralTriangle(input.nextDouble(),input.nextDouble());
        equilateralTriangle.printResult();
    }
}
