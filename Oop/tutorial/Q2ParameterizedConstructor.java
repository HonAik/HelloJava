package tutorial;
/*Write a Java program to create a class called Dog with instance variables name and color. 
Implement a parameterized constructor that takes name and color as parameters and 
initializes the instance variables. Print the values of the variables. */

class Dog{
    // this time try private access modifier
    private String name;
    private String color;

    // get has return type but set has void
    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setColor(String color){
        this.color = color;
    }

    // for the question:parameterized constructor
    /*
    public Dog(String name, String color){
        this.name = name;
        this.color = color;
    } // private still can use constructor because same class.
    */ 
}

public class Q2ParameterizedConstructor{
    public static void main(String[] args) {
        //Dog myDog1 = new Dog("Jack","Red"); wrong because we dont have constrcutor 
        Dog myDog1 = new Dog();
        myDog1.setName("Jacky");
        myDog1.setColor("White");
        System.out.println("My Dog name is "+myDog1.getName()+ "\n"+ 
                            "My Dog color is "+ myDog1.getColor()  ); // myDog1.name = error!
        /*
        For question:
        Dog myDog2 = new Dog("Jacky","white");
        System.out.println(myDog2.name + myDog2.color);

        */
    }
}