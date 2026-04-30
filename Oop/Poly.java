//关于Polymorphism， it occurs when we have many classes that are related to each other by inheritance.
// Inheritance lets us inherit attributes and methods from another class. 
// Polymorphism uses those methods to perform different tasks. 
// This allows us to perform a single action in different ways.
//同一个父类 reference，可以指向不同子类对象

class Animals{
    public void sound(){
        System.out.println("This animals want to say smt.");
    }
}

class Dog extends Animals{
    public void sound(){
        System.out.println("This dog is barking");
    }
}

public class Poly {
    public static void main(String[] args) {
    Animals a = new Animals();
    Animals b = new Dog();//reference type 是父类，但 object 可以是任何子类
    a.sound();
    b.sound();
    }
    
}
