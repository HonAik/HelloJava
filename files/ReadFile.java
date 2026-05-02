package files;

import java.io.File;
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
    public static void main(String[] args) {

        File myfile = new File("MyFile.txt");

        try(Scanner sc = new Scanner(myfile)){ // try-with-resources: Scanner will be closed automatically
            
            while(sc.hasNextLine()){//hasNextLine() checks whether there is another line to read in the file
                String data = sc.nextLine();// nextLine() reads the current line and moves the cursor to the next line
                System.out.println(data);
            }
            //why used while instead of if?
            // if only checks once, so it can only read one line
            // while keeps checking until there is no more line left

        }catch(FileNotFoundException e){
            System.out.println("something is wrong");
            e.printStackTrace();
        }
    }
    
}
