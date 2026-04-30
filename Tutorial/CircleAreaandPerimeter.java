package Tutorial;
import java.util.Scanner;
/*
Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */
public class CircleAreaandPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Radius = ");
        double num = sc.nextDouble();

        System.out.println("Expexted Output");
        double perimeter = 2*Math.PI*num;
        System.out.println("Perimeter is = "+ perimeter);

        double area = Math.PI*num*num;
        System.out.println("Area is = "+ area);
    }

}
