/*
Basic Arithmetic Operations

Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
*/
package Tutorial;
import java.util.Scanner; 


public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number:");
        int fn = sc.nextInt();

        System.out.println("Input Second number:");
        int sn = sc.nextInt();

        System.out.println(fn+" + "+sn+" = "+(fn+sn));
        System.out.println(fn+" - "+sn+" = "+(fn-sn));
        System.out.println(fn+" x "+sn+" = "+(fn*sn));
        System.out.println(fn+" / "+sn+" = "+(fn/sn));
        System.out.println(fn+" mod "+sn+" = "+(fn%sn));
        
    }
}
