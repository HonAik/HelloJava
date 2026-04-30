package Tutorial;
import java.util.Scanner;

public class findsecondbig {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 5 numbers");
        int [] arr = new int[5];

        //input
        for(int i = 0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int big=arr[0];
        int sec=Integer.MIN_VALUE;//保证每个号码都是最小的

        //find the numbers
        for(int nums : arr){
            if(big<nums){
                sec=big;//把第二大放在这里（不是最后的答案）：比如59748，前面5和9会变成sec跟9，但最终答案不是5
                big=nums;//biggest
            }
            if(nums<big && nums>sec){
                sec=nums;//second bigger
            }
        }

        System.out.println("The biggest number is : "+ big);
        System.out.println("The second bigger number is : "+ sec);
    }

}
