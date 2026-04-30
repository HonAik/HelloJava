package Tips;
public class Hello {
    public static void main(String[] args) {

        System.out.println("Hi");//semicolon is essential

        String A ="Jack";
        System.out.println("Hello!"+ A);

        System.out.print("Line");
        System.out.print(" will not go down ");// the different of print() and println() 

        System.out.println(566);//not need double quotes

        System.out.println(3+1);
        System.out.println(3*4);
        System.out.println(9/3);

        //we are comment and /* */ we are multi-lines comments.

        /* Variables:
        String - stores text, such as "Hello". String values are surrounded by double quotes
        int - stores integers (whole numbers), without decimals, such as 123 or -123
        float - stores floating point numbers, with decimals, such as 19.99 or -19.99
        char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
        boolean - stores values with two states: true or false
        */

        String a = "My name is Dorcas";
        a = "My name is Jessica";
        System.out.println(a);// a change to Jessica

        int num1;
        num1 = 30;
        System.out.println(num1);

        final float myNum1= 12.938f;//float 要加f
        System.out.println(myNum1); //final让variable不会改变，这叫constant

        int x1= 3;
        int x2= 5;
        System.out.println("mix:"+x1+x2);//no parentheses will only add to the string，会变成35
        System.out.println("add:"+(x1+x2));// parenthesis makes sure calculate first，会变成8

        int y1=3,y2=5,y3=7;
        System.out.println("Total:"+(y1+y2+y3));//如果是同个号码则可以：y1=y2=y3=7;

        char test1=65,test2=66,test3=67;
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        //char既可以用当个character也可以用在ASCII table，从结果看会是A,B,C

        var a1= "Hi";
        System.out.println(a1);//var 是全部datatype都可以用

        //关于primitive和non-primitive
        /*Primitive data types store actual values directly, such as int, double, and char.
        They are simple, fixed-size, and not objects.
        Non-primitive data types store references to objects rather than the actual data.
        Examples include String, arrays, and classes.
        These types are stored in heap memory and can use methods. */
        
        int abc= 5;
        double abc1= abc;
        System.out.println(abc1);
        //因为double比int bigger,so the number will not change: byte -> short -> char -> int -> long -> float -> double

        double newN= 8.555;
        int newN1 = (int) newN;//要在（）里面写换的variable
        System.out.println(newN1);
        //反之，因为int比double小，所以会有data loss

        int k=3;
        k+=2;//k+=2 == k=k+2
        System.out.println(k);

        }

}


