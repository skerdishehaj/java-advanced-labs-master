package lab1.files.ush2;

import java.io.File;

/**
 * Create a program that lists all files in a specified directory. Include both files and subdirectories.
 */
public class PrintDirectoryContent {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\skerd\\Desktop\\Master Profesional\\Java Advanced\\Labs\\src\\lab1\\assets";
        printDierctoryContent(directoryPath);
    }

    public static void printDierctoryContent(String directoryPath) {
        File file = new File(directoryPath);
        if (!file.exists() || !file.isDirectory()) {
            System.out.println("The path is not a directory or does not exist");
            return;
        }
        String[] files = file.list();
        for (String f : files) {
            System.out.println(f);
        }
    }
}
