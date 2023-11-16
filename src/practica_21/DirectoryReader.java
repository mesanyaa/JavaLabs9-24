package practica_21;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryReader {
    public static List<String> readDirectory(String directoryPath) {
        List<String> fileList = new ArrayList<>();
        File directory = new File(directoryPath);
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (int i = 0; i < Math.min(5, files.length); i++) {
                    fileList.add(files[i].getName());
                }
            }
        }
        return fileList;
    }

    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\Sasha\\Labs";
        List<String> files = readDirectory(directoryPath);
        for (String file : files) {
            System.out.println(file);
        }
    }
}
