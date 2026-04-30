package Tips;
public class BooLean {
public static void main(String[] args) {
    //boolean returns true or false，use for builds logic to make dicision

    int x1= 10;
    int x2= 40;
    System.out.println(x2>x1);//true
    System.out.println(x1>x2);//false
    System.out.println(x1==10);//true

    //boolean also can store results.
    boolean booL1= x1<x2;
    System.out.println(booL1);//true

    //If/If-else/Switch/whileloop/For 
    /*
    Less than: a < b
    Less than or equal to: a <= b
    Greater than: a > b
    Greater than or equal to: a >= b
    Equal to: a == b
    Not equal to: a != b
     */
    
    if(10>9){
        System.out.println("10 > 9");
    }

    int a1=100;
    if(a1<100){
        System.out.println("a1 is smaller than 100.");
    }else if(a1>100){
        System.out.println("a1 is greater than 100.");
    }else{
        System.out.println("a1 is 100");
    }

    //Attention:short hand if...else
    //variable = (condition) ? expressionTrue : expressionFalse;

    if(a1>100){
        System.out.println("a1 is greater than 100");
    }else{
        System.out.println("a1 is smaller or same as 100");
    }

    String result = (a1>100) ? "a1 is greater than 100" : "a1 is smaller or same as 100";
    System.out.println(result);

    System.out.println((a1>100) ? "a1 is greater than 100" : "a1 is smaller or same as 100");
    //the results are same.

    String result1 = (a1>100) ? "a1 is greater than 100" 
                    : (a1<100)?"a1 is smaller or same as 100"
                    : "a1 is 100";//多个condition的时候
    System.out.println(result1);

    //Logical Operators
    /*
    && (AND) - all conditions must be true
    || (OR) - at least one condition must be true
    ! (NOT) - reverses a condition (true = false, false = true)
 */

    //For example, to get access to a system, there are specific requirements:
    //You must be logged in, and then you either need to be an admin, or have a high security clearance (level 1 or 2):

    boolean logIn = true;
    boolean admin = false;
    int securityClearance = 3;

    if(logIn){
        if(admin || securityClearance <=2 ){ //the highest is 1 
            System.out.println("Access successful.");
        }else{
            System.out.println("Access denied.");
        }

    }else{
        System.out.println("Failed to Log in.");
    }

    //也可以写成
    if(logIn && (admin || securityClearance <=2)){
        System.out.println("Access successful.");
    }else{
         System.out.println("Access denied.");
    }

    //switch，适合用在很多if。。。else情况
    int foodId=4;
    switch (foodId) {
        case 1:
            System.out.println("Food is Pizza");
            break;//没有break的话会直接print下一个line。
        case 2:
            System.out.println("Food is Burger");
            break;
        case 3:
            System.out.println("Food is Sushi");
            break;
        case 4:
            System.out.println("Food is noodle");
            break;
        default:
            System.out.println("Enter the correct id");
            break;
    }

    //While loop!
    //用于有重复的情况

    //Countdown Example
    //You can also use a while loop to count down. This example counts from 3 to 1, and then prints "Happy New Year!!" at the end:
    int i = 3;
    
    while (i>0) {
        System.out.println(i);
        i--;
    }
    System.out.println("Happy New Years!!");

    //do loop,在确定有无达到condition之前都会run一次
    //do{}while();

    int doNum1 = 1;

    do{
        System.out.println(doNum1);
        doNum1 ++;
    }while(doNum1<0);//only execute once time.

    //for loop,用在你知道会loop多少次
    //for(statement 1; statement 2; statement 3){}
    
    for(int i2 = 3; i2 < 5; i2++){
        System.out.println(i2);
    }

    //create a program that only print even values between 0 and 10:
    for(int ev= 0;ev<=10;ev++){
        if(ev%2==0){
            System.out.println(ev);
        };
    }
    //另外一个方法：
    for(int ev1=0;ev1<=10;ev1=ev1+2){
        System.out.println(ev1);
    }

    //create a program that prints the multiplication table for a specified number:
    //假设做一个3的乘法表
    int number1 = 3;

    for(int ev2=1;ev2<=12;ev2++){
        System.out.println(number1 + "x" + ev2 + "=" + (number1*ev2));
    }

    //Use a loop to calculate the factorial(n!) of a given number:
    // n! = n*(n-1)!

int n = 5;
int fact = 1;

for(int ev3 = 1; ev3 <=n;ev3++){
    fact = fact *ev3;
}

System.out.println("The factorial of 5 is :"+ fact);




}


}
