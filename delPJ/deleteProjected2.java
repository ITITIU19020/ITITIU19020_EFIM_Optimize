import java.io.*;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;

public class deleteProjected2 {
    public static void main(String[] args) {

        try {
          // create a new file object
          File directory = new File("C:\\\\Users\\\\co Loan\\\\Desktop\\\\ITITIU19020\\\\Main\\\\TopK_Optimized_On_Massive_Data_Final_Thesis_ITITIU19020_Ha_Minh_Khoa\\\\New\\\\spmf\\\\ca\\\\pfv\\\\spmf\\\\projectedDB");
    
          // list all the files in an array
          File[] files = directory.listFiles();
    
          // delete each file from the directory
          for(File file : files) {
            System.out.println(file + " deleted.");
            file.delete();
          }
    
          // delete the directory
          if(directory.delete()) {
            System.out.println("Directory Deleted");
          }
          else {
            System.out.println("Directory not Found");
          }
    
        } catch (Exception e) {
          e.getStackTrace();
        }
      }
    

    
}
