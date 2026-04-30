//关于abstract
//让父类不能创建对象，意义在于父类大多是概念比如animals，避免创造没有意义的obj
//abstract有inheritance + polymorphism （强制子类实现 + 支持多态使用）
//abstract = “不能直接用的模板 + 必须被子类完成 + 用来做多态”

abstract class Animals{
    //创造一个abstract method（没有body）
    // abstract method 的本质是：我只规定“必须做这件事”，但不说“怎么做”
    public abstract void sound();

    public void info(){
        System.out.println("Hi,I am an animal");
    }
}

class Cat extends Animals{
    public void sound(){
        System.out.println("Meow Meow");
    }
}

public class AbstractEx {
  public static void main(String[] args) {
    
    Cat cat1 = new Cat();
    cat1.sound();
    cat1.info();
    
  }
}
