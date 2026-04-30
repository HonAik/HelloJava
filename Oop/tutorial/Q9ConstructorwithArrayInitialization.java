package tutorial;
/*Write a Java program to create a class called Classroom with instance variables className and students (an array of strings).
 Implement a parameterized constructor that initializes these variables. 
 Print the values of the variables. */

class Classroom{
    String className;
    String[] student;

    public Classroom(String className,String[] student){
        this.className = className;
        this.student = student;
    }
}
public class Q9ConstructorwithArrayInitialization {
    public static void main(String[] args) {
        //array:
        String[] student = {"Alex", "Bob","Calvin","Danny"};//用','而不是'+', 不然会全部和在一起

        Classroom c1 = new Classroom("C1", student);//把initial好的student array 放这里
        System.out.println("Class Name is "+ c1.className);

        System.out.println("Student name are:");

        for(int i =0; i<c1.student.length; i++){ 
            System.out.println(c1.student[i]);//如果是直接写student[i]，it does not print values of the variables in the class,just in main.
        }
    }
}