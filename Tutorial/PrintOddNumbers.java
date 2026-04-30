package Tutorial;
/*
Write a Java program to print odd numbers from 1 to 99. Prints one number per line.
Sample Output:

1                                                                      
3                                                                      
5                                                                      
7                                                                      
9                                                                      
11                                                                     
....                                                                     
                                                                    
91                                                                     
93                                                                     
95                                                                     
97                                                                     
99 
*/

public class PrintOddNumbers {
    public static void main(String[] args) {

        for(int i=0;i<=99;i++){
            int n = 1;
            n +=i;
            if(n%2!=0){
                System.out.println(n);
            }
        }
    }

}
/*
 // Iterate through numbers from 1 to 99
        for (int i = 1; i < 100; i++) {
            // Check if the number is odd
            if (i % 2 != 0) {
                // Print the odd number
                System.out.println(i);
                
*/