package lab1.files.ush1;

import java.io.File;

/**
 * Write a Java program that prints the name, absolute path, and size of a given file.
 */
public class FileInfo {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\skerd\\Desktop\\Master Profesional\\Java Advanced\\Labs\\src\\lab1\\assets\\testDir1\\file1.txt";
        getFileInfo(filePath);
    }
    public static void getFileInfo (String filePath) {
        File file = new File(filePath);
        if(!file.exists() || !file.isFile()) {
            System.out.println("File nuk ekziston");
            return;
        }
        System.out.println("Emri i file: " + file.getName());
        System.out.println("Path: " + file.getAbsolutePath());
        System.out.println("Madhesia: " + file.length() + " bytes");
    }
}
