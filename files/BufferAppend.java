package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferAppend {
    public static void main(String[] args) {
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("Brfile.txt", true))){
            bw.newLine(); // go to the next line 
            bw.write("This is the line for appended text");
            System.out.println("The text is write correctly");

        }catch(IOException e){
            System.out.println("Some problem is here");
        }
    }
    
}
