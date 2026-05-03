package files;

import java.io.File;   

public class DeleteFile {
    public static void main(String[] args) {
        File myfile = new File("MyFile.txt");
        if(myfile.delete()){
            System.out.println("Delete the file: "+ myfile.getName());
            System.out.println("Delete successfully");
        }else{
            System.out.println("Delete failed");
        }
    }
}
