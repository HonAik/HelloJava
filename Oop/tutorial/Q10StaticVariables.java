package tutorial;
/*Write a Java program to create a class called "Counter" with a static variable count. 
Implement a constructor that increments count every time an object is created. 
Print the value of count after creating several objects. */

class Counter{
    static int count = 0;// the object shares the same variable as static,which means this variable belongs to class
    
    public Counter(){
        count++;//每创造一次就+1次
    }
}

public class Q10StaticVariables {
    public static void main(String[] args) {
        //create 3 object
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("The count number is " + Counter.count);


    }
    
}
