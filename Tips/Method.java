package Tips;
import java.util.logging.MemoryHandler;

public class Method {
public static void main(String[] args) {
    //length(),用来算string的长度
    String x1 = "asnjwdhadbksjfuaywbhdbjdsuyfew";
    System.out.println("The total length of x1 is:"+ x1.length());

    //toUpperCase(),把string全部字变大写
    //toLowerCase(),把string全部字变小写
    String x2= "HIAhdiahSHAKYDG";
    System.out.println("The upper case of this string is:"+ x2.toUpperCase());
    System.out.println("The upper case of this string is:"+ x2.toLowerCase());

    //indexOf(),用字找位置,ATTENTION:string的value都是从0开始，且包括whitespaces
    String x3= "Hello,guys! My name is Reynolds";
    System.out.println("The position of 'my' is"+ x3.indexOf("My"));

    //CharAt(),用位置找字
    System.out.println("The character in position 10 is:"+ x3.charAt(10));

    //equals(),来compare两个string的内容是不是一样。
    String x4="Hello";
    String x5="Hello";
    String x6="Halo"; 

    System.out.println(x4.equals(x5));//true
    System.out.println(x4.equals(x6));//false

    //trim(),用来移除string里面value前面和后面的white spaces

    //concat(),用来连接strings，concentation,use + operator more clear.
    //Attention:When using +, Numbers are added. Strings are concatenated.
    System.out.println(x4.concat(x5).concat(x6));//Result:HelloHelloHalo

    //Special Characters:
    /*
    Escape character      Result	    Description
        \'	                '	        Single quote
        \"	                "	        Double quote
        \\	                \	        Backslash
        \n	                            New Line	
        \t	                            Tab	
        \b	                            Backspace	
        \r	                            Carriage Return	
        \f	                            Form Feed
    */

    //Math method!
    //Math.max(),to find the maximun value of x and y
    System.out.println(Math.max(10,100));//100

    //Math.min(),to find minimum value of x and y;
    System.out.println(Math.min(10,100));//10

    //Math.sqrt();to find the quare root of x;
    System.out.println(Math.sqrt(16));//4.0

    //Math.abs(),把value从负变正，return positive number;
    System.out.println(Math.abs(-1.37));//1.37

    //Math.pow(x,y),把y变成x的指数(power)
    System.out.println(Math.pow(4, 3));//4^3=64(return a double)

    //Math.round(),四舍五入进位,3.4变3，3.7变4
    //Math.ceil()，向上取整,3.1可以变4（新的integer会大过或等于原本）
    //Math.floor()，向下取整，3.9变成3（新的integer会小过或等于原本）

    //Math.random(),会给1个来自0.0（包括）到1.0（不包括）里面的随机数。
    System.out.println(Math.random());//小于1.0且大于等于0.0的数
    
    //1) If want to find a integer random number from 0 to 100
    System.out.println((int)(Math.random()*101));
    //Attention:选101虽然出现100.x的情况 但是int会把小数去掉！

    //break,停止
    for(int num1=1; num1 <10; num1 ++){
        System.out.println(num1);//如果这个statement在if下面则只会print1，2，3
        if(num1 == 4 ){
            break;//到4后就会停止
        }
    }

    //continue，跳过某个loop
    for(int num2 = 0; num2 <5; num2++){
        if(num2==2){
            continue;
        }
        System.out.println(num2);
    }






}
}
