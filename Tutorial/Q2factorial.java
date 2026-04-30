//输入一个整数 n
//输出 n!
package Tutorial;
import java.util.Scanner;

public class Q2factorial {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Input:");
        int b = a.nextInt();
        int fact = 1;
        for(int i=1;i<=b;i++){
            fact = fact * i;
        }
        System.out.println("Output:"+fact);
    }

}
