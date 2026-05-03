package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferR {
    public static void main(String[] args) {
        try(BufferedReader bw = new BufferedReader(new FileReader("Brfile.txt"))){
            String line;
            while((line=bw.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("Error here");
        }
    }
    
}
