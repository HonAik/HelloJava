package files;

import java.io.FileWriter;
import java.io.IOException;

public class AppendtoFile {
    public static void main(String[] args) {
        // true = append mode
        try(FileWriter myWriter3 = new FileWriter("MyFile.txt",true)){
            myWriter3.write("\n Append text is here");
            System.out.println("Successfully wrote to the file");
        }catch(IOException e){
            System.out.println("something is wrong");
            e.printStackTrace();
        }
    }
    
}
