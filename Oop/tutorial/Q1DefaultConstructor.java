package tutorial;

/* 
Write a Java program to create a class called "Cat" with instance variables name and age. 
Implement a default constructor that initializes the name to "Unknown" and the age to 0. Print the values of the variables.
package tutorial;
*/

class Cat{
    String name;
    int age;
    
    public Cat(String name,int age){ // cannot put void for constructor
        this.name = name;
        this.age = age;
    }

    public Cat(){// for null, dont put parameter inside
        this("Unknown",0);//this is contain constructor chaining ,which means called another construstor by a constructor
    }
}

public class Q1DefaultConstructor {
    public static void main(String[] args) {
        Cat mycat1 = new Cat("Lily",20);
        Cat mycat2 = new Cat();
        System.out.println(mycat1.name+" "+ mycat1.age);
        System.out.println(mycat2.name+" "+ mycat2.age);

    }
}
