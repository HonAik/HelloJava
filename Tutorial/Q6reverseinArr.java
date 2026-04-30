package Tutorial;
import java.util.Scanner;

public class Q6reverseinArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int [5];
        System.out.println("Input 5 numbers:");
        
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        
        for(int i = 0; i< arr.length/2;i++){
            int num1= arr[i];
            arr[i]= arr[arr.length-1-i];
            arr[arr.length-1-i]= num1 ;
        }

        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
