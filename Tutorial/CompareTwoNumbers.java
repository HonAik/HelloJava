package Tutorial;
import java.util.Scanner;
/*
Write a Java program to compare two numbers.

Test Data:
Input first integer: 25
Input second integer: 39

*/
public class CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first integr:");
        int x = sc.nextInt();
        System.out.println("Input Second integer:");
        int y = sc.nextInt();

        if(x!=y){
            if(x>y){
                System.out.println(x+">"+y);
                System.out.println("The first integer greater than second integer.");
            }else if(x<y){
                System.out.println(x+"<"+y);
                System.out.println("The first integer are smaller then second integer.");
            }
        }else{
            System.out.println(x+"="+y);
            System.out.println("The first integer and Second integer are the same integer.");
        }
    }

}

/* sample answer
Scanner input = new Scanner(System.in);
        int number1; // First number to compare
        int number2; // Second number to compare

        // Prompt the user to input the first integer
        System.out.print("Input first integer: ");
        number1 = input.nextInt(); // Read the first number from the user

        // Prompt the user to input the second integer
        System.out.print("Input second integer: ");
        number2 = input.nextInt(); // Read the second number from the user

        // Compare and display the results
        if (number1 == number2)
            System.out.printf("%d == %d\n", number1, number2);
        if (number1 != number2)
            System.out.printf("%d != %d\n", number1, number2);
        if (number1 < number2)
            System.out.printf("%d < %d\n", number1, number2);
        if (number1 > number2)
            System.out.printf("%d > %d\n", number1, number2);
        if (number1 <= number2)
            System.out.printf("%d <= %d\n", number1, number2);
        if (number1 >= number2)
            System.out.printf("%d >= %d\n", number1, number2);
         */