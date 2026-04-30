package Tutorial;
import java.util.Scanner;
/*
Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
Sample Output:

Input the first number : 5                                             
Input the second number: 10                                            
Input the third number : 15                                            
The result is: true
 */

public class SumEqualsThirdInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = sc.nextInt();

        System.out.print("Input the second number : ");
        int y =sc.nextInt();

        System.out.print("Input the third number : ");
        int z =sc.nextInt();

        int sum = x+y;//不对 因为题目要求的是任何2个数之和 不是只有1跟2.
        if (sum==z){
            System.out.println("The result is : true");
        }else{
            System.out.println("The result is : false");
        }
    }
}
/*sample answer
public class Exercise52 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);
        
        // Prompt the user to input the first number
        System.out.print("Input the first number: ");
        int x = in.nextInt();

        // Prompt the user to input the second number
        System.out.print("Input the second number: ");
        int y = in.nextInt();

        // Prompt the user to input the third number
        System.out.print("Input the third number: ");
        int z = in.nextInt();

        // Calculate the result using the sumoftwo function and display it
        System.out.print("The result is: " + sumoftwo(x, y, z));

        // Print a new line for better formatting
        System.out.print("\n");
    }
    
    // Function to check if the sum of two numbers equals the third number
    public static boolean sumoftwo(int p, int q, int r) {
        return ((p + q) == r || (q + r) == p || (r + p) == q);
    }
} */