//About interface
//interface 主要用于定义行为契约，里面可以包含方法声明，
// 也可以有 default/static/private 方法以及常量，但核心思想仍然是“定义规范，不强调实现”。
//An interface defines a contract (or a set of rules) for methods, 
// focusing on what methods should do, not how they are implemented.

interface Animals123{
    //只写method名字，不写内容，靠其他class去implement，原因：容易修护，Loose coupling
    public void sound1();
    public void sound2();
}

//创造一个class for implementation
class Pig implements Animals123{
    //Override 
    public void sound1(){
        System.out.println("Hi, I am an animal");
    }

    public void sound2(){
        System.out.println("OWOWOWO");
    }
}

public class Interface {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.sound1();
        myPig.sound2();
        
    }
    
}
