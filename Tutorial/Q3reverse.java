package Tutorial;
import java.util.Scanner;

public class Q3reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        int a = sc.nextInt();

        while(a>0){
            int Num = a%10;
            a = a/10; 
            System.out.print(Num);
        }

    }

}
