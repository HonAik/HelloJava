package Tips;

public class methodClass {
    /*
    A method is a block of code which only runs when it is called.
    You can pass data, known as parameters, into a method.
    Methods are used to perform certain actions, and they are also known as functions.
    Why use methods? To reuse code: define the code once, and use it many times.
    */
    //create一个自己的method()；
    static void myMethod(){
    //static和void先简单理解成：
    //static：the method belongs to the Main class and not an object of the Main class。
    //void:this method does not have a return value.
    //听不懂没关系，之后你就会懂了！！！先知道method要写static和void；
        System.out.println("I get executed!");
    }
    
    //parameter参数，Information can be passed to methods as a parameter. Parameters act as variables inside the method.
    //example
    static void name(String name){
        System.out.println("My name is "+ name);
    }
    //parameter 也可以很多个 比如：
    static void inf(String name, int age){
        System.out.println("My name is "+ name +" and my age is "+ age);
    }

    //关于return！！！
    //我们一直用void在我们的method，不过要用return的画不可以放void了 要用primitive data type：int，char。。。
    //为什么要用return呢？
    //重点来了：
    // println 是给“人”看的
    //return 是给“程序”用的
    //println只是用于显示成果但程序自己没有办法得到并使用结果
    //return可以把结果存起来后续给自己或其他method使用，灵活性大，有 return 的 method 像“可重复利用的工具”！

    //举个例子：
    static int add(int x, int y){
        return x+y;
    }

    //Example：
    //Practical Example
    //Here is a simple and fun "game example" using a method that returns a value, 
    // to show the double of the numbers 1 through 5 (using a for loop):
    static int gameExm(int x){
        return x*2;
    }

    //Overloading过载
    //Overloading 让你用一个名字表达一个行为，而不是为每种数据类型发明新名字。
    //比如你的输入可能会有int，double，long等等，若每次打要执行时写addint(),adddouble()会很麻烦
    //overloading可以让使用method时直接打最基础的add()，而编译器在编译时根据你给的参数决定 不需要手动打
    //Example
    static double add(double x, double y){
        return x+y;
    }

    //scope,{}用curly bracket可以把variable的范围控制在里面，比如：
    static void scope(){
        {
            int x = 100;
            System.out.println(x);
        }
        //如果在这里System.out.println(x);会有error。
        {
            int x = 50;
            System.out.println(x);// int x 可以出现两次
        }
    }

    //recursion！！！归递 ，让程序自己去用method，
    //recursion 有两个条件：
    //1.需要有一个停止条件
    //2.需要自己调节自己
    //example：Use recursion to add all numbers from 5 to 10 (5+6+7+8+9+10):
    public static int addall(int allnum){
       if(allnum == 10){
         return 10;//停止条件，allnum=10的时候 return10
       }
        return allnum+addall(allnum+1);//自己调节自己
    }

    //Calculate Factorial with Recursion
    //This example uses a recursive method to calculate the factorial of 5:
    static int fact(int factn){
        if (factn==0){
            return 1;//0!=1
        }
        return factn*fact(factn-1);
    }

    public static void main(String[] args) {
        myMethod();//mymethod里面的code就会被执行！
        name("Jack");
        inf("Delvin",20);
        inf("Liam",31);
        System.out.println(add(3,6));
        System.out.println(add(3,6)*10);//如果用print就无法直接*10，return可以灵活应对！

        //Pratical Example for Return:
        for(int i=1;i<=5;i++){
            System.out.println(gameExm(i));

        //example for overload
        System.out.println(add(3,5)); //程序去 int add（）
        System.out.println(add(3.0,5.0)); //程序去double add()
        }

        //example for recursion:
        int result = addall(5);
        System.out.println(result);

        //Factorial recursion:
        System.out.println("The factorial number of 5 is "+fact(5));


    }
}
