package Tutorial;

public class Q7multiplicationtable {

    public static void main(String[] args) {
        //multiplication
        for(int i=1;i<=12;i++){
            for(int a=1;a<=12;a++){
                int num1 =i;//可以省略
                num1 *= a; //可以省略
                System.out.println(i + " x " + a + "=" + num1);//num1 可以写成(i*a)
            }
        }
    }
}
