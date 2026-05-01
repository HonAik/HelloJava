package files;

import java.io.FileWriter;
import java.io.IOException;

//Write To a File with try-with-resources

public class WriteFile2 {

    public static void main(String[] args) {
        // FileWriter will be closed automatically here

        try(FileWriter myWriter2 = new FileWriter("myFile.txt")){
            myWriter2.write("Hi, this is another method for writer to the file");
            System.out.println("Successfully wrote to the text ");
        }catch(IOException e ){
            System.out.println("something wrongs here");
            e.printStackTrace();
        }
    }
    
}
