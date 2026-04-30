package Tutorial;
import java.util.Scanner;

public class fibonacci {

    /* 
    static int fib(int a){
        if(a==1){
            return 1;
        }else if(a==0){
            return 0;
        }
        return fib(a-1)+fib(a-2);//O(2^n)
    }*/

        static int fib(int a){
            int b=0;
            int c=1;
            if(a<=1){
                return a;
            }
            for(int i=2;i<=a;i++){

                int temp =b+c;
                b=c;
                c=temp;
            }
            return c;//O(n)
        }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input a numbers");
        int num = sc.nextInt();

        System.out.println("Output: "+ fib(num));
    }

}
