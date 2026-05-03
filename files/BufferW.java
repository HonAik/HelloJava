package files;
//Try bufferwriter, it used for larger text and use less memory to read all the text.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferW {
    public static void main(String[] args) {
        //use try-with-resources 
        try(BufferedWriter br = new BufferedWriter(new FileWriter("Brfile.txt"))){
            br.write("This is the first line.");
            br.newLine();//add line break
            br.write("This is the second line");
            System.out.println("successfully write to the file");
        }catch(IOException e){
            System.out.println("Something is wrong here");
        }
    }
}
