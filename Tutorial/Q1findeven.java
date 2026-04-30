//题目 1：打印 1–100 中的偶数
//while or for
package Tutorial;

public class Q1findeven {
    public static void main(String[] args) {
        for(int i = 0;i<=100;i++){
            if(i%2 == 0)
                System.out.println(i);
        }
    }
}
