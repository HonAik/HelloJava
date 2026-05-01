package files;

import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException;

// use FileWriter together with its write() method to create and write some text into a file

public class WriteFile {
    public static void main(String[] args) {
        
        try{
            //need to create an object, why? because java is an oop languages, methods should be used by an object 
            FileWriter myWriter = new FileWriter("MyFile.txt");

            myWriter.write("I love Java but java is a crazy lover.... I am scary mama!!!");
            myWriter.close(); 
            // everytime use need to close it manually

            System.out.println("The text is successfully wrote to the file");

            }catch(IOException e){

            System.out.println("An error(s) is occured ");
            e.printStackTrace();
            
            }
        }
}
