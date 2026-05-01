package files;

import java.io.File; //import file class
import java.io.IOException; // import IO Exception to handle error

//1. create a file : need to create a file object, File file1 = new File("File name");
//use try...catch because it throws an IO Exception 

public class CreateFile{
    public static void main(String[] args) {

        try{
            //Create a file object
            File myfile = new File("MyFile.txt");
            //File myObj = new File("C:\\Users\\MyName\\filename.txt"); it can be this way also 

            //Try to create a file 
            if(myfile.createNewFile()){
            
            // createNewFile is a boolean type, 
            // Returns true if file is created successfully,
            // Returns false if file already exists

                System.out.println("File is created succesfully: "+ myfile.getName());
            }else{
                System.out.println("File is created already!");
            }

        }catch(IOException e ){
            System.out.println("Something is wrong here");
            e.printStackTrace(); // Print error details

        }        
    }
}