package Tutorial;
import java.util.Scanner;
/*
Write a Java program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd.
Sample Output:

Input a number: 20                                                     
1
 */

public class CheckEvenorOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input a number");
        int x = sc.nextInt();

        if(x%2==0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }

}
