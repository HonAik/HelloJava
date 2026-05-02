package files;
//to get more information about a file, use any of the File methods:

import java.io.File;

public class GetFileInformation {
    public static void main(String[] args) {
        File myfile = new File("MyFile.txt");
        if(myfile.exists()){
            System.out.println("File name: "+ myfile.getName());
            System.out.println("Absolute path: " + myfile.getAbsolutePath());
            System.out.println("Writeable: " + myfile.canWrite());
            System.out.println("Readable " + myfile.canRead());
            System.out.println("File size in bytes " + myfile.length());
        }else{
            System.out.println("File is not exist!");
        }
    }
    
}
