import java.io.*;

public class deleteProjected {
    public static void main(String[] args) {
        String folderPath = "New\\spmf\\ca\\pfv\\spmf\\projectedDB";
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
