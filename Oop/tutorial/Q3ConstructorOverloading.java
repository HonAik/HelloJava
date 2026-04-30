package tutorial;
/*
Write a Java program to create a class called "Book" with instance variables title, author, 
and price. Implement a default constructor and two parameterized constructors:

One constructor takes title and author as parameters.
The other constructor takes title, author, and price as parameters.
Print the values of the variables for each constructor.
 */
class Book{
    //can use private as access modifier 
    String title;
    String author;
    int price;

    public Book(){
        this("null","null",0);
    }

    public Book(String title, String author){
        this.title=title;
        this.author=author;
        this.price=0;
    }

    public Book(String title, String author, int price){
        this.title=title;
        this.author=author;
        this.price= price;
    }
}   

public class Q3ConstructorOverloading {
   public static void main(String[] args) {
    
    Book book1 = new Book();
    Book book2 = new Book("Home","Jack");
    Book book3 = new Book("HAHAHAH","AHA",100);
    System.out.println("Book 1 info:" + "\n"+ "Book 1 title: "+ book1.title + "\n"+ "Book 1 author: "+ book1.author + "\n"+ "Book 1 price: " + book1.price);
    System.out.println("Book 2 info:" + "\n"+ "Book 2 title: "+ book2.title + "\n"+ "Book 2 author: "+ book2.author + "\n"+ "Book 2 price: " + book2.price);
    System.out.println("Book 3 info:" + "\n"+ "Book 3 title: "+ book3.title + "\n"+ "Book 3 author: "+ book3.author + "\n"+ "Book 3 price: " + book3.price);
   }

}