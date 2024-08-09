import java.io.*;

public class deleteProjected {
    public static void main(String[] args) {
        String folderPath = "C:\\Users\\co Loan\\Desktop\\ITITIU19020\\Main\\TopK_Optimized_On_Massive_Data_Final_Thesis_ITITIU19020_Ha_Minh_Khoa_UseThis_THIS_ONE\\New\\spmf\\ca\\pfv\\spmf\\projectedDB";
        File folderFile = new File(folderPath);
        deleteFolder(folderFile);
    }

    // Delete projectedDB
    public static void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    deleteFolder(f);
                } else {
                    f.delete();
                }
            }
        }
    }
}
