package Tutorial;
import java.util.Scanner;

/*
Write a Java program that takes five numbers as input to calculate and print the average of the numbers
*/

public class AverageofFiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 =0;

        for(int n = 0; n<5;n++){
            System.out.println("Input the number you want to calculate:");
            double num = sc.nextDouble();
            num1 += num;
        }
        
        double result = num1/5;

        System.out.println(result);
    }

}
