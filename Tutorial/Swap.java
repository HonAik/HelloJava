package Tutorial;
import java.util.Scanner;
//Write a Java program to swap two variables.

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a word1");
        String word1 = sc.nextLine();
        System.out.println("Input a word2");
        String word2 = sc.nextLine();

        String a = word1;
        word1 = word2;
        word2 = a;
        System.out.println("Word1="+word1);
        System.out.println("word2="+word2);
        //如果用int也是这个方法!
    }
}
