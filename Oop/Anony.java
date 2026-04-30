// About Anonymous 
// 
interface Test{
    public void test1();
}

public class Anony{
    public static void main(String[] args) {
        Test run1 = new Test(){
            public void test1(){
                System.out.println("hi");
            }
        };
        run1.test1();
    }
}