package tutorial;
/*
Write a Java program to create a class called Rectangle with instance variables length and width. 
Implement a parameterized constructor and a copy constructor that initializes a new object 
using the values of an existing object. Print the values of the variables. */
class Rectangle{
    int length;
    int width;

    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(Rectangle other){//copy constructor
        this.length = other.length;
        this.width = other.width;
    }
    
}

public class Q5CopyConstructor {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 6);
        Rectangle r2 = new Rectangle(r1);
        System.out.println("R1.length = " + r1.length + " R1.width = " + r1.width);
        System.out.println("R2.length = " + r2.length + " R2.width = " + r2.width);
    }
    
}
