// about inheritance 继承
//superclass can inherite attributes and methods to subclass
class Super{
    protected int x =10;// attribute
    // protected可写可不写，写的好处是只允许subclass用，extends 常搭配 protected

    public void info(){// methods
        System.out.println("Hi! This is inheritance!");
    }
}

public class Inheritance extends Super{
     int y =10;
    public static void main(String[] args) {
        
        //create a object calls hi1
        Inheritance hi1 = new Inheritance();//因为之后会用到y,也属于subclass所以要用y来create object
        //因为extend，所以不需要create super的obj就可以用

        //call info()
        hi1.info();

        //Display the value of y (from the Inheritance class) and the value of x from the Super class
        System.out.println(hi1.x + " " + hi1.y);

    }
}

//about final keyword，if u dont want a class being inherited, use final:
//final class One{}
//class Two extends One{} > ERROR!