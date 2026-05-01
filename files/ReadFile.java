package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {

        File myfile = new File("MyFile.txt");

        try(Scanner sc = new Scanner(myfile)){
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
        }catch(FileNotFoundException e){
            System.out.println("something is wrong");
            e.printStackTrace();
        }
    }
    
}
