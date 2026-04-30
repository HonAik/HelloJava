package Tutorial;
import java.util.Scanner;

public class recursionfor {

    //factorial function
    static int fact(int a){
        if(a==0){//不写1是因为如果用户输入0会error
            return 1;
        }
        return a*fact(a-1);        
    } 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num = sc.nextInt();
        System.out.println(fact(num));

    } 

}
